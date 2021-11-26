
package model;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SIGN_OUT",
    "REMOVE_AVATAR",
    "ERASE_BETSLIP",
    "BET_CASHOUT",
    "CHANGE_LANGUAGE",
    "NEED_UPDATE"
})
@Generated("jsonschema2pojo")
@ToString
public class Alerts {

    @JsonProperty("SIGN_OUT")
    private SignOut signOut;
    @JsonProperty("REMOVE_AVATAR")
    private RemoveAvatar removeAvatar;
    @JsonProperty("ERASE_BETSLIP")
    private EraseBetslip eraseBetslip;
    @JsonProperty("BET_CASHOUT")
    private BetCashout betCashout;
    @JsonProperty("CHANGE_LANGUAGE")
    private ChangeLanguage changeLanguage;
    @JsonProperty("NEED_UPDATE")
    private NeedUpdate needUpdate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SIGN_OUT")
    public SignOut getSignOut() {
        return signOut;
    }

    @JsonProperty("SIGN_OUT")
    public void setSignOut(SignOut signOut) {
        this.signOut = signOut;
    }

    @JsonProperty("REMOVE_AVATAR")
    public RemoveAvatar getRemoveAvatar() {
        return removeAvatar;
    }

    @JsonProperty("REMOVE_AVATAR")
    public void setRemoveAvatar(RemoveAvatar removeAvatar) {
        this.removeAvatar = removeAvatar;
    }

    @JsonProperty("ERASE_BETSLIP")
    public EraseBetslip getEraseBetslip() {
        return eraseBetslip;
    }

    @JsonProperty("ERASE_BETSLIP")
    public void setEraseBetslip(EraseBetslip eraseBetslip) {
        this.eraseBetslip = eraseBetslip;
    }

    @JsonProperty("BET_CASHOUT")
    public BetCashout getBetCashout() {
        return betCashout;
    }

    @JsonProperty("BET_CASHOUT")
    public void setBetCashout(BetCashout betCashout) {
        this.betCashout = betCashout;
    }

    @JsonProperty("CHANGE_LANGUAGE")
    public ChangeLanguage getChangeLanguage() {
        return changeLanguage;
    }

    @JsonProperty("CHANGE_LANGUAGE")
    public void setChangeLanguage(ChangeLanguage changeLanguage) {
        this.changeLanguage = changeLanguage;
    }

    @JsonProperty("NEED_UPDATE")
    public NeedUpdate getNeedUpdate() {
        return needUpdate;
    }

    @JsonProperty("NEED_UPDATE")
    public void setNeedUpdate(NeedUpdate needUpdate) {
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
