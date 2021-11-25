
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EMPTY_STATE"
})
@Generated("jsonschema2pojo")
@ToString
public class StadiumModal {

    @JsonProperty("EMPTY_STATE")
    private EmptyState emptyState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EMPTY_STATE")
    public EmptyState getEmptyState() {
        return emptyState;
    }

    @JsonProperty("EMPTY_STATE")
    public void setEmptyState(EmptyState emptyState) {
        this.emptyState = emptyState;
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
