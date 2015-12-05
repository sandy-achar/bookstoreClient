package com.challengers;

import org.springframework.web.client.RestTemplate;

/**
 * Created by darkstar on 12/5/15.
 * Function to be run for specific user services
 */

public class UserControllerMethods {

    //Attributes for this class
    RestTemplate rest = new RestTemplate();

    public UserControllerMethods() {}

    //Methods
    public boolean userLogin(String userName, String password) {

        LoginUser login = new LoginUser(userName, password);
        String uri = "http://localhost:8084/user/login";
        String result = rest.postForObject(uri, login, String.class);

        if (result.equals("Success")) {

            return true;

        } else {

            return false;

        }
    }

    public String userRegister(User user) {

        String uri = "http://localhost:8084/user/registeruser";
        String result = rest.postForObject(uri, user, String.class);

        return result;

    }

    public String userUpdate(User user) {

        String uri = "http://localhost:8084/user/updateuser/"+user.getUserName();
        String result = rest.postForObject(uri, user, String.class);
        return result;
    }
}
