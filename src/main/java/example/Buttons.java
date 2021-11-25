
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SIGN_IN",
    "LOGIN",
    "SIGN_UP",
    "JOIN",
    "SIGN_OUT",
    "FORGOT_PASSWORD",
    "CANCEL",
    "ADD_TO_BETSLIP",
    "ADD_TO_BETSLIP_ADD",
    "YES",
    "No",
    "OK",
    "PLACE_BET",
    "ACCEPT_AND_PLACE_BET",
    "NEXT",
    "SAVE"
})
@Generated("jsonschema2pojo")
@ToString
public class Buttons {

    @JsonProperty("SIGN_IN")
    private String signIn;
    @JsonProperty("LOGIN")
    private String login;
    @JsonProperty("SIGN_UP")
    private String signUp;
    @JsonProperty("JOIN")
    private String join;
    @JsonProperty("SIGN_OUT")
    private String signOut;
    @JsonProperty("FORGOT_PASSWORD")
    private String forgotPassword;
    @JsonProperty("CANCEL")
    private String cancel;
    @JsonProperty("ADD_TO_BETSLIP")
    private String addToBetslip;
    @JsonProperty("ADD_TO_BETSLIP_ADD")
    private String addToBetslipAdd;
    @JsonProperty("YES")
    private String yes;
    @JsonProperty("No")
    private String no;
    @JsonProperty("OK")
    private String ok;
    @JsonProperty("PLACE_BET")
    private String placeBet;
    @JsonProperty("ACCEPT_AND_PLACE_BET")
    private String acceptAndPlaceBet;
    @JsonProperty("NEXT")
    private String next;
    @JsonProperty("SAVE")
    private String save;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SIGN_IN")
    public String getSignIn() {
        return signIn;
    }

    @JsonProperty("SIGN_IN")
    public void setSignIn(String signIn) {
        this.signIn = signIn;
    }

    @JsonProperty("LOGIN")
    public String getLogin() {
        return login;
    }

    @JsonProperty("LOGIN")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("SIGN_UP")
    public String getSignUp() {
        return signUp;
    }

    @JsonProperty("SIGN_UP")
    public void setSignUp(String signUp) {
        this.signUp = signUp;
    }

    @JsonProperty("JOIN")
    public String getJoin() {
        return join;
    }

    @JsonProperty("JOIN")
    public void setJoin(String join) {
        this.join = join;
    }

    @JsonProperty("SIGN_OUT")
    public String getSignOut() {
        return signOut;
    }

    @JsonProperty("SIGN_OUT")
    public void setSignOut(String signOut) {
        this.signOut = signOut;
    }

    @JsonProperty("FORGOT_PASSWORD")
    public String getForgotPassword() {
        return forgotPassword;
    }

    @JsonProperty("FORGOT_PASSWORD")
    public void setForgotPassword(String forgotPassword) {
        this.forgotPassword = forgotPassword;
    }

    @JsonProperty("CANCEL")
    public String getCancel() {
        return cancel;
    }

    @JsonProperty("CANCEL")
    public void setCancel(String cancel) {
        this.cancel = cancel;
    }

    @JsonProperty("ADD_TO_BETSLIP")
    public String getAddToBetslip() {
        return addToBetslip;
    }

    @JsonProperty("ADD_TO_BETSLIP")
    public void setAddToBetslip(String addToBetslip) {
        this.addToBetslip = addToBetslip;
    }

    @JsonProperty("ADD_TO_BETSLIP_ADD")
    public String getAddToBetslipAdd() {
        return addToBetslipAdd;
    }

    @JsonProperty("ADD_TO_BETSLIP_ADD")
    public void setAddToBetslipAdd(String addToBetslipAdd) {
        this.addToBetslipAdd = addToBetslipAdd;
    }

    @JsonProperty("YES")
    public String getYes() {
        return yes;
    }

    @JsonProperty("YES")
    public void setYes(String yes) {
        this.yes = yes;
    }

    @JsonProperty("No")
    public String getNo() {
        return no;
    }

    @JsonProperty("No")
    public void setNo(String no) {
        this.no = no;
    }

    @JsonProperty("OK")
    public String getOk() {
        return ok;
    }

    @JsonProperty("OK")
    public void setOk(String ok) {
        this.ok = ok;
    }

    @JsonProperty("PLACE_BET")
    public String getPlaceBet() {
        return placeBet;
    }

    @JsonProperty("PLACE_BET")
    public void setPlaceBet(String placeBet) {
        this.placeBet = placeBet;
    }

    @JsonProperty("ACCEPT_AND_PLACE_BET")
    public String getAcceptAndPlaceBet() {
        return acceptAndPlaceBet;
    }

    @JsonProperty("ACCEPT_AND_PLACE_BET")
    public void setAcceptAndPlaceBet(String acceptAndPlaceBet) {
        this.acceptAndPlaceBet = acceptAndPlaceBet;
    }

    @JsonProperty("NEXT")
    public String getNext() {
        return next;
    }

    @JsonProperty("NEXT")
    public void setNext(String next) {
        this.next = next;
    }

    @JsonProperty("SAVE")
    public String getSave() {
        return save;
    }

    @JsonProperty("SAVE")
    public void setSave(String save) {
        this.save = save;
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
