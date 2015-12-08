package com.challengers.controller;

import com.challengers.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Malika(mxp134930) on 12/7/2015.
 */

@Controller
public class RegisterController {
    @RequestMapping("/register")
    public String display(Model model){
        Book book = new Book();
        book.setBookTitle("Database");
        book.setIsbn("db12345");
        model.addAttribute("book", book);
        return "customerregister";
    }
}
