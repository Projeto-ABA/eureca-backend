package br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles;

import br.edu.ufcg.computacao.eureca.backend.constants.Messages;
import br.edu.ufcg.computacao.eureca.backend.core.models.CpfRegistrationKey;
import br.edu.ufcg.computacao.eureca.backend.core.models.Student;
import br.edu.ufcg.computacao.eureca.backend.core.models.StudentData;
import org.apache.log4j.Logger;

import java.util.*;

public class IndexesHolder {
    private Logger LOGGER = Logger.getLogger(IndexesHolder.class);

    private MapsHolder mapsHolder;
    private Map<String, CpfRegistrationKey> registrationMap;
    private List<CpfRegistrationKey> actives;
    private Map<String, Collection<CpfRegistrationKey>> activeByAdmissionTerm;
    private List<CpfRegistrationKey> alumni;
    private Map<String, Collection<CpfRegistrationKey>> alumniByAdmissionTerm;
    private Map<String, Collection<CpfRegistrationKey>> alumniByGraduationTerm;
    private List<CpfRegistrationKey> dropouts;
    private Map<String, Collection<CpfRegistrationKey>> dropoutByAdmissionTerm;
    private Map<String, Collection<CpfRegistrationKey>> dropoutByLeaveTerm;
    private Map<String, Collection<CpfRegistrationKey>> dropoutByReasonAndAdmissionTerm;
    private Map<String, Collection<CpfRegistrationKey>> dropoutByReasonAndLeaveTerm;

    public IndexesHolder(MapsHolder mapsHolder) {
        this.mapsHolder = mapsHolder;
        buildIndexes();
    }

    public Map<String, CpfRegistrationKey> getRegistrationMap() {
        return registrationMap;
    }

    public Map<String, Collection<CpfRegistrationKey>> getActiveByAdmissionTerm() {
        return activeByAdmissionTerm;
    }

    public List<CpfRegistrationKey> getAlumni() {
        return alumni;
    }

    public Map<String, Collection<CpfRegistrationKey>> getAlumniByAdmissionTerm() {
        return alumniByAdmissionTerm;
    }

    public Map<String, Collection<CpfRegistrationKey>> getAlumniByGraduationTerm() {
        return alumniByGraduationTerm;
    }

    public List<CpfRegistrationKey> getDropouts() {
        return dropouts;
    }

    public Map<String, Collection<CpfRegistrationKey>> getDropoutByAdmissionTerm() {
        return dropoutByAdmissionTerm;
    }

    public Map<String, Collection<CpfRegistrationKey>> getDropoutByDropoutTerm() {
        return dropoutByLeaveTerm;
    }

    public Map<String, Collection<CpfRegistrationKey>> getDropoutByReasonAndAdmissionTerm() {
        return dropoutByReasonAndAdmissionTerm;
    }

    public Map<String, Collection<CpfRegistrationKey>> getDropoutByReasonAndLeaveTerm() {
        return dropoutByReasonAndLeaveTerm;
    }

