
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ALWAYS_ASK",
    "HIGHER_ODDS",
    "ANY_ODDS",
    "INFO"
})
@Generated("jsonschema2pojo")
@ToString
public class OddsChanges {

    @JsonProperty("ALWAYS_ASK")
    private String alwaysAsk;
    @JsonProperty("HIGHER_ODDS")
    private String higherOdds;
    @JsonProperty("ANY_ODDS")
    private String anyOdds;
    @JsonProperty("INFO")
    private String info;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ALWAYS_ASK")
    public String getAlwaysAsk() {
        return alwaysAsk;
    }

    @JsonProperty("ALWAYS_ASK")
    public void setAlwaysAsk(String alwaysAsk) {
        this.alwaysAsk = alwaysAsk;
    }

    @JsonProperty("HIGHER_ODDS")
    public String getHigherOdds() {
        return higherOdds;
    }

    @JsonProperty("HIGHER_ODDS")
    public void setHigherOdds(String higherOdds) {
        this.higherOdds = higherOdds;
    }

    @JsonProperty("ANY_ODDS")
    public String getAnyOdds() {
        return anyOdds;
    }

    @JsonProperty("ANY_ODDS")
    public void setAnyOdds(String anyOdds) {
        this.anyOdds = anyOdds;
    }

    @JsonProperty("INFO")
    public String getInfo() {
        return info;
    }

    @JsonProperty("INFO")
    public void setInfo(String info) {
        this.info = info;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
