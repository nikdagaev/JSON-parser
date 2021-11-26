
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HALF",
    "QUARTER",
    "MAP",
    "SET",
    "HALF_TIME",
    "TIMEOUT"
})
@Generated("jsonschema2pojo")
@ToString
public class SetTimeForSport {

    @JsonProperty("HALF")
    private String half;
    @JsonProperty("QUARTER")
    private String quarter;
    @JsonProperty("MAP")
    private String map;
    @JsonProperty("SET")
    private String set;
    @JsonProperty("HALF_TIME")
    private String halfTime;
    @JsonProperty("TIMEOUT")
    private String timeout;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("HALF")
    public String getHalf() {
        return half;
    }

    @JsonProperty("HALF")
    public void setHalf(String half) {
        this.half = half;
    }

    @JsonProperty("QUARTER")
    public String getQuarter() {
        return quarter;
    }

    @JsonProperty("QUARTER")
    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    @JsonProperty("MAP")
    public String getMap() {
        return map;
    }

    @JsonProperty("MAP")
    public void setMap(String map) {
        this.map = map;
    }

    @JsonProperty("SET")
    public String getSet() {
        return set;
    }

    @JsonProperty("SET")
    public void setSet(String set) {
        this.set = set;
    }

    @JsonProperty("HALF_TIME")
    public String getHalfTime() {
        return halfTime;
    }

    @JsonProperty("HALF_TIME")
    public void setHalfTime(String halfTime) {
        this.halfTime = halfTime;
    }

    @JsonProperty("TIMEOUT")
    public String getTimeout() {
        return timeout;
    }

    @JsonProperty("TIMEOUT")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
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
