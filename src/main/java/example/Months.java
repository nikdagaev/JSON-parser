
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "JUNE",
    "JUNE_JULY",
    "JULY"
})
@Generated("jsonschema2pojo")
@ToString
public class Months {

    @JsonProperty("JUNE")
    private String june;
    @JsonProperty("JUNE_JULY")
    private String juneJuly;
    @JsonProperty("JULY")
    private String july;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("JUNE")
    public String getJune() {
        return june;
    }

    @JsonProperty("JUNE")
    public void setJune(String june) {
        this.june = june;
    }

    @JsonProperty("JUNE_JULY")
    public String getJuneJuly() {
        return juneJuly;
    }

    @JsonProperty("JUNE_JULY")
    public void setJuneJuly(String juneJuly) {
        this.juneJuly = juneJuly;
    }

    @JsonProperty("JULY")
    public String getJuly() {
        return july;
    }

    @JsonProperty("JULY")
    public void setJuly(String july) {
        this.july = july;
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
