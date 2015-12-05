package com.challengers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BookstoreClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookstoreClientApplication.class, args);

        //Check if the web service works properly
        RestTemplate rest = new RestTemplate();
        String uri, result;

        //Make an object for login to send to the service
        System.out.println("Checking for login service.");
        LoginUser login = new LoginUser("sandesh", "sandesh");
        uri = "http://localhost:8084/user/login";
        result = rest.postForObject(uri, login, String.class);
        System.out.println(result);

        //Check for user Register
        System.out.println("Checking for user register service");
        User user = new User("hulk", "greenStuff", "Bruce", "M", "Banner", "410 Firwood Place", "Plano", "75075", "Texas", "United States");
        uri = "http://localhost:8084/user/registeruser";
        result = rest.postForObject(uri, user, String.class);
        System.out.println(result);
    }
}
