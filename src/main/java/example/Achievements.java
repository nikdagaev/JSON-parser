
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLES"
})
@Generated("jsonschema2pojo")
@ToString
public class Achievements {

    @JsonProperty("TITLES")
    private Titles__1 titles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TITLES")
    public Titles__1 getTitles() {
        return titles;
    }

    @JsonProperty("TITLES")
    public void setTitles(Titles__1 titles) {
        this.titles = titles;
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
