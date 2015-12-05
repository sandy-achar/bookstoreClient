package com.challengers;

/**
 * Created by darkstar on 12/5/15.
 * * Class to handle the login service
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import sun.rmi.runtime.Log;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LoginUser {

    //Info needed for login
    private String userName;
    private String password;

    public LoginUser(String userName, String password) {

    this.userName = userName;
    this.password = password;

    }

    //Getter and setter methods

    public String getUserName() {

        return userName;

    }

    public String getPassword() {

        return password;

    }

    public void setUserName(String userName) {

        this.userName = userName;

    }

    public void setPassword(String password) {

        this.password = password;

    }
}
