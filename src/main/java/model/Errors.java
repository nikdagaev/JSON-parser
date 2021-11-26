
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ERROR_1",
    "EMPTY_CAPTCHA"
})
@Generated("jsonschema2pojo")
@ToString
public class Errors {

    @JsonProperty("ERROR_1")
    private String error1;
    @JsonProperty("EMPTY_CAPTCHA")
    private String emptyCaptcha;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ERROR_1")
    public String getError1() {
        return error1;
    }

    @JsonProperty("ERROR_1")
    public void setError1(String error1) {
        this.error1 = error1;
    }

    @JsonProperty("EMPTY_CAPTCHA")
    public String getEmptyCaptcha() {
        return emptyCaptcha;
    }

    @JsonProperty("EMPTY_CAPTCHA")
    public void setEmptyCaptcha(String emptyCaptcha) {
        this.emptyCaptcha = emptyCaptcha;
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
