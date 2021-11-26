
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLE",
    "EMPTY_ERROR"
})
@Generated("jsonschema2pojo")
@ToString
public class Direct {

    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("EMPTY_ERROR")
    private EmptyError emptyError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TITLE")
    public String getTitle() {
        return title;
    }

    @JsonProperty("TITLE")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("EMPTY_ERROR")
    public EmptyError getEmptyError() {
        return emptyError;
    }

    @JsonProperty("EMPTY_ERROR")
    public void setEmptyError(EmptyError emptyError) {
        this.emptyError = emptyError;
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
