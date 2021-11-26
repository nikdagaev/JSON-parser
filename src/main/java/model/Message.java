
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CURRENT_VERSION",
    "NEW_VERSION"
})
@Generated("jsonschema2pojo")
@ToString
public class Message {

    @JsonProperty("CURRENT_VERSION")
    private String currentVersion;
    @JsonProperty("NEW_VERSION")
    private String newVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CURRENT_VERSION")
    public String getCurrentVersion() {
        return currentVersion;
    }

    @JsonProperty("CURRENT_VERSION")
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    @JsonProperty("NEW_VERSION")
    public String getNewVersion() {
        return newVersion;
    }

    @JsonProperty("NEW_VERSION")
    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
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
