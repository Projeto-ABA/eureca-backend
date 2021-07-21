package br.edu.ufcg.computacao.eureca.backend.api.http.response;

import br.edu.ufcg.computacao.eureca.backend.core.models.CostClass;
import br.edu.ufcg.computacao.eureca.backend.core.util.MetricsCalculator;

public class AlumniSummary extends RangeSummary {
    private int alumniCount;
    private double averageTermsCount;
    private double averageCost;
    private CostClass costClass;
    private double averageGpa;
    private double averageAlumniCount;
    private int maxAlumniCount;
    private int minAlumniCount;
    private String maxAlumniCountTerm;
    private String minAlumniCountTerm;

    public AlumniSummary(int alumniCount, double averageTermsCount, double averageCost, double averageGpa,
                         double averageAlumniCount, int maxAlumniCount, int minAlumniCount, String maxAlumniCountTerm,
                         String minAlumniCountTerm, String from, String to) {
        super(from, to);
        this.alumniCount = alumniCount;
        this.averageTermsCount = averageTermsCount;
        this.averageCost = averageCost;
        this.costClass = MetricsCalculator.computeCostClass(this.averageCost);
        this.averageGpa = averageGpa;
        this.averageAlumniCount = averageAlumniCount;
        this.maxAlumniCount = maxAlumniCount;
        this.minAlumniCount = minAlumniCount;
        this.maxAlumniCountTerm = maxAlumniCountTerm;
        this.minAlumniCountTerm = minAlumniCountTerm;
    }

    public double getAverageTermsCount() {
        return averageTermsCount;
    }

    public void setAverageTermsCount(double averageTermsCount) {
        this.averageTermsCount = averageTermsCount;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(double averageCost) {
        this.averageCost = averageCost;
    }

    public CostClass getCostClass() {
        return costClass;
    }

    public void setCostClass(CostClass costClass) {
        this.costClass = costClass;
    }

    public double getAverageGpa() {
        return averageGpa;
    }

    public void setAverageGpa(double averageGpa) {
        this.averageGpa = averageGpa;
    }

    public int getMaxAlumniCount() {
        return maxAlumniCount;
    }

    public void setMaxAlumniCount(int maxAlumniCount) {
        this.maxAlumniCount = maxAlumniCount;
    }

    public double getAverageAlumniCount() {
        return averageAlumniCount;
    }

    public void setAverageAlumniCount(double averageAlumniCount) {
        this.averageAlumniCount = averageAlumniCount;
    }

    public int getMinAlumniCount() {
        return minAlumniCount;
    }

    public void setMinAlumniCount(int minAlumniCount) {
        this.minAlumniCount = minAlumniCount;
    }

    public String getMaxAlumniCountTerm() {
        return maxAlumniCountTerm;
    }

    public void setMaxAlumniCountTerm(String maxAlumniCountTerm) {
        this.maxAlumniCountTerm = maxAlumniCountTerm;
    }

    public String getMinAlumniCountTerm() {
        return minAlumniCountTerm;
    }

    public void setMinAlumniCountTerm(String minAlumniCountTerm) {
        this.minAlumniCountTerm = minAlumniCountTerm;
    }

    public int getAlumniCount() {
        return alumniCount;
    }

    public void setAlumniCount(int alumniCount) {
        this.alumniCount = alumniCount;
    }
}
