
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLE",
    "MESSAGE",
    "BUTTON"
})
@Generated("jsonschema2pojo")
@ToString
public class EmptyList {

    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("MESSAGE")
    private String message;
    @JsonProperty("BUTTON")
    private String button;
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

    @JsonProperty("MESSAGE")
    public String getMessage() {
        return message;
    }

    @JsonProperty("MESSAGE")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("BUTTON")
    public String getButton() {
        return button;
    }

    @JsonProperty("BUTTON")
    public void setButton(String button) {
        this.button = button;
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
