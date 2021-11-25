
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DEPOSIT",
    "WITHDRAWAL",
    "PAYMENT_HISTORY",
    "SECURITY",
    "LANGUAGE",
    "COLOR_THEME",
    "TIME",
    "ODDS_CHANGES",
    "CASHOUT_CHANGES",
    "ODDS_FORMAT",
    "FAQ",
    "CONTACT_US",
    "TERMS_CONDITIONS",
    "OPEN_SOURCE_LICENSE",
    "RESPONSIBLE_GAMBLING",
    "LICENSES_INFO",
    "APP_VERSION"
})
@Generated("jsonschema2pojo")
@ToString
public class Buttons__1 {

    @JsonProperty("DEPOSIT")
    private String deposit;
    @JsonProperty("WITHDRAWAL")
    private String withdrawal;
    @JsonProperty("PAYMENT_HISTORY")
    private String paymentHistory;
    @JsonProperty("SECURITY")
    private String security;
    @JsonProperty("LANGUAGE")
    private String language;
    @JsonProperty("COLOR_THEME")
    private String colorTheme;
    @JsonProperty("TIME")
    private String time;
    @JsonProperty("ODDS_CHANGES")
    private String oddsChanges;
    @JsonProperty("CASHOUT_CHANGES")
    private String cashoutChanges;
    @JsonProperty("ODDS_FORMAT")
    private String oddsFormat;
    @JsonProperty("FAQ")
    private String faq;
    @JsonProperty("CONTACT_US")
    private String contactUs;
    @JsonProperty("TERMS_CONDITIONS")
    private String termsConditions;
    @JsonProperty("OPEN_SOURCE_LICENSE")
    private String openSourceLicense;
    @JsonProperty("RESPONSIBLE_GAMBLING")
    private String responsibleGambling;
    @JsonProperty("LICENSES_INFO")
    private String licensesInfo;
    @JsonProperty("APP_VERSION")
    private String appVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DEPOSIT")
    public String getDeposit() {
        return deposit;
    }

    @JsonProperty("DEPOSIT")
    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    @JsonProperty("WITHDRAWAL")
    public String getWithdrawal() {
        return withdrawal;
    }

    @JsonProperty("WITHDRAWAL")
    public void setWithdrawal(String withdrawal) {
        this.withdrawal = withdrawal;
    }

    @JsonProperty("PAYMENT_HISTORY")
    public String getPaymentHistory() {
        return paymentHistory;
    }

    @JsonProperty("PAYMENT_HISTORY")
    public void setPaymentHistory(String paymentHistory) {
        this.paymentHistory = paymentHistory;
    }

    @JsonProperty("SECURITY")
    public String getSecurity() {
        return security;
    }

    @JsonProperty("SECURITY")
    public void setSecurity(String security) {
        this.security = security;
    }

    @JsonProperty("LANGUAGE")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("LANGUAGE")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("COLOR_THEME")
    public String getColorTheme() {
        return colorTheme;
    }

    @JsonProperty("COLOR_THEME")
    public void setColorTheme(String colorTheme) {
        this.colorTheme = colorTheme;
    }

    @JsonProperty("TIME")
    public String getTime() {
        return time;
    }

    @JsonProperty("TIME")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("ODDS_CHANGES")
    public String getOddsChanges() {
        return oddsChanges;
    }

    @JsonProperty("ODDS_CHANGES")
    public void setOddsChanges(String oddsChanges) {
        this.oddsChanges = oddsChanges;
    }

    @JsonProperty("CASHOUT_CHANGES")
    public String getCashoutChanges() {
        return cashoutChanges;
    }

    @JsonProperty("CASHOUT_CHANGES")
    public void setCashoutChanges(String cashoutChanges) {
        this.cashoutChanges = cashoutChanges;
    }

    @JsonProperty("ODDS_FORMAT")
    public String getOddsFormat() {
        return oddsFormat;
    }

    @JsonProperty("ODDS_FORMAT")
    public void setOddsFormat(String oddsFormat) {
        this.oddsFormat = oddsFormat;
    }

    @JsonProperty("FAQ")
    public String getFaq() {
        return faq;
    }

    @JsonProperty("FAQ")
    public void setFaq(String faq) {
        this.faq = faq;
    }

    @JsonProperty("CONTACT_US")
    public String getContactUs() {
        return contactUs;
    }

    @JsonProperty("CONTACT_US")
    public void setContactUs(String contactUs) {
        this.contactUs = contactUs;
    }

    @JsonProperty("TERMS_CONDITIONS")
    public String getTermsConditions() {
        return termsConditions;
    }

    @JsonProperty("TERMS_CONDITIONS")
    public void setTermsConditions(String termsConditions) {
        this.termsConditions = termsConditions;
    }

    @JsonProperty("OPEN_SOURCE_LICENSE")
    public String getOpenSourceLicense() {
        return openSourceLicense;
    }

    @JsonProperty("OPEN_SOURCE_LICENSE")
    public void setOpenSourceLicense(String openSourceLicense) {
        this.openSourceLicense = openSourceLicense;
    }

    @JsonProperty("RESPONSIBLE_GAMBLING")
    public String getResponsibleGambling() {
        return responsibleGambling;
    }

    @JsonProperty("RESPONSIBLE_GAMBLING")
    public void setResponsibleGambling(String responsibleGambling) {
        this.responsibleGambling = responsibleGambling;
    }

    @JsonProperty("LICENSES_INFO")
    public String getLicensesInfo() {
        return licensesInfo;
    }

    @JsonProperty("LICENSES_INFO")
    public void setLicensesInfo(String licensesInfo) {
        this.licensesInfo = licensesInfo;
    }

    @JsonProperty("APP_VERSION")
    public String getAppVersion() {
        return appVersion;
    }

    @JsonProperty("APP_VERSION")
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
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
