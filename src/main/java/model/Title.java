
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RECOMMEND_UPDATE",
    "NEED_UPDATE"
})
@Generated("jsonschema2pojo")
@ToString
public class Title {

    @JsonProperty("RECOMMEND_UPDATE")
    private String recommendUpdate;
    @JsonProperty("NEED_UPDATE")
    private String needUpdate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RECOMMEND_UPDATE")
    public String getRecommendUpdate() {
        return recommendUpdate;
    }

    @JsonProperty("RECOMMEND_UPDATE")
    public void setRecommendUpdate(String recommendUpdate) {
        this.recommendUpdate = recommendUpdate;
    }

    @JsonProperty("NEED_UPDATE")
    public String getNeedUpdate() {
        return needUpdate;
    }

    @JsonProperty("NEED_UPDATE")
    public void setNeedUpdate(String needUpdate) {
        this.needUpdate = needUpdate;
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
