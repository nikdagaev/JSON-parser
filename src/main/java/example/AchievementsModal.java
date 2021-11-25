
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CONGRATULATION",
    "GOT_ACHIEVEMENT_1",
    "GOT_ACHIEVEMENT_2"
})
@Generated("jsonschema2pojo")
@ToString
public class AchievementsModal {

    @JsonProperty("CONGRATULATION")
    private String congratulation;
    @JsonProperty("GOT_ACHIEVEMENT_1")
    private String gotAchievement1;
    @JsonProperty("GOT_ACHIEVEMENT_2")
    private String gotAchievement2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CONGRATULATION")
    public String getCongratulation() {
        return congratulation;
    }

    @JsonProperty("CONGRATULATION")
    public void setCongratulation(String congratulation) {
        this.congratulation = congratulation;
    }

    @JsonProperty("GOT_ACHIEVEMENT_1")
    public String getGotAchievement1() {
        return gotAchievement1;
    }

    @JsonProperty("GOT_ACHIEVEMENT_1")
    public void setGotAchievement1(String gotAchievement1) {
        this.gotAchievement1 = gotAchievement1;
    }

    @JsonProperty("GOT_ACHIEVEMENT_2")
    public String getGotAchievement2() {
        return gotAchievement2;
    }

    @JsonProperty("GOT_ACHIEVEMENT_2")
    public void setGotAchievement2(String gotAchievement2) {
        this.gotAchievement2 = gotAchievement2;
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
