package br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles;

import br.edu.ufcg.computacao.eureca.backend.api.http.response.*;
import br.edu.ufcg.computacao.eureca.backend.constants.SystemConstants;
import br.edu.ufcg.computacao.eureca.backend.core.dao.DataAccessFacade;
import br.edu.ufcg.computacao.eureca.backend.core.models.*;
import br.edu.ufcg.computacao.eureca.backend.core.util.MetricsCalculator;
import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ScsvFilesDataAccessFacade implements DataAccessFacade {
    private final Logger LOGGER = Logger.getLogger(ScsvFilesDataAccessFacade.class);
    private MapsHolder mapsHolder;
    private IndexesHolder indexesHolder;

    public ScsvFilesDataAccessFacade(String mapsListFile) {
        this.mapsHolder = new MapsHolder(mapsListFile);
        this.indexesHolder = new IndexesHolder(this.mapsHolder);
        setAttemptedCredits();
    }

    @Override
    public Collection<Student> getActives(String from, String to) {
        return getFilteredStudents(StudentClassification.ACTIVE, from, to);
    }

    @Override
    public Collection<Student> getAlumni(String from, String to) {
        return getFilteredStudents(StudentClassification.ALUMNUS, from, to);
    }

    @Override
    public Collection<Student> getDropouts(String from, String to) {
        return getFilteredStudents(StudentClassification.DROPOUT, from, to);
    }

    @Override
    public Collection<Student> getDelayed(String from, String to) {
        return this.getActives(from, to)
                .stream()
                .filter(item -> item.computeRiskClass().equals(RiskClass.AVERAGE) ||
                        item.computeRiskClass().equals(RiskClass.HIGH) ||
                        item.computeRiskClass().equals(RiskClass.UNFEASIBLE))
                .collect(Collectors.toSet());
    }

    @Override
    public Collection<ActivesPerTermSummary> getActivesPerTermSummary(String from, String to) {
        Collection<ActivesPerTermSummary> terms = new TreeSet<>();
        Map<String, Collection<CpfRegistrationKey>> index = indexesHolder.getActiveByAdmissionTerm();
        Map<CpfRegistrationKey, StudentData> studentsMap = mapsHolder.getMap("students");

        for (Map.Entry<String, Collection<CpfRegistrationKey>> entry : index.entrySet()) {
            String term = entry.getKey();
            if (term.compareTo(from) >= 0 && term.compareTo(to) <= 0) {
                RiskClassCountSummary riskClassCount = getRiskClassCountSummary(entry.getValue(), studentsMap);
                ActivesPerTermSummary termData = new ActivesPerTermSummary(term, riskClassCount);
                terms.add(termData);
            }
        }
        return terms;
    }

    @Override
    public Collection<AlumniPerTermSummary> getAlumniPerTermSummary(String from, String to) {
        Collection<AlumniPerTermSummary> terms = new TreeSet<>();
        Map<String, Collection<CpfRegistrationKey>> map = indexesHolder.getAlumniByGraduationTerm();
        Map<CpfRegistrationKey, StudentData> studentsMap = mapsHolder.getMap("students");
        for (Map.Entry<String, Collection<CpfRegistrationKey>> entry : map.entrySet()) {
            String term = entry.getKey();
            if (term.compareTo(from) >= 0 && term.compareTo(to) <= 0) {
                Collection<CpfRegistrationKey> studentIds = entry.getValue();
                int termAlumniCount = studentIds.size();
                double aggregateGPA = 0.0;
                double aggregateTermsCount = 0.0;
                double aggregateCost = 0.0;
                for (CpfRegistrationKey id : studentIds) {
                    StudentData alumnus = studentsMap.get(id);
                    aggregateGPA += alumnus.getGpa();
                    aggregateTermsCount += alumnus.getCompletedTerms();
                    aggregateCost += (MetricsCalculator.computeMetrics(alumnus).getCost());
                }

                double averageGPA = termAlumniCount == 0 ? 0.0 : Double.parseDouble(String.format("%.2f", aggregateGPA/termAlumniCount).replace(",", "."));
                double averageTermsCount = termAlumniCount == 0 ? 0.0 : Double.parseDouble(String.format("%.2f", aggregateTermsCount/termAlumniCount).replace(",", "."));
                double averageCost = termAlumniCount == 0 ? 0.0 : Double.parseDouble(String.format("%.2f", aggregateCost/termAlumniCount).replace(",", "."));

                AlumniPerTermSummary termData = new AlumniPerTermSummary(term, termAlumniCount,
                        averageGPA,
                        averageTermsCount,
                        averageCost
                );
                terms.add(termData);
            }
        }
        return terms;
    }

    @Override
    public Collection<DropoutPerTermSummary> getDropoutsPerTermSummary(String from, String to) {
        Collection<DropoutPerTermSummary> dropoutSummaryResponses = new TreeSet<>();
        Map<String, Collection<CpfRegistrationKey>> dropouts = this.indexesHolder.getDropoutByDropoutTerm();
        Map<CpfRegistrationKey, StudentData> studentsMap = this.mapsHolder.getMap("students");
        dropouts.forEach((k, v) -> {
            if (k.compareTo(from) >= 0 && k.compareTo(to) <= 0) {
                int dropoutsCount[] = new int[SystemConstants.DROPOUT_TYPES_COUNT];
                double aggregateTermsCount = 0.0;
                double aggregateCost = 0.0;
                for (CpfRegistrationKey id : v) {
                    StudentData dropout = studentsMap.get(id);
                    dropoutsCount[dropout.getStatusIndex()]++;
                    aggregateTermsCount += dropout.getCompletedTerms();
                    aggregateCost += (MetricsCalculator.computeMetrics(dropout).getCost());
                }
                DropoutReasonSummary dropoutReasonSummary = new DropoutReasonSummary(dropoutsCount);
                int size = v.size();
                double averageTerms = (size == 0 ? 0.0 : aggregateTermsCount/size);
                double averageCost = (size == 0 ? 0.0 : aggregateCost/size);
                dropoutSummaryResponses.add(new DropoutPerTermSummary(k, size, dropoutReasonSummary, averageTerms, averageCost));
            }
        });
        return dropoutSummaryResponses;
    }

    @Override
    public Collection<DelayedPerTermSummary> getDelayedPerTermSummary(String from, String to) {
        Collection<DelayedPerTermSummary> terms = new TreeSet<>();
        Map<String, Collection<CpfRegistrationKey>> index = indexesHolder.getActiveByAdmissionTerm();
        Map<CpfRegistrationKey, StudentData> studentsMap = mapsHolder.getMap("students");

        for (Map.Entry<String, Collection<CpfRegistrationKey>> entry : index.entrySet()) {
            String term = entry.getKey();
            if (term.compareTo(from) >= 0 && term.compareTo(to) <= 0) {
                Collection<Student> delayed = new TreeSet<>();
                entry.getValue().forEach(cpfRegistration -> {
                    StudentData studentData = studentsMap.get(cpfRegistration);
                    delayed.add(new Student(cpfRegistration, studentData));
                });
                MetricsSummary metricsSummary = MetricsCalculator.computeMetricsSummary(delayed);
                DelayedPerTermSummary termData = new DelayedPerTermSummary(term, metricsSummary);
                terms.add(termData);
            }
        }
        return terms;
    }

    @Override
    public Collection<AlumniDigestResponse> getAlumniPerStudentSummary(String from, String to) {
        String parsedFrom = "1" + from.substring(2,4) + from.substring(5,6) + "00000";
        String parsedTo = "1" + to.substring(2,4) + to.substring(5,6) + "99999";
        Collection<AlumniDigestResponse> alumniBasicData = new TreeSet<>();
        Collection<CpfRegistrationKey> alumni = this.indexesHolder.getAlumni();
        Map<CpfRegistrationKey, StudentData> studentsMap = this.mapsHolder.getMap("students");
        for (CpfRegistrationKey item : alumni) {
            if (new RegistrationKey(item.getRegistration()).compareTo(new RegistrationKey(parsedFrom)) >= 0 &&
                    new RegistrationKey(item.getRegistration()).compareTo(new RegistrationKey(parsedTo)) <= 0) {
                StudentData alumnus = studentsMap.get(item);
                AlumniDigestResponse basicData = new AlumniDigestResponse(item.getRegistration(), alumnus.getName(),
                        2, 1, alumnus.getAdmissionTerm(), alumnus.getStatusTerm());
                alumniBasicData.add(basicData);
            }
        }
        return alumniBasicData;
    }

    private void setAttemptedCredits() {
        Map<RegistrationKey, Integer> attemptsSummary = new HashMap<>();
        Map<RegistrationCodeTerm, EnrollmentData> enrollments = this.mapsHolder.getMap("enrollments");
        enrollments.forEach((k, v) -> {
            if (!v.getStatus().equals(SystemConstants.EM_CURSO)) {
                Integer currentCount = attemptsSummary.get(new RegistrationKey(k.getRegistration()));
                if (currentCount == null) {
                    currentCount = v.getCredits();
                } else {
                    currentCount += v.getCredits();
                }
                attemptsSummary.put(new RegistrationKey(k.getRegistration()), currentCount);
            }
        });
        attemptsSummary.forEach((k, v) -> {
            Student student = getStudent(k.getRegistration());
            if (student != null) {
                student.getStudentData().setAttemptedCredits(v.intValue());
                updateStudent(student);
            }
        });
    }

    @Override
    public Student getStudent(String registration) {
        Map<String, CpfRegistrationKey> registrationMap = this.indexesHolder.getRegistrationMap();
        Map<CpfRegistrationKey, StudentData> studentsMap = this.mapsHolder.getMap("students");
        CpfRegistrationKey key = registrationMap.get(registration);
        StudentData studentData = studentsMap.get(key);
        return new Student(key, studentData);
    }

    private void updateStudent(Student student) {
        Map<CpfRegistrationKey, StudentData> studentsMap = this.mapsHolder.getMap("students");
        studentsMap.replace(student.getId(), student.getStudentData());
    }

    private Collection<Student> getFilteredStudents(StudentClassification status, String from, String to) {
        Collection<Student> filteredStudents = new TreeSet<>();
        Collection<Student> allStudents = getAllStudentsByStatus(status);
        allStudents.forEach(item -> {
            String studentTerm = getGroupingTerm(status, item);
            if (studentTerm != null && studentTerm.compareTo(from) >= 0 && studentTerm.compareTo(to) <= 0) {
                filteredStudents.add(item);
            }
        });
        return filteredStudents;
    }

    private String getGroupingTerm(StudentClassification status, Student item) {
        switch(status) {
            case ALUMNUS:
            case DROPOUT:
                return item.getStudentData().getStatusTerm();
            case ACTIVE:
            case DELAYED:
            default:
                return item.getStudentData().getAdmissionTerm();
        }
    }

    private Collection<Student> getAllStudentsByStatus(StudentClassification status) {
        switch(status) {
            case ALUMNUS:
                return this.indexesHolder.getAllAlumni();
            case DROPOUT:
                return this.indexesHolder.getAllDropouts();
            case ACTIVE:
            case DELAYED:
            default:
                return this.indexesHolder.getAllActives();
        }
    }

    private RiskClassCountSummary getRiskClassCountSummary(Collection<CpfRegistrationKey> studentIds, Map<CpfRegistrationKey,
            StudentData> studentsMap) {
        int inaccurate = 0;
        int safe = 0;
        int low = 0;
        int average = 0;
        int high = 0;
        int unfeasible = 0;
        int notApplicable = 0;
        for (CpfRegistrationKey id : studentIds) {
            Student student = new Student(id, studentsMap.get(id));
            RiskClass riskClass = student.computeRiskClass();
            switch (riskClass) {
                case INACCURATE:
                    inaccurate++;
                    break;
                case SAFE:
                    safe++;
                    break;
                case LOW:
                    low++;
                    break;
                case AVERAGE:
                    average++;
                    break;
                case HIGH:
                    high++;
                    break;
                case UNFEASIBLE:
                    unfeasible++;
                    break;
                case NOT_APPLICABLE:
                default:
                    notApplicable++;
                    break;
            }
        }
        RiskClassCountSummary riskClassCount = new
                RiskClassCountSummary(inaccurate, safe, low, average, high, unfeasible, notApplicable);
        return riskClassCount;
    }
}
