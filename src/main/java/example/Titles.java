
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "WALLET",
    "SETTINGS",
    "HELP"
})
@Generated("jsonschema2pojo")
@ToString
public class Titles {

    @JsonProperty("WALLET")
    private String wallet;
    @JsonProperty("SETTINGS")
    private String settings;
    @JsonProperty("HELP")
    private String help;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("WALLET")
    public String getWallet() {
        return wallet;
    }

    @JsonProperty("WALLET")
    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    @JsonProperty("SETTINGS")
    public String getSettings() {
        return settings;
    }

    @JsonProperty("SETTINGS")
    public void setSettings(String settings) {
        this.settings = settings;
    }

    @JsonProperty("HELP")
    public String getHelp() {
        return help;
    }

    @JsonProperty("HELP")
    public void setHelp(String help) {
        this.help = help;
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
