
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TITLE",
    "SUB_TITLE",
    "FOOTER"
})
@Generated("jsonschema2pojo")
@ToString
public class Info {

    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("SUB_TITLE")
    private String subTitle;
    @JsonProperty("FOOTER")
    private String footer;
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

    @JsonProperty("FOOTER")
    public String getFooter() {
        return footer;
    }

    @JsonProperty("FOOTER")
    public void setFooter(String footer) {
        this.footer = footer;
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
