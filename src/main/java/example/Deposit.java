
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ERROR",
    "BALANCE",
    "DEPOSIT_BUTTON_TEXT",
    "ENTER_AMOUNT",
    "MIN",
    "MIN_VALUE",
    "MAX_VALUE",
    "STATE_MESSAGE"
})
@Generated("jsonschema2pojo")
@ToString
public class Deposit {

    @JsonProperty("ERROR")
    private String error;
    @JsonProperty("BALANCE")
    private String balance;
    @JsonProperty("DEPOSIT_BUTTON_TEXT")
    private String depositButtonText;
    @JsonProperty("ENTER_AMOUNT")
    private String enterAmount;
    @JsonProperty("MIN")
    private String min;
    @JsonProperty("MIN_VALUE")
    private String minValue;
    @JsonProperty("MAX_VALUE")
    private String maxValue;
    @JsonProperty("STATE_MESSAGE")
    private StateMessage stateMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ERROR")
    public String getError() {
        return error;
    }

    @JsonProperty("ERROR")
    public void setError(String error) {
        this.error = error;
    }

    @JsonProperty("BALANCE")
    public String getBalance() {
        return balance;
    }

    @JsonProperty("BALANCE")
    public void setBalance(String balance) {
        this.balance = balance;
    }

    @JsonProperty("DEPOSIT_BUTTON_TEXT")
    public String getDepositButtonText() {
        return depositButtonText;
    }

    @JsonProperty("DEPOSIT_BUTTON_TEXT")
    public void setDepositButtonText(String depositButtonText) {
        this.depositButtonText = depositButtonText;
    }

    @JsonProperty("ENTER_AMOUNT")
    public String getEnterAmount() {
        return enterAmount;
    }

    @JsonProperty("ENTER_AMOUNT")
    public void setEnterAmount(String enterAmount) {
        this.enterAmount = enterAmount;
    }

    @JsonProperty("MIN")
    public String getMin() {
        return min;
    }

    @JsonProperty("MIN")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("MIN_VALUE")
    public String getMinValue() {
        return minValue;
    }

    @JsonProperty("MIN_VALUE")
    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    @JsonProperty("MAX_VALUE")
    public String getMaxValue() {
        return maxValue;
    }

    @JsonProperty("MAX_VALUE")
    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    @JsonProperty("STATE_MESSAGE")
    public StateMessage getStateMessage() {
        return stateMessage;
    }

    @JsonProperty("STATE_MESSAGE")
    public void setStateMessage(StateMessage stateMessage) {
        this.stateMessage = stateMessage;
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
