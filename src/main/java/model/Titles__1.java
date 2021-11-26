
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EXTRA_ACHIEVEMENTS",
    "ACHIEVEMENTS"
})
@Generated("jsonschema2pojo")
@ToString
public class Titles__1 {

    @JsonProperty("EXTRA_ACHIEVEMENTS")
    private String extraAchievements;
    @JsonProperty("ACHIEVEMENTS")
    private String achievements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EXTRA_ACHIEVEMENTS")
    public String getExtraAchievements() {
        return extraAchievements;
    }

    @JsonProperty("EXTRA_ACHIEVEMENTS")
    public void setExtraAchievements(String extraAchievements) {
        this.extraAchievements = extraAchievements;
    }

    @JsonProperty("ACHIEVEMENTS")
    public String getAchievements() {
        return achievements;
    }

    @JsonProperty("ACHIEVEMENTS")
    public void setAchievements(String achievements) {
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
