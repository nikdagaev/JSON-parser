
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ACTIVITY",
    "GAME",
    "MAP",
    "MY_BETS",
    "MORE"
})
@Generated("jsonschema2pojo")
@ToString
public class Tabs {

    @JsonProperty("ACTIVITY")
    private String activity;
    @JsonProperty("GAME")
    private String game;
    @JsonProperty("MAP")
    private String map;
    @JsonProperty("MY_BETS")
    private String myBets;
    @JsonProperty("MORE")
    private String more;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ACTIVITY")
    public String getActivity() {
        return activity;
    }

    @JsonProperty("ACTIVITY")
    public void setActivity(String activity) {
        this.activity = activity;
    }

    @JsonProperty("GAME")
    public String getGame() {
        return game;
    }

    @JsonProperty("GAME")
    public void setGame(String game) {
        this.game = game;
    }

    @JsonProperty("MAP")
    public String getMap() {
        return map;
    }

    @JsonProperty("MAP")
    public void setMap(String map) {
        this.map = map;
    }

    @JsonProperty("MY_BETS")
    public String getMyBets() {
        return myBets;
    }

    @JsonProperty("MY_BETS")
    public void setMyBets(String myBets) {
        this.myBets = myBets;
    }

    @JsonProperty("MORE")
    public String getMore() {
        return more;
    }

    @JsonProperty("MORE")
    public void setMore(String more) {
        this.more = more;
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
