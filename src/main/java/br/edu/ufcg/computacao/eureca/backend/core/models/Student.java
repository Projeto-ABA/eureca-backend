package br.edu.ufcg.computacao.eureca.backend.core.models;

import br.edu.ufcg.computacao.eureca.backend.core.util.MetricsCalculator;

public class Student implements Comparable {
    private CpfRegistrationKey id;
    private StudentData data;

    public Student(CpfRegistrationKey id, StudentData data) {
        this.id = id;
        this.data = data;
    }

    public CpfRegistrationKey getId() {
        return id;
    }

    public StudentData getStudentData() {
        return data;
    }

    public RiskClass computeRiskClass() {
        Metrics studentMetrics = MetricsCalculator.computeMetrics(this.getStudentData());
        return MetricsCalculator.computeRiskClass(studentMetrics.getRisk());
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return (new RegistrationKey(this.getId().getRegistration())).
                compareTo((new RegistrationKey(other.getId().getRegistration())));
    }
}
