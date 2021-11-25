
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLE",
    "MESSAGE",
    "UPDATE",
    "CANCEL"
})
@Generated("jsonschema2pojo")
@ToString
public class NeedUpdate {

    @JsonProperty("TITLE")
    private Title title;
    @JsonProperty("MESSAGE")
    private Message message;
    @JsonProperty("UPDATE")
    private String update;
    @JsonProperty("CANCEL")
    private String cancel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TITLE")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("TITLE")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("MESSAGE")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("MESSAGE")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("UPDATE")
    public String getUpdate() {
        return update;
    }

    @JsonProperty("UPDATE")
    public void setUpdate(String update) {
        this.update = update;
    }

    @JsonProperty("CANCEL")
    public String getCancel() {
        return cancel;
    }

    @JsonProperty("CANCEL")
    public void setCancel(String cancel) {
        this.cancel = cancel;
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
