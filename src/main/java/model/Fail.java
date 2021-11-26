
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
    "BUTTON_1"
})
@Generated("jsonschema2pojo")
@ToString
public class Fail {

    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("MESSAGE")
    private String message;
    @JsonProperty("BUTTON_1")
    private String button1;
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

    @JsonProperty("BUTTON_1")
    public String getButton1() {
        return button1;
    }

    @JsonProperty("BUTTON_1")
    public void setButton1(String button1) {
        this.button1 = button1;
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
