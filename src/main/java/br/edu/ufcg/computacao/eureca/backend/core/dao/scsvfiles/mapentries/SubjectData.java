package br.edu.ufcg.computacao.eureca.backend.core.dao.scsvfiles.mapentries;

import br.edu.ufcg.computacao.eureca.backend.core.models.Subject;

import java.util.ArrayList;
import java.util.Collection;

public class SubjectData implements EurecaMapValue {
    private String academicUnit;
    private String type;
    private int credits;
    private int hours;
    private String name;
    private String equivalentCodes;
    private Collection<String> equivalentCodesList;
    private int idealTerm;
    private String preRequirements;
    private Collection<String> preRequirementsList;

    public SubjectData(String academicUnit, String type, int credits, int hours, String name, String equivalentCodes,
                       int idealTerm, String preRequirements) {
        this.academicUnit = academicUnit;
        this.type = type;
        this.credits = credits;
        this.hours = hours;
        this.name = name;
        this.equivalentCodes = equivalentCodes;
        this.idealTerm = idealTerm;
        this.preRequirements = preRequirements;
        this.equivalentCodesList = null;
        this.preRequirementsList = null;
    }

    public SubjectData() {
    }

    public String getAcademicUnit() {
        return academicUnit;
    }

    public void setAcademicUnit(String academicUnit) {
        this.academicUnit = academicUnit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEquivalentCodes() {
        return equivalentCodes;
    }

    public void setEquivalentCodes(String equivalentCodes) {
        this.equivalentCodes = equivalentCodes;
    }

    public int getIdealTerm() {
        return idealTerm;
    }

    public void setIdealTerm(int idealTerm) {
        this.idealTerm = idealTerm;
    }

    public String getPreRequirements() {
        return preRequirements;
    }

    public void setPreRequirements(String preRequirements) {
        this.preRequirements = preRequirements;
    }

    public Collection<String> getEquivalentCodesList() {
        if (equivalentCodesList == null) {
            equivalentCodesList = extractStrList(equivalentCodes);
        }
        return equivalentCodesList;
    }

    public Subject createSubject(SubjectKey key) {
        return new Subject(key.getCurriculumCode(), key.getSubjectCode(), getAcademicUnit(), getType(), getCredits(),
                getHours(), getName(), getEquivalentCodes(), getIdealTerm(), getPreRequirements());
    }

    public Collection<String> getPreRequirementsList() {
        if (preRequirementsList == null) {
            preRequirementsList = extractStrList(preRequirements);
        }
        return preRequirementsList;
    }

    private Collection<String> extractStrList(String subjectsStr) {
        ArrayList<String> ret = new ArrayList<>();
        if (subjectsStr.equals("")) return ret;
        String creditsArray[] = subjectsStr.split(",");
        for (int i =0; i < creditsArray.length; i++) {
            ret.add(creditsArray[i]);
        }
        return ret;
    }

    @Override
    public String toString() {
        return "SubjectData{" +
                "academicUnit='" + academicUnit + '\'' +
                ", type='" + type + '\'' +
                ", credits=" + credits +
                ", hours=" + hours +
                ", name='" + name + '\'' +
                ", equivalentCodes='" + equivalentCodes + '\'' +
                ", equivalentCodesList=" + getEquivalentCodesList() +
                ", idealTerm='" + idealTerm + '\'' +
                ", preRequirements='" + preRequirements + '\'' +
                ", preRequirementsList=" + getPreRequirementsList() +
                '}';
    }
}