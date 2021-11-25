
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NO_MARKETS_MAIN_TEXT",
    "NO_MARKETS_TEXT",
    "EVENT_ENDED"
})
@Generated("jsonschema2pojo")
@ToString
public class Game {

    @JsonProperty("NO_MARKETS_MAIN_TEXT")
    private String noMarketsMainText;
    @JsonProperty("NO_MARKETS_TEXT")
    private String noMarketsText;
    @JsonProperty("EVENT_ENDED")
    private EventEnded eventEnded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NO_MARKETS_MAIN_TEXT")
    public String getNoMarketsMainText() {
        return noMarketsMainText;
    }

    @JsonProperty("NO_MARKETS_MAIN_TEXT")
    public void setNoMarketsMainText(String noMarketsMainText) {
        this.noMarketsMainText = noMarketsMainText;
    }

    @JsonProperty("NO_MARKETS_TEXT")
    public String getNoMarketsText() {
        return noMarketsText;
    }

    @JsonProperty("NO_MARKETS_TEXT")
    public void setNoMarketsText(String noMarketsText) {
        this.noMarketsText = noMarketsText;
    }

    @JsonProperty("EVENT_ENDED")
    public EventEnded getEventEnded() {
        return eventEnded;
    }

    @JsonProperty("EVENT_ENDED")
    public void setEventEnded(EventEnded eventEnded) {
        this.eventEnded = eventEnded;
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
