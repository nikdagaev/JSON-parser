
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SINGLE",
    "MULTIPLE"
})
@Generated("jsonschema2pojo")
@ToString
public class SwarmBetTypesRoll {

    @JsonProperty("SINGLE")
    private String single;
    @JsonProperty("MULTIPLE")
    private String multiple;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SINGLE")
    public String getSingle() {
        return single;
    }

    @JsonProperty("SINGLE")
    public void setSingle(String single) {
        this.single = single;
    }

    @JsonProperty("MULTIPLE")
    public String getMultiple() {
        return multiple;
    }

    @JsonProperty("MULTIPLE")
    public void setMultiple(String multiple) {
        this.multiple = multiple;
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
