
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "POTENTIAL_WINNINGS",
    "WIN",
    "AND",
    "OTHERS",
    "CASHED_OUT",
    "REFUND",
    "CASHOUT",
    "AMOUNT",
    "TOTAL_ODD",
    "BET",
    "DATE",
    "RESULT"
})
@Generated("jsonschema2pojo")
@ToString
public class BetCard {

    @JsonProperty("POTENTIAL_WINNINGS")
    private String potentialWinnings;
    @JsonProperty("WIN")
    private String win;
    @JsonProperty("AND")
    private String and;
    @JsonProperty("OTHERS")
    private String others;
    @JsonProperty("CASHED_OUT")
    private String cashedOut;
    @JsonProperty("REFUND")
    private String refund;
    @JsonProperty("CASHOUT")
    private String cashout;
    @JsonProperty("AMOUNT")
    private String amount;
    @JsonProperty("TOTAL_ODD")
    private String totalOdd;
    @JsonProperty("BET")
    private String bet;
    @JsonProperty("DATE")
    private String date;
    @JsonProperty("RESULT")
    private String result;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("POTENTIAL_WINNINGS")
    public String getPotentialWinnings() {
        return potentialWinnings;
    }

    @JsonProperty("POTENTIAL_WINNINGS")
    public void setPotentialWinnings(String potentialWinnings) {
        this.potentialWinnings = potentialWinnings;
    }

    @JsonProperty("WIN")
    public String getWin() {
        return win;
    }

    @JsonProperty("WIN")
    public void setWin(String win) {
        this.win = win;
    }

    @JsonProperty("AND")
    public String getAnd() {
        return and;
    }

    @JsonProperty("AND")
    public void setAnd(String and) {
        this.and = and;
    }

    @JsonProperty("OTHERS")
    public String getOthers() {
        return others;
    }

    @JsonProperty("OTHERS")
    public void setOthers(String others) {
        this.others = others;
    }

    @JsonProperty("CASHED_OUT")
    public String getCashedOut() {
        return cashedOut;
    }

    @JsonProperty("CASHED_OUT")
    public void setCashedOut(String cashedOut) {
        this.cashedOut = cashedOut;
    }

    @JsonProperty("REFUND")
    public String getRefund() {
        return refund;
    }

    @JsonProperty("REFUND")
    public void setRefund(String refund) {
        this.refund = refund;
    }

    @JsonProperty("CASHOUT")
    public String getCashout() {
        return cashout;
    }

    @JsonProperty("CASHOUT")
    public void setCashout(String cashout) {
        this.cashout = cashout;
    }

    @JsonProperty("AMOUNT")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("AMOUNT")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("TOTAL_ODD")
    public String getTotalOdd() {
        return totalOdd;
    }

    @JsonProperty("TOTAL_ODD")
    public void setTotalOdd(String totalOdd) {
        this.totalOdd = totalOdd;
    }

    @JsonProperty("BET")
    public String getBet() {
        return bet;
    }

    @JsonProperty("BET")
    public void setBet(String bet) {
        this.bet = bet;
    }

    @JsonProperty("DATE")
    public String getDate() {
        return date;
    }

    @JsonProperty("DATE")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("RESULT")
    public String getResult() {
        return result;
    }

    @JsonProperty("RESULT")
    public void setResult(String result) {
        this.result = result;
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
