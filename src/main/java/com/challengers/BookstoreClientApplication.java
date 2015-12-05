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

        //Make an object for login to send to the service
        LoginUser login = new LoginUser("sandesh", "sandesh");
        String uri = "http://localhost:8084/user/login";

        String result = rest.postForObject(uri, login, String.class);

        System.out.println(result);
    }
}
