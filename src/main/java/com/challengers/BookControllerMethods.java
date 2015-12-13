package com.challengers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by darkstar on 12/5/15.
 * Function to be run for book services
 */

@Component
public class BookControllerMethods {

    //Attributes for this class
    RestTemplate rest = new RestTemplate();

    String baseUrl = "http://localhost:8084/book/";

    //Class constructor
    public BookControllerMethods() {}

    //Methods
    public List<Book> getAllBooks() {
        String uri = baseUrl + "getbooks";
        Book[] result = rest.getForObject(uri, Book[].class);
        List<Book> books = Arrays.asList(result);

        return books;
    }

    public void getBookByTitle(String title) {

        String uri = baseUrl + "title/" + title;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + title);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void getBookByAuthorName(String author) {

        String uri = baseUrl + "author/" + author;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + author);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void getBookByPublisherName(String publisher) {

        String uri = baseUrl + "publisher/" + publisher;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + publisher);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void getBookByISBN(String isbn) {

        String uri = baseUrl + "isbn/" + isbn;
        Book book = rest.getForObject(uri, Book.class);

        System.out.println("\nSearch result for: " + isbn);
        System.out.println(book);
    }

    public void getBookBylanguage(String language) {

        String uri = baseUrl + "language/" + language;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + language);

        for (Book i: books) {

            System.out.print(i);

        }
    }

    public void addBook(Book book) {

        String uri = baseUrl + "addbook";
        String result = rest.postForObject(uri, book, String.class);
        System.out.println(result);

    }

    public void updateBook(Long bookId, Book book) {

        String uri = baseUrl + "updatebook/" + bookId;
        String result = rest.postForObject(uri, book, String.class);
        System.out.println(result);

    }
}
