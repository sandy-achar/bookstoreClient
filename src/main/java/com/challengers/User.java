package com.challengers;

/**
 * Created by darkstar on 12/5/15.
 * Class for the user
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private Long userId;
    //Login Stuff
    private String userName;
    private String password;

    //Complete Name
    private String firstName;
    private String middleName;
    private String lastName;

    //User address
    private String street;
    private String city;
    private String zipCode;
    private String state;
    private String country;
    private String email;
    private String role;

    public User() {
    }

    //Constructor to init the User object
    public User(String userName, String password, String firstName, String middleName, String lastName, String street, String city, String zipCode, String state, String country, String email, String role) {

        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
        this.email = email;
        this.role = role;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    //Getter and Setter methods for the User
    public String getUserName() {

        return userName;

    }

    public void setUserName(String userName) {

        this.userName = userName;

    }

    public String getPassword() {

        return password;

    }

    public void setPassword(String password) {


        this.password = password;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getMiddleName() {

        return middleName;

    }

    public void setMiddleName(String middleName) {

        this.middleName = middleName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public String getStreet() {

        return street;

    }

    public void setStreet(String street) {

        this.street = street;

    }

    public String getCity() {

        return city;

    }

    public void setCity(String city) {

        this.city = city;

    }

    public String getZipCode() {

        return zipCode;

    }

    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;

    }

    public String getState() {

        return state;

    }

    public void setState(String state) {

        this.state = state;

    }

    public String getCountry() {

        return country;

    }

    public void setCountry(String country) {

        this.country = country;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
