
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RESULT",
    "SEGMENTS",
    "NOT_BETS",
    "NO_LOGIN",
    "UPDATING_DATA"
})
@Generated("jsonschema2pojo")
@ToString
public class MyBets {

    @JsonProperty("RESULT")
    private String result;
    @JsonProperty("SEGMENTS")
    private Segments__1 segments;
    @JsonProperty("NOT_BETS")
    private NotBets notBets;
    @JsonProperty("NO_LOGIN")
    private NoLogin noLogin;
    @JsonProperty("UPDATING_DATA")
    private UpdatingData updatingData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("RESULT")
    public String getResult() {
        return result;
    }

    @JsonProperty("RESULT")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("SEGMENTS")
    public Segments__1 getSegments() {
        return segments;
    }

    @JsonProperty("SEGMENTS")
    public void setSegments(Segments__1 segments) {
        this.segments = segments;
    }

    @JsonProperty("NOT_BETS")
    public NotBets getNotBets() {
        return notBets;
    }

    @JsonProperty("NOT_BETS")
    public void setNotBets(NotBets notBets) {
        this.notBets = notBets;
    }

    @JsonProperty("NO_LOGIN")
    public NoLogin getNoLogin() {
        return noLogin;
    }

    @JsonProperty("NO_LOGIN")
    public void setNoLogin(NoLogin noLogin) {
        this.noLogin = noLogin;
    }

    @JsonProperty("UPDATING_DATA")
    public UpdatingData getUpdatingData() {
        return updatingData;
    }

    @JsonProperty("UPDATING_DATA")
    public void setUpdatingData(UpdatingData updatingData) {
        this.updatingData = updatingData;
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
