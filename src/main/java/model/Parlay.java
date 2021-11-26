
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MORE_THAN_TWO",
    "REMOVE_DELETED"
})
@Generated("jsonschema2pojo")
@ToString
public class Parlay {

    @JsonProperty("MORE_THAN_TWO")
    private String moreThanTwo;
    @JsonProperty("REMOVE_DELETED")
    private String removeDeleted;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MORE_THAN_TWO")
    public String getMoreThanTwo() {
        return moreThanTwo;
    }

    @JsonProperty("MORE_THAN_TWO")
    public void setMoreThanTwo(String moreThanTwo) {
        this.moreThanTwo = moreThanTwo;
    }

    @JsonProperty("REMOVE_DELETED")
    public String getRemoveDeleted() {
        return removeDeleted;
    }

    @JsonProperty("REMOVE_DELETED")
    public void setRemoveDeleted(String removeDeleted) {
        this.removeDeleted = removeDeleted;
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
