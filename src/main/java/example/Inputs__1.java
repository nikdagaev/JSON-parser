
package example;

import com.fasterxml.jackson.annotation.*;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "USERNAME",
    "PASSWORD",
    "FIRST_NAME",
    "LAST_NAME",
    "DATE_OF_BIRTH",
    "EMAIL",
    "COUNTRY",
    "GENDER",
    "SELECT_YOUR_GENDER",
    "PASSPORT_NUMBER",
    "PHONE_NUMBER",
    "SMS_CODE",
    "TERM_COND_1",
    "TERM_COND_LINK",
    "TERM_COND_2",
    "TERM_COND_3"
})
@Generated("jsonschema2pojo")
@ToString
public class Inputs__1 {

    @JsonProperty("USERNAME")
    private String username;
    @JsonProperty("PASSWORD")
    private String password;
    @JsonProperty("FIRST_NAME")
    private String firstName;
    @JsonProperty("LAST_NAME")
    private String lastName;
    @JsonProperty("DATE_OF_BIRTH")
    private String dateOfBirth;
    @JsonProperty("EMAIL")
    private String email;
    @JsonProperty("COUNTRY")
    private String country;
    @JsonProperty("GENDER")
    private String gender;
    @JsonProperty("SELECT_YOUR_GENDER")
    private String selectYourGender;
    @JsonProperty("PASSPORT_NUMBER")
    private String passportNumber;
    @JsonProperty("PHONE_NUMBER")
    private String phoneNumber;
    @JsonProperty("SMS_CODE")
    private String smsCode;
    @JsonProperty("TERM_COND_1")
    private String termCond1;
    @JsonProperty("TERM_COND_LINK")
    private String termCondLink;
    @JsonProperty("TERM_COND_2")
    private String termCond2;
    @JsonProperty("TERM_COND_3")
    private String termCond3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("USERNAME")
    public String getUsername() {
        return username;
    }

    @JsonProperty("USERNAME")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("PASSWORD")
    public String getPassword() {
        return password;
    }

    @JsonProperty("PASSWORD")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("FIRST_NAME")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("LAST_NAME")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("LAST_NAME")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("DATE_OF_BIRTH")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonProperty("DATE_OF_BIRTH")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("EMAIL")
    public String getEmail() {
        return email;
    }

    @JsonProperty("EMAIL")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("COUNTRY")
    public String getCountry() {
        return country;
    }

    @JsonProperty("COUNTRY")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("GENDER")
    public String getGender() {
        return gender;
    }

    @JsonProperty("GENDER")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("SELECT_YOUR_GENDER")
    public String getSelectYourGender() {
        return selectYourGender;
    }

    @JsonProperty("SELECT_YOUR_GENDER")
    public void setSelectYourGender(String selectYourGender) {
        this.selectYourGender = selectYourGender;
    }

    @JsonProperty("PASSPORT_NUMBER")
    public String getPassportNumber() {
        return passportNumber;
    }

    @JsonProperty("PASSPORT_NUMBER")
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @JsonProperty("PHONE_NUMBER")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("PHONE_NUMBER")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("SMS_CODE")
    public String getSmsCode() {
        return smsCode;
    }

    @JsonProperty("SMS_CODE")
    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    @JsonProperty("TERM_COND_1")
    public String getTermCond1() {
        return termCond1;
    }

    @JsonProperty("TERM_COND_1")
    public void setTermCond1(String termCond1) {
        this.termCond1 = termCond1;
    }

    @JsonProperty("TERM_COND_LINK")
    public String getTermCondLink() {
        return termCondLink;
    }

    @JsonProperty("TERM_COND_LINK")
    public void setTermCondLink(String termCondLink) {
        this.termCondLink = termCondLink;
    }

    @JsonProperty("TERM_COND_2")
    public String getTermCond2() {
        return termCond2;
    }

    @JsonProperty("TERM_COND_2")
    public void setTermCond2(String termCond2) {
        this.termCond2 = termCond2;
    }

    @JsonProperty("TERM_COND_3")
    public String getTermCond3() {
        return termCond3;
    }

    @JsonProperty("TERM_COND_3")
    public void setTermCond3(String termCond3) {
        this.termCond3 = termCond3;
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
