
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NEXT_STEP",
    "PREV_STEP",
    "SIGN_UP",
    "ACCEPT"
})
@Generated("jsonschema2pojo")
@ToString
public class Navigation {

    @JsonProperty("NEXT_STEP")
    private String nextStep;
    @JsonProperty("PREV_STEP")
    private String prevStep;
    @JsonProperty("SIGN_UP")
    private String signUp;
    @JsonProperty("ACCEPT")
    private String accept;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("NEXT_STEP")
    public String getNextStep() {
        return nextStep;
    }

    @JsonProperty("NEXT_STEP")
    public void setNextStep(String nextStep) {
        this.nextStep = nextStep;
    }

    @JsonProperty("PREV_STEP")
    public String getPrevStep() {
        return prevStep;
    }

    @JsonProperty("PREV_STEP")
    public void setPrevStep(String prevStep) {
        this.prevStep = prevStep;
    }

    @JsonProperty("SIGN_UP")
    public String getSignUp() {
        return signUp;
    }

    @JsonProperty("SIGN_UP")
    public void setSignUp(String signUp) {
        this.signUp = signUp;
    }

    @JsonProperty("ACCEPT")
    public String getAccept() {
        return accept;
    }

    @JsonProperty("ACCEPT")
    public void setAccept(String accept) {
        this.accept = accept;
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
