
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SUCCESS",
    "FAIL"
})
@Generated("jsonschema2pojo")
@ToString
public class StateMessage {

    @JsonProperty("SUCCESS")
    private Success success;
    @JsonProperty("FAIL")
    private Fail fail;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SUCCESS")
    public Success getSuccess() {
        return success;
    }

    @JsonProperty("SUCCESS")
    public void setSuccess(Success success) {
        this.success = success;
    }

    @JsonProperty("FAIL")
    public Fail getFail() {
        return fail;
    }

    @JsonProperty("FAIL")
    public void setFail(Fail fail) {
        this.fail = fail;
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
