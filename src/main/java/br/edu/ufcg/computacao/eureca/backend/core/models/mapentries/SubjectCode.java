package br.edu.ufcg.computacao.eureca.backend.core.models.mapentries;

public class SubjectCode extends EurecaMapKey {
    String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public SubjectCode(String code) {
        this.code = code;
    }

    public SubjectCode() {}

    @Override
    public String toString() {
        return this.code;
    }
}
