
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "REG_IS_DONE_HEAD",
    "REG_IS_DONE_TEXT"
})
@Generated("jsonschema2pojo")
@ToString
public class Result {

    @JsonProperty("REG_IS_DONE_HEAD")
    private String regIsDoneHead;
    @JsonProperty("REG_IS_DONE_TEXT")
    private String regIsDoneText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("REG_IS_DONE_HEAD")
    public String getRegIsDoneHead() {
        return regIsDoneHead;
    }

    @JsonProperty("REG_IS_DONE_HEAD")
    public void setRegIsDoneHead(String regIsDoneHead) {
        this.regIsDoneHead = regIsDoneHead;
    }

    @JsonProperty("REG_IS_DONE_TEXT")
    public String getRegIsDoneText() {
        return regIsDoneText;
    }

    @JsonProperty("REG_IS_DONE_TEXT")
    public void setRegIsDoneText(String regIsDoneText) {
        this.regIsDoneText = regIsDoneText;
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
