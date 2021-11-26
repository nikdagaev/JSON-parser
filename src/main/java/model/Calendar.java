
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MONTHS"
})
@Generated("jsonschema2pojo")
@ToString
public class Calendar {

    @JsonProperty("MONTHS")
    private Months months;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("MONTHS")
    public Months getMonths() {
        return months;
    }

    @JsonProperty("MONTHS")
    public void setMonths(Months months) {
        this.months = months;
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
