
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "F",
    "M"
})
@Generated("jsonschema2pojo")
@ToString
public class GenderName {

    @JsonProperty("F")
    private String f;
    @JsonProperty("M")
    private String m;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("F")
    public String getF() {
        return f;
    }

    @JsonProperty("F")
    public void setF(String f) {
        this.f = f;
    }

    @JsonProperty("M")
    public String getM() {
        return m;
    }

    @JsonProperty("M")
    public void setM(String m) {
        this.m = m;
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
