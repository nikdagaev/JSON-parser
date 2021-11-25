
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CASHOUT",
    "BET"
})
@Generated("jsonschema2pojo")
@ToString
public class HelpComponent {

    @JsonProperty("CASHOUT")
    private String cashout;
    @JsonProperty("BET")
    private String bet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CASHOUT")
    public String getCashout() {
        return cashout;
    }

    @JsonProperty("CASHOUT")
    public void setCashout(String cashout) {
        this.cashout = cashout;
    }

    @JsonProperty("BET")
    public String getBet() {
        return bet;
    }

    @JsonProperty("BET")
    public void setBet(String bet) {
        this.bet = bet;
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
