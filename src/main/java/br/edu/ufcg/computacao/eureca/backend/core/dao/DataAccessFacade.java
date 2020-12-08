package br.edu.ufcg.computacao.eureca.backend.core.dao;

import br.edu.ufcg.computacao.eureca.backend.api.http.response.*;

import java.util.Collection;

public interface DataAccessFacade {
    Collection<ActiveDataResponse> getAllActiveStudents(String from, String to);

    Collection<ActiveSummaryResponse> getActiveStudentsSummary(String from, String to);

    Collection<AlumniDataResponse> getAllAlumni(String from, String to);

    AlumniSummaryResponse getAlumniSummary(String from, String to);

    Collection<DropoutDataResponse> getAllDropouts(String from, String to);

    Collection<DropoutSummaryResponse> getDropoutsSummary(String from, String to);

    Collection<AlumnusBasicData> getAlumniBasicData();
}
