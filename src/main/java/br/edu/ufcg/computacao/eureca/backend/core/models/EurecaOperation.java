package br.edu.ufcg.computacao.eureca.backend.core.models;

public enum EurecaOperation {
    GET_ACTIVES_SUMMARY("getActives"),
    GET_ACTIVES_CSV("getActiveCSV"),
    GET_ALUMNI_SUMMARY("getAlumni"),
    GET_ALUMNI_CSV("getAlumniCSV"),
    GET_ALUMNI_BASIC_DATA("getAlumniBasicData"),
    GET_DROPOUTS_SUMMARY("getDropouts"),
    GET_DROPOUTS_CSV("getDropoutsCSV"),
    GET_DELAYED_SUMMARY("getDelayed"),
    GET_DELAYED_CSV("getDelayedCSV"),
    GET_SUBJECTS_RETENTION_SUMMARY("getSubjectsRetention"),
    GET_SUBJECTS_RETENTION_CSV("getSubjectsRetentionCSV"),
    GET_RETENTION_STATISTICS("getRetentionStatistics"),
    GET_STUDENTS_STATISTICS("getStudentsStatistics"),
    GET_SUBJECTS_SUMMARY("getSubjectsStatistics"),
    GET_SUBJECTS_CSV("getSubjectsCSV"),
    GET_SUBJECTS_STATISTICS("getSubjectsStatisticsSummary"),
    GET_TEACHERS_STATISTICS("getTeachersStatistics"),
    GET_TEACHERS_CSV("getTeachersStatisticsCSV"),
    GET_ENROLLMENTS_STATISTICS("getEnrollmentsStatistics"),
    GET_ENROLLMENTS_CSV("getEnrollmentsStatisticsCSV");

    private String value;

    EurecaOperation(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
