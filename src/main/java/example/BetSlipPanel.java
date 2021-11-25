
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OUTCOMES_IN_BET_SLIP",
    "PARLAY",
    "SINGLE"
})
@Generated("jsonschema2pojo")
@ToString
public class BetSlipPanel {

    @JsonProperty("OUTCOMES_IN_BET_SLIP")
    private String outcomesInBetSlip;
    @JsonProperty("PARLAY")
    private String parlay;
    @JsonProperty("SINGLE")
    private String single;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OUTCOMES_IN_BET_SLIP")
    public String getOutcomesInBetSlip() {
        return outcomesInBetSlip;
    }

    @JsonProperty("OUTCOMES_IN_BET_SLIP")
    public void setOutcomesInBetSlip(String outcomesInBetSlip) {
        this.outcomesInBetSlip = outcomesInBetSlip;
    }

    @JsonProperty("PARLAY")
    public String getParlay() {
        return parlay;
    }

    @JsonProperty("PARLAY")
    public void setParlay(String parlay) {
        this.parlay = parlay;
    }

    @JsonProperty("SINGLE")
    public String getSingle() {
        return single;
    }

    @JsonProperty("SINGLE")
    public void setSingle(String single) {
        this.single = single;
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
