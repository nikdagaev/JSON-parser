
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLES",
    "BUTTONS",
    "NAVIGATION",
    "LANGUAGES"
})
@Generated("jsonschema2pojo")
@ToString
public class More {

    @JsonProperty("TITLES")
    private Titles titles;
    @JsonProperty("BUTTONS")
    private Buttons__1 buttons;
    @JsonProperty("NAVIGATION")
    private Navigation__1 navigation;
    @JsonProperty("LANGUAGES")
    private Languages languages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TITLES")
    public Titles getTitles() {
        return titles;
    }

    @JsonProperty("TITLES")
    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    @JsonProperty("BUTTONS")
    public Buttons__1 getButtons() {
        return buttons;
    }

    @JsonProperty("BUTTONS")
    public void setButtons(Buttons__1 buttons) {
        this.buttons = buttons;
    }

    @JsonProperty("NAVIGATION")
    public Navigation__1 getNavigation() {
        return navigation;
    }

    @JsonProperty("NAVIGATION")
    public void setNavigation(Navigation__1 navigation) {
        this.navigation = navigation;
    }

    @JsonProperty("LANGUAGES")
    public Languages getLanguages() {
        return languages;
    }

    @JsonProperty("LANGUAGES")
    public void setLanguages(Languages languages) {
        this.languages = languages;
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
