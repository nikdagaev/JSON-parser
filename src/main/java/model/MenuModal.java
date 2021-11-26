
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CHANGE_PROFILE_PHOTO",
    "SELECT_PROFILE_PICTURE",
    "REMOVE_PICTURE"
})
@Generated("jsonschema2pojo")
@ToString
public class MenuModal {

    @JsonProperty("CHANGE_PROFILE_PHOTO")
    private String changeProfilePhoto;
    @JsonProperty("SELECT_PROFILE_PICTURE")
    private String selectProfilePicture;
    @JsonProperty("REMOVE_PICTURE")
    private String removePicture;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CHANGE_PROFILE_PHOTO")
    public String getChangeProfilePhoto() {
        return changeProfilePhoto;
    }

    @JsonProperty("CHANGE_PROFILE_PHOTO")
    public void setChangeProfilePhoto(String changeProfilePhoto) {
        this.changeProfilePhoto = changeProfilePhoto;
    }

    @JsonProperty("SELECT_PROFILE_PICTURE")
    public String getSelectProfilePicture() {
        return selectProfilePicture;
    }

    @JsonProperty("SELECT_PROFILE_PICTURE")
    public void setSelectProfilePicture(String selectProfilePicture) {
        this.selectProfilePicture = selectProfilePicture;
    }

    @JsonProperty("REMOVE_PICTURE")
    public String getRemovePicture() {
        return removePicture;
    }

    @JsonProperty("REMOVE_PICTURE")
    public void setRemovePicture(String removePicture) {
        this.removePicture = removePicture;
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
