
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MATCH_WINNER",
    "TOTAL_ODD",
    "TITLE"
})
@Generated("jsonschema2pojo")
@ToString
public class ParlayCard {

    @JsonProperty("MATCH_WINNER")
    private String matchWinner;
    @JsonProperty("TOTAL_ODD")
    private String totalOdd;
    @JsonProperty("TITLE")
    private String title;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MATCH_WINNER")
    public String getMatchWinner() {
        return matchWinner;
    }

    @JsonProperty("MATCH_WINNER")
    public void setMatchWinner(String matchWinner) {
        this.matchWinner = matchWinner;
    }

    @JsonProperty("TOTAL_ODD")
    public String getTotalOdd() {
        return totalOdd;
    }

    @JsonProperty("TOTAL_ODD")
    public void setTotalOdd(String totalOdd) {
        this.totalOdd = totalOdd;
    }

    @JsonProperty("TITLE")
    public String getTitle() {
        return title;
    }

    @JsonProperty("TITLE")
    public void setTitle(String title) {
        this.title = title;
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
