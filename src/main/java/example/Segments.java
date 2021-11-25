
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EURO",
    "QUESTS",
    "ACHIEVEMENTS"
})
@Generated("jsonschema2pojo")
@ToString
public class Segments {

    @JsonProperty("EURO")
    private String euro;
    @JsonProperty("QUESTS")
    private String quests;
    @JsonProperty("ACHIEVEMENTS")
    private String achievements;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EURO")
    public String getEuro() {
        return euro;
    }

    @JsonProperty("EURO")
    public void setEuro(String euro) {
        this.euro = euro;
    }

    @JsonProperty("QUESTS")
    public String getQuests() {
        return quests;
    }

    @JsonProperty("QUESTS")
    public void setQuests(String quests) {
        this.quests = quests;
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
