package com.challengers.controller;

import com.challengers.Book;
import com.challengers.BookControllerMethods;
import com.challengers.User;
import com.challengers.dto.BookSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Malika(mxp134930) on 12/13/2015.
 */
@Controller
public class HomeController {

    @Autowired
    private BookControllerMethods bookControllerMethods;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(@RequestParam(required = false) String category, @RequestParam(required = false) String query, Model model){

        List<Book> books = bookControllerMethods.getAllBooks();
        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getQuantity() > book.getSold())
                .collect(Collectors.toList());
        model.addAttribute("books", filteredBooks);
        model.addAttribute("bookSearch", new BookSearch());
        return "books";
    }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String books(@RequestParam(required = false) String category, @RequestParam(required = false) String query, Model model){

        List<Book> books = new ArrayList<>();
        if(category != null && query != null){
            if (category.equals("isbn")) {
                Book bookByISBN = bookControllerMethods.getBookByISBN(query);
                if (bookByISBN != null) {
                    books = Collections.singletonList(bookByISBN);
                }
            } else {
                books = bookControllerMethods.getBooksBy(category, query);
            }

        } else {
           books = bookControllerMethods.getAllBooks();
        }

        List<Book> filteredBooks = books.stream()
                .filter(book -> book.getQuantity() > book.getSold())
                .collect(Collectors.toList());


        model.addAttribute("books", filteredBooks);
        model.addAttribute("bookSearch", new BookSearch(category, query));
        return "books";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "findbyisbn", method = RequestMethod.GET)
    public
    @ResponseBody
    Book getBook(@RequestParam String isbn) {
        return bookControllerMethods.getBookByISBN(isbn);
    }
}
