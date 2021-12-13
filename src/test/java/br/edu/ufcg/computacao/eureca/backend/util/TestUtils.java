package br.edu.ufcg.computacao.eureca.backend.util;

import br.edu.ufcg.computacao.eureca.backend.api.http.CommonKeys;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesPerTermSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.active.ActivesStatisticsResponse;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.alumni.AlumniPerTermSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.alumni.AlumniStatisticsResponse;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.dropout.DropoutPerTermSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.dropout.DropoutReasonSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.dropout.DropoutsStatisticsResponse;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.enrollment.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionPerTermSummary;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.retention.student.StudentsRetentionStatisticsResponse;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.students.*;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectCSV;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectMetrics;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.subject.SubjectsResponse;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.EnrollmentData;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.NationalIdRegistrationKey;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.RegistrationSubjectCodeTermKey;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.StudentData;
import br.edu.ufcg.computacao.eureca.backend.core.models.Curriculum;
import br.edu.ufcg.computacao.eureca.backend.core.models.Enrollment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestUtils {

    private static final String DEFAULT_COURSE_CODE = "14102100";
    private static final String DEFAULT_CURRICULUM_CODE = "2017";
    public static final String DEFAULT_COURSE_CURRICULUM_QUERY = String.format("?courseCode=%s&curriculumCode=%s", DEFAULT_COURSE_CODE, DEFAULT_CURRICULUM_CODE);

    public static RequestBuilder createRequestBuilder(HttpMethod method, String url, HttpHeaders headers, String content) {
        switch (method) {
            case GET:
                return MockMvcRequestBuilders.get(url)
                        .headers(headers)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(content)
                        .contentType(MediaType.APPLICATION_JSON);
            case POST:
                return null;
            default:
                return null;
        }
    }

    public static HttpHeaders getTokenHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(CommonKeys.AUTHENTICATION_TOKEN_KEY, "fake-token");
        return headers;
    }

    public static ActivesStatisticsResponse getActivesSummaryResponse() {
        RiskClassCountSummary riskClassCountSummary = new RiskClassCountSummary(0, 0, 0, 0, 0, 0, 0);
        ActivesPerTermSummary activesPerTerm = new ActivesPerTermSummary("", riskClassCountSummary);
        return new ActivesStatisticsResponse(Arrays.asList(activesPerTerm), "", "", "x", "y");
    }

    public static AlumniStatisticsResponse getAlumniSummaryResponse() {
        AlumniPerTermSummary alumniPerTerm = new AlumniPerTermSummary("x", 10, 5, 4, 1);
        return new AlumniStatisticsResponse(Arrays.asList(alumniPerTerm), "", "", "x", "y");
    }

    public static StudentsResponse getStudentsCsvResponse() {
        StudentData mockedStudentData = new StudentData("x", "Ativo", "VESTIBULAR 2007.2", "x", "x", "x", "x",
                "x", "x", "x", "x", "x", "x", "x", "x", "x", "x", 1980,196,840,
                56,450,30,5.68,
                7,1.69,14,1,0,
                0,0,0);
        StudentCSV mockedStudentDataResponse = new StudentCSV(mockedStudentData.
                createStudent(new NationalIdRegistrationKey("fake-national-id", "fake-registration"), getCurriculum()));
        return new StudentsResponse(Arrays.asList(mockedStudentDataResponse));
    }

    public static EnrollmentsResponse getEnrollmentsCsvResponse(){
        EnrollmentsCSV mockedEnrollmentDataResponse = new EnrollmentsCSV("x","x","x","x","x","x",0,0,0,0,0,0,0,0);
        return new EnrollmentsResponse(Arrays.asList(mockedEnrollmentDataResponse));
    }

    public static SubjectsResponse getSubjectsCsvResponse(){
        SubjectMetrics metrics = new SubjectMetrics(0,0,0,0,0,0,0,0,0);
        SubjectCSV mockSubjectDataResponse = new SubjectCSV("x","x","x","x","x", metrics);
        return new SubjectsResponse(Arrays.asList(mockSubjectDataResponse));
    }

    public static String getMockedActiveSummaryResponse() {
        return "{" +
                "\"from\":\"x\",\"to\":\"y\",\"courseCode\":\"\",\"curriculumCode\":\"\"," +
                "\"activesPerTermSummaries\":[{\"admissionTerm\":\"\",\"riskClassCount\":{\"inaccurate\":0,\"safe\":0,\"low\":0,\"average\":0,\"high\":0,\"unfeasible\":0,\"notApplicable\":0},\"term\":\"\"}]" +
                "}";

    }

    public static String getMockedStudentStatisticsSummaryResponse() {
        return "{\"courseCode\":\"\",\"curriculumCode\":\"\",\"activesSummary\":null,\"alumniSummary\":null,\"dropoutsSummary\":null,\"glossary\":null}";
    }

    public static String getMockedAlumniStatisticsResponse() {
        return "{\"from\":\"x\",\"to\":\"y\",\"courseCode\":\"\",\"curriculumCode\":\"\",\"alumniPerTermSummaries\":[{\"graduationTerm\":\"x\",\"alumniCount\":10,\"averageGpa\":5.0,\"averageTerms\":4.0,\"averageCost\":1.0,\"term\":\"x\"}]}";
    }

    public static String getMockedStudentCsvResponse() {
        return "{\"students\"" +
                ":[{\"registration\":\"fake-registration\",\"courseCode\":\"x\",\"curriculumCode\":\"x\",\"name\":\"x\",\"gender\":\"x\",\"maritalStatus\":\"x\"," +
                "\"affirmativePolicy\":\"x\",\"admissionType\":\"VESTIBULAR\",\"admissionTerm\":\"2007.2\",\"statusStr\":\"Ativo\",\"statusTerm\":\"Current\"," +
                "\"entryGrade\":0.0,\"gpa\":5.68,\"iea\":1.69,\"mc\":7.0,\"mandatoryCredits\":196,\"complementaryCredits\":30,\"electiveCredits\":56," +
                "\"completedTerms\":14,\"attemptedCredits\":0.0,\"institutionalEnrollments\":0,\"mobilityTerms\":0,\"suspendedTerms\":1,\"feasibility\":0.0," +
                "\"successRate\":-1.0,\"averageLoad\":0.0,\"cost\":-1.0,\"pace\":20.142857142857142,\"courseDurationPrediction\":10.0,\"risk\":0.975609756097561," +
                "\"riskClass\":\"SAFE\",\"costClass\":\"NOT_APPLICABLE\"}]}";
    }

    public static String getMockedSubjectEnrollmentSummaryResponse() {
        return "{\"courseCode\":\"\",\"curriculumCode\":\"\",\"mandatory\":null,\"optional\":null,\"elective\":null,\"complementary\":null,\"glossary\":null}";
    }

    public static String getMockedSubjectEnrollmentCsvResponse() {
        return "{\"enrollments\""+
                ":[{\"courseCode\":\"x\",\"curriculumCode\":\"x\",\"subjectCode\":\"x\",\"subjectName\":\"x\",\"term\":\"x\",\"classId\":\"x\","+
                "\"enrollmentsCount\":0,\"succeededCount\":0,\"cancelledCount\":0,\"exemptedCount\":0,\"ongoingCount\":0,\"failedDueToGradeCount\":0,"+
                "\"failedDueToAbsenceCount\":0,"+ "\"suspendedCount\":0}]}";
    }

    public static String getMockedSubjectCsvResponse() {
        return "{\"subjects\""+
                ":[{\"courseCode\":\"x\",\"curriculumCode\":\"x\",\"subjectCode\":\"x\",\"subjectName\":\"x\",\"term\":\"x\","+
                "\"metrics\""+
                ":{\"failedDueToAbsences\":0,\"failedDueToGrade\":0,\"cancelled\":0,\"succeeded\":0,\"ongoing\":0,\"exempted\":0,\"suspended\":0," +
                "\"numberOfClasses\":0,\"totalEnrolled\":0}}]}";
    }


    public static DropoutsStatisticsResponse getDropoutsSummaryResponse() {
        DropoutReasonSummary reasonSummary = new DropoutReasonSummary(0,0,0,
                0,0,0,
                0,0,0,
                0,0);
        DropoutPerTermSummary dropouts = new DropoutPerTermSummary("", 0, reasonSummary, 0, 0);
        return new DropoutsStatisticsResponse(Arrays.asList(dropouts), "", "","x", "y");
    }

    public static StudentsRetentionStatisticsResponse getDelayedSummaryResponse() {
        StudentMetrics metrics = new StudentMetrics(0,0,0,
                0,0,0,0,0);
        StudentMetricsSummary metricsSummary = new StudentMetricsSummary(0, metrics, 0, 0);
        StudentsRetentionPerTermSummary delayedPerTermSummary = new StudentsRetentionPerTermSummary("", metricsSummary);
        return new StudentsRetentionStatisticsResponse(Arrays.asList(delayedPerTermSummary), "", "", "x", "y");
    }

    public static Curriculum getCurriculum() {
        return new Curriculum("14102100", "2017", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), 132,
                40, 16, 8, 22, 9, 14, 16, 24, 4,
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }
}
