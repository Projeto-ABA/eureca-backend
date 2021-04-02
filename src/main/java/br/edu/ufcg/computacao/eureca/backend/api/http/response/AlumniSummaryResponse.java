package br.edu.ufcg.computacao.eureca.backend.api.http.response;

import br.edu.ufcg.computacao.eureca.backend.constants.ApiDocumentation;
import io.swagger.annotations.ApiModelProperty;

import java.util.Collection;

public class AlumniSummaryResponse {
    @ApiModelProperty(position = 0, example = ApiDocumentation.Model.SLIDER_LABEL)
    Collection<String> sliderLabel;
    Collection<AlumniPerTermSummary> terms;
    AlumniSummary summary;

    public AlumniSummaryResponse(Collection<String> sliderLabel, Collection<AlumniPerTermSummary> terms, AlumniSummary summary) {
        this.sliderLabel = sliderLabel;
        this.terms = terms;
        this.summary = summary;
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

    public AlumniSummary getSummary() {
        return summary;
    }

    public void setSummary(AlumniSummary summary) {
        this.summary = summary;
    }
}
