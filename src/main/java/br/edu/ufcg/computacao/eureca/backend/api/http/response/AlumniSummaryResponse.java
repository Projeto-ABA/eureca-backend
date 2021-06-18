package br.edu.ufcg.computacao.eureca.backend.api.http.response;

import br.edu.ufcg.computacao.eureca.backend.constants.AlumniGlossaryFields;
import br.edu.ufcg.computacao.eureca.backend.constants.ApiDocumentation;
import br.edu.ufcg.computacao.eureca.backend.constants.TeachersGlossaryFields;
import io.swagger.annotations.ApiModelProperty;

import java.util.Collection;

public class AlumniSummaryResponse {
    @ApiModelProperty(position = 0, example = ApiDocumentation.Model.SLIDER_LABEL)
    private Collection<String> sliderLabel;
    private Collection<AlumniPerTermSummary> terms;
    private AlumniGlossaryFields glossary;

    public AlumniSummaryResponse(Collection<String> sliderLabel, Collection<AlumniPerTermSummary> terms) {
        this.sliderLabel = sliderLabel;
        this.terms = terms;
    }

    public Collection<String> getSliderLabel() {
        return sliderLabel;
    }

    public void setSliderLabel(Collection<String> sliderLabel) {
        this.sliderLabel = sliderLabel;
    }

    public Collection<AlumniPerTermSummary> getTerms() {
        return terms;
    }

    public void setTerms(Collection<AlumniPerTermSummary> terms) {
        this.terms = terms;
    }

    public AlumniGlossaryFields getGlossary() {
        return glossary;
    }

    public void setGlossary(AlumniGlossaryFields glossary) {
        this.glossary = glossary;
    }
}
