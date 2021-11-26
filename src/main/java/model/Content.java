
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLE",
    "FIRST_SENTENCE",
    "ICON_TITLE",
    "FIRST_ICON",
    "SECOND_ICON",
    "THIRD_ICON",
    "FORTH_ICON",
    "TEXT",
    "BUTTON"
})
@Generated("jsonschema2pojo")
@ToString
public class Content {

    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("FIRST_SENTENCE")
    private String firstSentence;
    @JsonProperty("ICON_TITLE")
    private String iconTitle;
    @JsonProperty("FIRST_ICON")
    private String firstIcon;
    @JsonProperty("SECOND_ICON")
    private String secondIcon;
    @JsonProperty("THIRD_ICON")
    private String thirdIcon;
    @JsonProperty("FORTH_ICON")
    private String forthIcon;
    @JsonProperty("TEXT")
    private String text;
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

    @JsonProperty("FIRST_SENTENCE")
    public String getFirstSentence() {
        return firstSentence;
    }

    @JsonProperty("FIRST_SENTENCE")
    public void setFirstSentence(String firstSentence) {
        this.firstSentence = firstSentence;
    }

    @JsonProperty("ICON_TITLE")
    public String getIconTitle() {
        return iconTitle;
    }

    @JsonProperty("ICON_TITLE")
    public void setIconTitle(String iconTitle) {
        this.iconTitle = iconTitle;
    }

    @JsonProperty("FIRST_ICON")
    public String getFirstIcon() {
        return firstIcon;
    }

    @JsonProperty("FIRST_ICON")
    public void setFirstIcon(String firstIcon) {
        this.firstIcon = firstIcon;
    }

    @JsonProperty("SECOND_ICON")
    public String getSecondIcon() {
        return secondIcon;
    }

    @JsonProperty("SECOND_ICON")
    public void setSecondIcon(String secondIcon) {
        this.secondIcon = secondIcon;
    }

    @JsonProperty("THIRD_ICON")
    public String getThirdIcon() {
        return thirdIcon;
    }

    @JsonProperty("THIRD_ICON")
    public void setThirdIcon(String thirdIcon) {
        this.thirdIcon = thirdIcon;
    }

    @JsonProperty("FORTH_ICON")
    public String getForthIcon() {
        return forthIcon;
    }

    @JsonProperty("FORTH_ICON")
    public void setForthIcon(String forthIcon) {
        this.forthIcon = forthIcon;
    }

    @JsonProperty("TEXT")
    public String getText() {
        return text;
    }

    @JsonProperty("TEXT")
    public void setText(String text) {
        this.text = text;
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
