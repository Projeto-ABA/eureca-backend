package br.edu.ufcg.computacao.eureca.backend.util;

import br.edu.ufcg.computacao.eureca.backend.api.http.CommonKeys;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.*;
import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.NationalIdRegistrationKey;
import br.edu.ufcg.computacao.eureca.backend.api.http.response.StudentMetrics;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.Collection;

public class TestUtils {

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
        return new ActivesStatisticsResponse(Arrays.asList(activesPerTerm), "x", "y");
    }

    public static AlumniStatisticsResponse getAlumniSummaryResponse() {
        AlumniPerTermSummary alumniPerTerm = new AlumniPerTermSummary("x", 10, 5, 4, 1);
        return new AlumniStatisticsResponse(Arrays.asList(alumniPerTerm), "x", "y");
    }

    public static Collection<StudentCSV> getStudentsCsvResponse() {
        br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.StudentData mockedStudentData = new br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.StudentData("x", "x", "x", "x", "x",
                "x", "x", "x", "Ativo",
                "VESTIBULAR 2007.2", "x", "x", "x",
                "x", "x",0,120,0,
                58,0,26,5.68,
                7,1.69,14,1,0,
                0,0,0);
        StudentCSV mockedStudentDataResponse = new StudentCSV(mockedStudentData.
                createStudent(new NationalIdRegistrationKey("fake-national-id", "fake-registration")));
        return Arrays.asList(mockedStudentDataResponse);
    }

    public static String getMockedActiveSummaryResponse() {
        return "{" +
                "\"sliderLabel\":[\"slider\",\"label\"]" +
                ",\"terms\":[{\"admissionTerm\":\"\",\"riskClassCount\":{\"inaccurate\":0,\"safe\":0,\"low\":0,\"average\":0,\"high\":0,\"unfeasible\":0,\"notApplicable\":0}}]" +
                "}";
    }

    public static String getMockedAlumniSummaryResponse() {
        return "{" +
                "\"sliderLabel\":[\"slider\",\"label\"]" +
                ",\"terms\":[{\"graduationTerm\":\"x\",\"alumniCount\":10,\"averageGpa\":5.0,\"averageTerms\":4.0,\"averageCost\":1.0}]" +
                "}";
    }

    public static String getMockedStudentCsvResponse() {
        return "[{\"registration\":\"fake-registration\"," +
                "\"name\":\"x\",\"gender\":\"x\",\"maritalStatus\":\"x\",\"curriculum\":\"x\",\"affirmativePolicy\":\"x\"," +
                "\"admissionType\":\"VESTIBULAR\",\"admissionTerm\":\"2007.2\",\"statusStr\":\"Ativo\",\"statusTerm\":\"Current\"," +
                "\"entryGrade\":0.0,\"gpa\":5.68,\"iea\":1.69,\"mc\":7.0,\"mandatoryCredits\":120,\"complementaryCredits\":26,\"electiveCredits\":58," +
                "\"completedTerms\":14,\"attemptedCredits\":0.0,\"institutionalEnrollments\":0,\"mobilityTerms\":0,\"suspendedTerms\":1," +
                "\"feasibility\":2.5,\"successRate\":-1.0,\"averageLoad\":0.0,\"cost\":-1.0,\"pace\":13.285714285714286,\"courseDurationPrediction\":15.0,\"risk\":1.4634146341463414," +
                "\"riskClass\":\"UNFEASIBLE\",\"costClass\":\"NOT_APPLICABLE\"}]";
    }

    public static DropoutsStatisticsResponse getDropoutsSummaryResponse() {
        DropoutReasonSummary reasonSummary = new DropoutReasonSummary(0,0,0,
                0,0,0,
                0,0,0,
                0,0);
        DropoutPerTermSummary dropouts = new DropoutPerTermSummary("", 0, reasonSummary, 0, 0);
        return new DropoutsStatisticsResponse(Arrays.asList(dropouts), "x", "y");
    }

    public static DelayedStatisticsResponse getDelayedSummaryResponse() {
        StudentMetrics metrics = new StudentMetrics(0,0,0,
                0,0,0,0,0);
        StudentMetricsSummary metricsSummary = new StudentMetricsSummary(0, metrics);
        DelayedPerTermSummary delayedPerTermSummary = new DelayedPerTermSummary("", metricsSummary);
        return new DelayedStatisticsResponse(Arrays.asList(delayedPerTermSummary), "x", "y");
    }
}
