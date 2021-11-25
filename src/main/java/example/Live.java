
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EMPTY_LIST"
})
@Generated("jsonschema2pojo")
@ToString
public class Live {

    @JsonProperty("EMPTY_LIST")
    private EmptyList emptyList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EMPTY_LIST")
    public EmptyList getEmptyList() {
        return emptyList;
    }

    @JsonProperty("EMPTY_LIST")
    public void setEmptyList(EmptyList emptyList) {
        this.emptyList = emptyList;
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