    private void buildIndexes() {
        this.registrationMap = new HashMap<>();
        this.actives = new ArrayList<>();
        this.activeByAdmissionTerm = new HashMap<>();
        this.alumni = new ArrayList<>();
        this.alumniByAdmissionTerm = new HashMap<>();
        this.alumniByGraduationTerm = new HashMap<>();
        this.dropouts = new ArrayList<>();
        this.dropoutByAdmissionTerm = new HashMap<>();
        this.dropoutByLeaveTerm = new HashMap<>();
        this.dropoutByReasonAndAdmissionTerm = new HashMap<>();
        this.dropoutByReasonAndLeaveTerm = new HashMap<>();
        Map<CpfRegistrationKey, StudentData> mapStudents = this.mapsHolder.getMap("students");
        mapStudents.forEach((k, v) -> {
            this.registrationMap.put(k.getRegistration(), k);
            if (v.isActive()) {
                LOGGER.debug(String.format(Messages.INDEX_ACTIVE_S, v.getName()));
                this.actives.add(k);
                String admissionTerm = v.getAdmissionTerm();
                Collection<CpfRegistrationKey> list = this.activeByAdmissionTerm.get(admissionTerm);
                if (list == null) list = new ArrayList<>();
                list.add(k);
                this.activeByAdmissionTerm.put(admissionTerm, list);
            }
            if (v.isAlumnus()) { // graduated
                LOGGER.debug(String.format(Messages.INDEX_ALUMNUS_S, v.getName()));
                this.alumni.add(k);
                String admissionTerm = v.getAdmissionTerm();
                String graduationTerm = v.getStatusTerm();
                Collection<CpfRegistrationKey> listAdmissionTerm = this.alumniByAdmissionTerm.get(admissionTerm);
                if (listAdmissionTerm == null) listAdmissionTerm = new ArrayList<>();
                listAdmissionTerm.add(k);
                this.alumniByAdmissionTerm.put(admissionTerm, listAdmissionTerm);
                Collection<CpfRegistrationKey> listGraduationTerm = this.alumniByGraduationTerm.get(graduationTerm);
                if (listGraduationTerm == null) listGraduationTerm = new ArrayList<>();
                listGraduationTerm.add(k);
                this.alumniByGraduationTerm.put(graduationTerm, listGraduationTerm);
            }
            if (v.isDropout()) { // dropout
                LOGGER.debug(String.format(Messages.INDEX_DROPOUT_S, v.getName()));
                this.dropouts.add(k);
                String admissionTerm = v.getAdmissionTerm();
                String leaveTerm = v.getStatusTerm();
                String reason = v.getStatusStr();
                Collection<CpfRegistrationKey> listAdmissionTerm = this.dropoutByAdmissionTerm.get(admissionTerm);
                if (listAdmissionTerm == null) listAdmissionTerm = new ArrayList<>();
                listAdmissionTerm.add(k);
                this.dropoutByAdmissionTerm.put(admissionTerm, listAdmissionTerm);
                Collection<CpfRegistrationKey> listLeaveTerm = this.dropoutByLeaveTerm.get(leaveTerm);
                if (listLeaveTerm == null) listLeaveTerm = new ArrayList<>();
                listLeaveTerm.add(k);
                this.dropoutByLeaveTerm.put(leaveTerm, listLeaveTerm);
                Collection <CpfRegistrationKey> listReasonAndAdmissionTerm = this.dropoutByReasonAndAdmissionTerm.get((reason+admissionTerm));
                if (listReasonAndAdmissionTerm == null) listReasonAndAdmissionTerm = new ArrayList<>();
                listReasonAndAdmissionTerm.add(k);
                this.dropoutByReasonAndAdmissionTerm.put((reason+admissionTerm), listReasonAndAdmissionTerm);
                Collection<CpfRegistrationKey> listReasonAndLeaveTerm = this.dropoutByReasonAndLeaveTerm.get((reason+leaveTerm));
                if (listReasonAndLeaveTerm == null) listReasonAndLeaveTerm = new ArrayList<>();
                listReasonAndLeaveTerm.add(k);
                this.dropoutByReasonAndLeaveTerm.put((reason+leaveTerm), listReasonAndLeaveTerm);
            }
        });
    }

    public Collection<Student> getAllActives() {
        Collection<Student> allActives = new ArrayList<>();
        Map<CpfRegistrationKey, StudentData> mapStudents = this.mapsHolder.getMap("students");
        this.actives.forEach(k -> {
            allActives.add(new Student(k, mapStudents.get(k)));
        });
        return allActives;
    }

    public Collection<Student> getAllAlumni() {
        Collection<Student> allAlumni = new ArrayList<>();
        Map<CpfRegistrationKey, StudentData> mapStudents = this.mapsHolder.getMap("students");
        this.alumni.forEach(k -> {
            allAlumni.add(new Student(k, mapStudents.get(k)));
        });
        return allAlumni;
    }

    public Collection<Student> getAllDropouts() {
        Collection<Student> allDropouts = new ArrayList<>();
        Map<CpfRegistrationKey, StudentData> mapStudents = this.mapsHolder.getMap("students");
        this.dropouts.forEach(k -> {
            allDropouts.add(new Student(k, mapStudents.get(k)));
        });
        return allDropouts;
    }
}
