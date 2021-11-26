
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PROFILE",
    "PERSONAL_INFORMATION",
    "SELECT_PICTURE"
})
@Generated("jsonschema2pojo")
@ToString
public class Navigation__1 {

    @JsonProperty("PROFILE")
    private String profile;
    @JsonProperty("PERSONAL_INFORMATION")
    private String personalInformation;
    @JsonProperty("SELECT_PICTURE")
    private String selectPicture;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PROFILE")
    public String getProfile() {
        return profile;
    }

    @JsonProperty("PROFILE")
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @JsonProperty("PERSONAL_INFORMATION")
    public String getPersonalInformation() {
        return personalInformation;
    }

    @JsonProperty("PERSONAL_INFORMATION")
    public void setPersonalInformation(String personalInformation) {
        this.personalInformation = personalInformation;
    }

    @JsonProperty("SELECT_PICTURE")
    public String getSelectPicture() {
        return selectPicture;
    }

    @JsonProperty("SELECT_PICTURE")
    public void setSelectPicture(String selectPicture) {
        this.selectPicture = selectPicture;
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
