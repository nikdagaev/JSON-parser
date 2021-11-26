
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "INFO",
    "NAVIGATION",
    "RESULT",
    "GENDER_NAME",
    "INPUTS",
    "ERRORS"
})
@Generated("jsonschema2pojo")
@ToString
public class Registration {

    @JsonProperty("INFO")
    private Info__1 info;
    @JsonProperty("NAVIGATION")
    private Navigation navigation;
    @JsonProperty("RESULT")
    private Result result;
    @JsonProperty("GENDER_NAME")
    private GenderName genderName;
    @JsonProperty("INPUTS")
    private Inputs__1 inputs;
    @JsonProperty("ERRORS")
    private Errors errors;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("INFO")
    public Info__1 getInfo() {
        return info;
    }

    @JsonProperty("INFO")
    public void setInfo(Info__1 info) {
        this.info = info;
    }

    @JsonProperty("NAVIGATION")
    public Navigation getNavigation() {
        return navigation;
    }

    @JsonProperty("NAVIGATION")
    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    @JsonProperty("RESULT")
    public Result getResult() {
        return result;
    }

    @JsonProperty("RESULT")
    public void setResult(Result result) {
        this.result = result;
    }

    @JsonProperty("GENDER_NAME")
    public GenderName getGenderName() {
        return genderName;
    }

    @JsonProperty("GENDER_NAME")
    public void setGenderName(GenderName genderName) {
        this.genderName = genderName;
    }

    @JsonProperty("INPUTS")
    public Inputs__1 getInputs() {
        return inputs;
    }

    @JsonProperty("INPUTS")
    public void setInputs(Inputs__1 inputs) {
        this.inputs = inputs;
    }

    @JsonProperty("ERRORS")
    public Errors getErrors() {
        return errors;
    }

    @JsonProperty("ERRORS")
    public void setErrors(Errors errors) {
        this.errors = errors;
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
