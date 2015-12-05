package com.challengers;

import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by darkstar on 12/5/15.
 * Function to be run for book services
 */

public class BookControllerMethods {

    //Attributes for this class
    RestTemplate rest = new RestTemplate();

    //Class constructor
    public BookControllerMethods() {}

    //Methods
    public void getAllBooks() {

        String uri = "http://localhost:8084/book/getbooks";
        Book[] result = rest.getForObject(uri, Book[].class);
        List<Book> books = Arrays.asList(result);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void getBookByTitle(String title) {

        String uri = "http://localhost:8084/book/title/" + title;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("Search result for: " + title);

        for (Book i: books) {

            System.out.print(i);

        }
    }
}
