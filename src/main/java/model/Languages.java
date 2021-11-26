
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EN",
    "RU",
    "UK",
    "HY"
})
@Generated("jsonschema2pojo")
@ToString
public class Languages {

    @JsonProperty("EN")
    private String en;
    @JsonProperty("RU")
    private String ru;
    @JsonProperty("UK")
    private String uk;
    @JsonProperty("HY")
    private String hy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EN")
    public String getEn() {
        return en;
    }

    @JsonProperty("EN")
    public void setEn(String en) {
        this.en = en;
    }

    @JsonProperty("RU")
    public String getRu() {
        return ru;
    }

    @JsonProperty("RU")
    public void setRu(String ru) {
        this.ru = ru;
    }

    @JsonProperty("UK")
    public String getUk() {
        return uk;
    }

    @JsonProperty("UK")
    public void setUk(String uk) {
        this.uk = uk;
    }

    @JsonProperty("HY")
    public String getHy() {
        return hy;
    }

    @JsonProperty("HY")
    public void setHy(String hy) {
        this.hy = hy;
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
