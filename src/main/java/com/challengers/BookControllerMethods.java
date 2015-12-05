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

        System.out.println("\nSearch result for: " + title);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void getBookByAuthorName(String author) {

        String uri = "http://localhost:8084/book/author/" + author;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + author);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void getBookByPublisherName(String publisher) {

        String uri = "http://localhost:8084/book/publisher/" + publisher;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + publisher);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void getBookByISBN(String isbn) {

        String uri = "http://localhost:8084/book/isbn/" + isbn;
        Book book = rest.getForObject(uri, Book.class);

        System.out.println("\nSearch result for: " + isbn);
        System.out.println(book);
    }

    public void getBookBylanguage(String language) {

        String uri = "http://localhost:8084/book/language/" + language;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + language);

        for (Book i: books) {

            System.out.print(i);

        }
    }
}
