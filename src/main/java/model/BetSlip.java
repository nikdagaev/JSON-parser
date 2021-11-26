
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BUTTON_SINGLE",
    "BUTTON_PARLAY",
    "NAVIGATION_TITLE"
})
@Generated("jsonschema2pojo")
@ToString
public class BetSlip {

    @JsonProperty("BUTTON_SINGLE")
    private String buttonSingle;
    @JsonProperty("BUTTON_PARLAY")
    private String buttonParlay;
    @JsonProperty("NAVIGATION_TITLE")
    private String navigationTitle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BUTTON_SINGLE")
    public String getButtonSingle() {
        return buttonSingle;
    }

    @JsonProperty("BUTTON_SINGLE")
    public void setButtonSingle(String buttonSingle) {
        this.buttonSingle = buttonSingle;
    }

    @JsonProperty("BUTTON_PARLAY")
    public String getButtonParlay() {
        return buttonParlay;
    }

    @JsonProperty("BUTTON_PARLAY")
    public void setButtonParlay(String buttonParlay) {
        this.buttonParlay = buttonParlay;
    }

    @JsonProperty("NAVIGATION_TITLE")
    public String getNavigationTitle() {
        return navigationTitle;
    }

    @JsonProperty("NAVIGATION_TITLE")
    public void setNavigationTitle(String navigationTitle) {
        this.navigationTitle = navigationTitle;
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
