package com.challengers;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by darkstar on 12/5/15.
 * Function to be run for specific user services
 */

@Component
public class UserControllerMethods {

    private String baseUrl = "http://localhost:8084/user/";
    //Attributes for this class
    RestTemplate rest = new RestTemplate();

    public UserControllerMethods() {}

    //Methods
   /* public boolean userLogin(String userName, String password) {

        LoginUser login = new LoginUser(userName, password);
        String uri = baseUrl +"login";
        String result = rest.postForObject(uri, login, String.class);

        if (result.equals("Success")) {

            return true;

        } else {

            return false;

        }
    }*/

    public User userLogin(String userName){
        String uri = baseUrl +"login";
        return rest.postForObject(uri, userName, User.class);
    }

    public String userRegister(User user) {
        user.setPassword(new Md5PasswordEncoder().encodePassword(user.getPassword(), null));

        String uri = baseUrl +"registeruser";
        String result = rest.postForObject(uri, user, String.class);

        return result;

    }

    public String userUpdate(User user) {

        String uri = baseUrl +"updateuser/"+user.getUserName();
        String result = rest.postForObject(uri, user, String.class);
        return result;
    }
}
