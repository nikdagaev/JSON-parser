
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NO_INTERNET",
    "UPDATING_DATA",
    "INPUTS"
})
@Generated("jsonschema2pojo")
@ToString
public class Errors__1 {

    @JsonProperty("NO_INTERNET")
    private String noInternet;
    @JsonProperty("UPDATING_DATA")
    private String updatingData;
    @JsonProperty("INPUTS")
    private Inputs__2 inputs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NO_INTERNET")
    public String getNoInternet() {
        return noInternet;
    }

    @JsonProperty("NO_INTERNET")
    public void setNoInternet(String noInternet) {
        this.noInternet = noInternet;
    }

    @JsonProperty("UPDATING_DATA")
    public String getUpdatingData() {
        return updatingData;
    }

    @JsonProperty("UPDATING_DATA")
    public void setUpdatingData(String updatingData) {
        this.updatingData = updatingData;
    }

    @JsonProperty("INPUTS")
    public Inputs__2 getInputs() {
        return inputs;
    }

    @JsonProperty("INPUTS")
    public void setInputs(Inputs__2 inputs) {
        this.inputs = inputs;
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
