
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SEGMENTS",
    "EURO_TITLE",
    "ACHIEVEMENTS"
})
@Generated("jsonschema2pojo")
@ToString
public class Activity {

    @JsonProperty("SEGMENTS")
    private Segments segments;
    @JsonProperty("EURO_TITLE")
    private String euroTitle;
    @JsonProperty("ACHIEVEMENTS")
    private Achievements achievements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SEGMENTS")
    public Segments getSegments() {
        return segments;
    }

    @JsonProperty("SEGMENTS")
    public void setSegments(Segments segments) {
        this.segments = segments;
    }

    @JsonProperty("EURO_TITLE")
    public String getEuroTitle() {
        return euroTitle;
    }

    @JsonProperty("EURO_TITLE")
    public void setEuroTitle(String euroTitle) {
        this.euroTitle = euroTitle;
    }

    @JsonProperty("ACHIEVEMENTS")
    public Achievements getAchievements() {
        return achievements;
    }

    @JsonProperty("ACHIEVEMENTS")
    public void setAchievements(Achievements achievements) {
        this.achievements = achievements;
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
