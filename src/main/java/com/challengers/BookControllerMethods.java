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

        return Arrays.asList(result);
    }

    public List<Book> getBooksBy(String category, String query) {

        String uri = baseUrl + category + "/" + query;
        Book [] result = rest.getForObject(uri, Book[].class);
        return Arrays.asList(result);
    }

    /*public void getBookByAuthorName(String author) {

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
    }*/

    public Book getBookByISBN(String isbn) {

        String uri = baseUrl + "isbn/" + isbn;
        Book book = rest.getForObject(uri, Book.class);

        return book;
    }

    /*public void getBookBylanguage(String language) {

        String uri = baseUrl + "language/" + language;
        Book [] result = rest.getForObject(uri, Book[].class);
        List <Book> books = Arrays.asList(result);

        System.out.println("\nSearch result for: " + language);

        for (Book i: books) {

            System.out.print(i);

        }
    }*/

    public String  addBook(Book book) {

        String uri = baseUrl + "addbook";
        return rest.postForObject(uri, book, String.class);

    }

    public void updateBook(Long bookId, Book book) {

        String uri = baseUrl + "updatebook/" + bookId;
        String result = rest.postForObject(uri, book, String.class);
        System.out.println(result);

    }
}
