
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLE",
    "SUB_TITLE",
    "SUB_TITLE_2"
})
@Generated("jsonschema2pojo")
@ToString
public class NotBets {

    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("SUB_TITLE")
    private String subTitle;
    @JsonProperty("SUB_TITLE_2")
    private String subTitle2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("TITLE")
    public String getTitle() {
        return title;
    }

    @JsonProperty("TITLE")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("SUB_TITLE")
    public String getSubTitle() {
        return subTitle;
    }

    @JsonProperty("SUB_TITLE")
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @JsonProperty("SUB_TITLE_2")
    public String getSubTitle2() {
        return subTitle2;
    }

    @JsonProperty("SUB_TITLE_2")
    public void setSubTitle2(String subTitle2) {
        this.subTitle2 = subTitle2;
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
