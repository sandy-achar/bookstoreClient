package com.challengers.controller;

import com.challengers.Book;
import com.challengers.BookControllerMethods;
import com.challengers.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String home(Model model){
        List<Book> allBooks = bookControllerMethods.getAllBooks();

        List<Book> filteredBooks = allBooks.stream()
                .filter(book -> book.getQuantity() > book.getSold())
                .collect(Collectors.toList());


        model.addAttribute("books", filteredBooks);
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }
}
