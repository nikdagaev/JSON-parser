
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OPEN_BETS",
    "SETTLED_BETS"
})
@Generated("jsonschema2pojo")
@ToString
public class Segments__1 {

    @JsonProperty("OPEN_BETS")
    private String openBets;
    @JsonProperty("SETTLED_BETS")
    private String settledBets;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OPEN_BETS")
    public String getOpenBets() {
        return openBets;
    }

    @JsonProperty("OPEN_BETS")
    public void setOpenBets(String openBets) {
        this.openBets = openBets;
    }

    @JsonProperty("SETTLED_BETS")
    public String getSettledBets() {
        return settledBets;
    }

    @JsonProperty("SETTLED_BETS")
    public void setSettledBets(String settledBets) {
        this.settledBets = settledBets;
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
