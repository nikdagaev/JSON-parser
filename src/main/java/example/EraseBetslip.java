
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLE",
    "SUBTITLE",
    "CONFIRM_BUTTON"
})
@Generated("jsonschema2pojo")
@ToString
public class EraseBetslip {

    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("SUBTITLE")
    private String subtitle;
    @JsonProperty("CONFIRM_BUTTON")
    private String confirmButton;
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

    @JsonProperty("SUBTITLE")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("SUBTITLE")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("CONFIRM_BUTTON")
    public String getConfirmButton() {
        return confirmButton;
    }

    @JsonProperty("CONFIRM_BUTTON")
    public void setConfirmButton(String confirmButton) {
        this.confirmButton = confirmButton;
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
