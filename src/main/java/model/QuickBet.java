
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "POTENTIAL",
    "SUCCESS",
    "ACCEPT"
})
@Generated("jsonschema2pojo")
@ToString
public class QuickBet {

    @JsonProperty("POTENTIAL")
    private String potential;
    @JsonProperty("SUCCESS")
    private String success;
    @JsonProperty("ACCEPT")
    private String accept;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("POTENTIAL")
    public String getPotential() {
        return potential;
    }

    @JsonProperty("POTENTIAL")
    public void setPotential(String potential) {
        this.potential = potential;
    }

    @JsonProperty("SUCCESS")
    public String getSuccess() {
        return success;
    }

    @JsonProperty("SUCCESS")
    public void setSuccess(String success) {
        this.success = success;
    }

    @JsonProperty("ACCEPT")
    public String getAccept() {
        return accept;
    }

    @JsonProperty("ACCEPT")
    public void setAccept(String accept) {
        this.accept = accept;
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
