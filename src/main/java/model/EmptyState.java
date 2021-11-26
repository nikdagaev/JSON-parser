
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MAIN_TEXT",
    "TEXT"
})
@Generated("jsonschema2pojo")
@ToString
public class EmptyState {

    @JsonProperty("MAIN_TEXT")
    private String mainText;
    @JsonProperty("TEXT")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MAIN_TEXT")
    public String getMainText() {
        return mainText;
    }

    @JsonProperty("MAIN_TEXT")
    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    @JsonProperty("TEXT")
    public String getText() {
        return text;
    }

    @JsonProperty("TEXT")
    public void setText(String text) {
        this.text = text;
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
