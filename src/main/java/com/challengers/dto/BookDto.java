package com.challengers.dto;

import com.challengers.Book;

import java.util.Collections;

/**
 * Created by Malika(mxp134930) on 12/15/2015.
 */
public class BookDto {

    private String bookTitle;
    private String authorName;
    private String publisherName;
    private int publishedYear;
    private String isbn;
    private String language;
    private double price;
    private int quantity;
    private String image;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Book transformToBook(){
        Book book = new Book();
        book.setBookTitle(getBookTitle());
        book.setAuthorNames(Collections.singleton(getAuthorName()));
        book.setPublisherNames(Collections.singleton(getPublisherName()));
        book.setPublishedYear(getPublishedYear());
        book.setIsbn(getIsbn());
        book.setPrice(getPrice());
        book.setLanguage(getLanguage());
        book.setQuantity(getQuantity());
        book.setImage(getImage());


        return  book;
    }
}
