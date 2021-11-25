
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
    "BIRTH_DATE",
    "EMAIL",
    "COUNTRY",
    "CITY",
    "ADDRESS",
    "PHONE",
    "GENDER"
})
@Generated("jsonschema2pojo")
@ToString
public class Inputs {

    @JsonProperty("USERNAME")
    private String username;
    @JsonProperty("PASSWORD")
    private String password;
    @JsonProperty("FIRST_NAME")
    private String firstName;
    @JsonProperty("LAST_NAME")
    private String lastName;
    @JsonProperty("BIRTH_DATE")
    private String birthDate;
    @JsonProperty("EMAIL")
    private String email;
    @JsonProperty("COUNTRY")
    private String country;
    @JsonProperty("CITY")
    private String city;
    @JsonProperty("ADDRESS")
    private String address;
    @JsonProperty("PHONE")
    private String phone;
    @JsonProperty("GENDER")
    private String gender;
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

    @JsonProperty("BIRTH_DATE")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("BIRTH_DATE")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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

    @JsonProperty("CITY")
    public String getCity() {
        return city;
    }

    @JsonProperty("CITY")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("ADDRESS")
    public String getAddress() {
        return address;
    }

    @JsonProperty("ADDRESS")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("PHONE")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("PHONE")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("GENDER")
    public String getGender() {
        return gender;
    }

    @JsonProperty("GENDER")
    public void setGender(String gender) {
        this.gender = gender;
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
