
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "INFO",
    "INPUTS"
})
@Generated("jsonschema2pojo")
@ToString
public class Login {

    @JsonProperty("INFO")
    private Info info;
    @JsonProperty("INPUTS")
    private Inputs inputs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("INFO")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("INFO")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("INPUTS")
    public Inputs getInputs() {
        return inputs;
    }

    @JsonProperty("INPUTS")
    public void setInputs(Inputs inputs) {
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
