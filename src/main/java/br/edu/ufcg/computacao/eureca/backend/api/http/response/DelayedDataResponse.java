package br.edu.ufcg.computacao.eureca.backend.api.http.response;

import br.edu.ufcg.computacao.eureca.backend.core.models.Metrics;
import br.edu.ufcg.computacao.eureca.backend.core.models.RiskClass;
import br.edu.ufcg.computacao.eureca.backend.core.models.Student;
import br.edu.ufcg.computacao.eureca.backend.core.util.MetricsCalculator;

public class DelayedDataResponse {

    private String registration;
    private RiskClass riskClass;
    private double feasibility;
    private double successRate;
    private double averageLoad;
    private double cost;
    private double pace;
    private int courseDurationPrediction;
    private double risk;
    private int attemptedCredits;

    public DelayedDataResponse(String registration, RiskClass riskClass, double successRate, double averageLoad, double cost, double pace, int courseDurationPrediction, double risk, int attemptedCredits) {
        this.registration = registration;
        this.riskClass = riskClass;
        this.successRate = successRate;
        this.averageLoad = averageLoad;
        this.cost = cost;
        this.pace = pace;
        this.courseDurationPrediction = courseDurationPrediction;
        this.risk = risk;
        this.attemptedCredits = attemptedCredits;
    }

    public DelayedDataResponse(Student student) {
        Metrics metrics = MetricsCalculator.getInstance().computeMetrics(student);

        this.registration = student.getId().getRegistration();
        this.riskClass = student.getRiskClass();
        this.successRate = metrics.getSuccessRate();
        this.averageLoad = metrics.getAverageLoad();
        this.cost = metrics.getCost();
        this.pace = metrics.getPace();
        this.courseDurationPrediction = metrics.getCourseDurationPrediction();
        this.risk = metrics.getRisk();
        this.attemptedCredits = metrics.getAttemptedCredits();
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public RiskClass getRiskClass() {
        return riskClass;
    }

    public void setRiskClass(RiskClass riskClass) {
        this.riskClass = riskClass;
    }

    public double getFeasibility() {
        return feasibility;
    }

    public void setFeasibility(double feasibility) {
        this.feasibility = feasibility;
    }

    public double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }

    public double getAverageLoad() {
        return averageLoad;
    }

    public void setAverageLoad(double averageLoad) {
        this.averageLoad = averageLoad;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getPace() {
        return pace;
    }

    public void setPace(double pace) {
        this.pace = pace;
    }

    public int getCourseDurationPrediction() {
        return courseDurationPrediction;
    }

    public void setCourseDurationPrediction(int courseDurationPrediction) {
        this.courseDurationPrediction = courseDurationPrediction;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public int getAttemptedCredits() {
        return attemptedCredits;
    }

    public void setAttemptedCredits(int attemptedCredits) {
        this.attemptedCredits = attemptedCredits;
    }
}
