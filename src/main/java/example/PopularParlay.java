
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_1",
    "_2",
    "_3"
})
@Generated("jsonschema2pojo")
@ToString
public class PopularParlay {

    @JsonProperty("_1")
    private String _1;
    @JsonProperty("_2")
    private String _2;
    @JsonProperty("_3")
    private String _3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_1")
    public String get1() {
        return _1;
    }

    @JsonProperty("_1")
    public void set1(String _1) {
        this._1 = _1;
    }

    @JsonProperty("_2")
    public String get2() {
        return _2;
    }

    @JsonProperty("_2")
    public void set2(String _2) {
        this._2 = _2;
    }

    @JsonProperty("_3")
    public String get3() {
        return _3;
    }

    @JsonProperty("_3")
    public void set3(String _3) {
        this._3 = _3;
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
