package br.edu.ufcg.computacao.eureca.backend.core.models;

import br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries.SubjectKey;

import java.util.Collection;
import java.util.TreeSet;

public class StudentCurriculumProgress {
    private int completedTerms;
    private int completedMandatoryCredits;
    private int completedOptionalCredits;
    private int completedComplementaryCredits;
    private int enrolledCredits;
    private Collection<SubjectKey> completed;
    private Collection<SubjectKey> enabled;
    private Collection<SubjectKey> disabled;
    private Collection<SubjectKey> ongoing;
    private Collection<SubjectKey> adequate;

    public StudentCurriculumProgress(int completedTerms, int completedMandatoryCredits, int completedOptionalCredits,
                                     int completedComplementaryCredits, int enrolledCredits) {
        this.completedTerms = completedTerms;
        this.completedMandatoryCredits = completedMandatoryCredits;
        this.completedOptionalCredits = completedOptionalCredits;
        this.completedComplementaryCredits = completedComplementaryCredits;
        this.enrolledCredits = enrolledCredits;
        this.completed = new TreeSet<>();
        this.enabled = new TreeSet<>();
        this.disabled = new TreeSet<>();
        this.ongoing = new TreeSet<>();
        this.adequate = new TreeSet<>();
    }

    public int getCompletedTerms() {
        return completedTerms;
    }

    public void setCompletedTerms(int completedTerms) {
        this.completedTerms = completedTerms;
    }

    public int getCompletedMandatoryCredits() {
        return completedMandatoryCredits;
    }

    public void setCompletedMandatoryCredits(int completedMandatoryCredits) {
        this.completedMandatoryCredits = completedMandatoryCredits;
    }

    public int getCompletedOptionalCredits() {
        return completedOptionalCredits;
    }

    public void setCompletedOptionalCredits(int completedOptionalCredits) {
        this.completedOptionalCredits = completedOptionalCredits;
    }

    public int getCompletedComplementaryCredits() {
        return completedComplementaryCredits;
    }

    public void setCompletedComplementaryCredits(int completedComplementaryCredits) {
        this.completedComplementaryCredits = completedComplementaryCredits;
    }

    public int getEnrolledCredits() {
        return enrolledCredits;
    }

    public void setEnrolledCredits(int enrolledCredits) {
        this.enrolledCredits = enrolledCredits;
    }

    public Collection<SubjectKey> getCompleted() {
        return completed;
    }

    public void setCompleted(Collection<SubjectKey> completed) {
        this.completed = completed;
    }

    public Collection<SubjectKey> getEnabled() {
        return enabled;
    }

    public void setEnabled(Collection<SubjectKey> enabled) {
        this.enabled = enabled;
    }

    public Collection<SubjectKey> getDisabled() {
        return disabled;
    }

    public void setDisabled(Collection<SubjectKey> disabled) {
        this.disabled = disabled;
    }

    public Collection<SubjectKey> getOngoing() {
        return ongoing;
    }

    public void setOngoing(Collection<SubjectKey> ongoing) {
        this.ongoing = ongoing;
    }

    public Collection<SubjectKey> getAdequate() {
        return adequate;
    }

    public void setAdequate(Collection<SubjectKey> adequate) {
        this.adequate = adequate;
    }
}