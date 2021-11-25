
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LIMITED_TIME_ACHIEVEMENTS",
    "LOOK_ON_A_MAP",
    "POPULAR_PARLAY"
})
@Generated("jsonschema2pojo")
@ToString
public class RecommendsCard {

    @JsonProperty("LIMITED_TIME_ACHIEVEMENTS")
    private String limitedTimeAchievements;
    @JsonProperty("LOOK_ON_A_MAP")
    private String lookOnAMap;
    @JsonProperty("POPULAR_PARLAY")
    private PopularParlay popularParlay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LIMITED_TIME_ACHIEVEMENTS")
    public String getLimitedTimeAchievements() {
        return limitedTimeAchievements;
    }

    @JsonProperty("LIMITED_TIME_ACHIEVEMENTS")
    public void setLimitedTimeAchievements(String limitedTimeAchievements) {
        this.limitedTimeAchievements = limitedTimeAchievements;
    }

    @JsonProperty("LOOK_ON_A_MAP")
    public String getLookOnAMap() {
        return lookOnAMap;
    }

    @JsonProperty("LOOK_ON_A_MAP")
    public void setLookOnAMap(String lookOnAMap) {
        this.lookOnAMap = lookOnAMap;
    }

    @JsonProperty("POPULAR_PARLAY")
    public PopularParlay getPopularParlay() {
        return popularParlay;
    }

    @JsonProperty("POPULAR_PARLAY")
    public void setPopularParlay(PopularParlay popularParlay) {
        this.popularParlay = popularParlay;
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
