
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ALWAYS_ASK",
    "HIGHER_CASHOUT",
    "ACCEPT_ALL",
    "INFO"
})
@Generated("jsonschema2pojo")
@ToString
public class CashoutChanges {

    @JsonProperty("ALWAYS_ASK")
    private String alwaysAsk;
    @JsonProperty("HIGHER_CASHOUT")
    private String higherCashout;
    @JsonProperty("ACCEPT_ALL")
    private String acceptAll;
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

    @JsonProperty("HIGHER_CASHOUT")
    public String getHigherCashout() {
        return higherCashout;
    }

    @JsonProperty("HIGHER_CASHOUT")
    public void setHigherCashout(String higherCashout) {
        this.higherCashout = higherCashout;
    }

    @JsonProperty("ACCEPT_ALL")
    public String getAcceptAll() {
        return acceptAll;
    }

    @JsonProperty("ACCEPT_ALL")
    public void setAcceptAll(String acceptAll) {
        this.acceptAll = acceptAll;
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
