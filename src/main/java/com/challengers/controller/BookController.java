package com.challengers.controller;

import com.challengers.Book;
import com.challengers.BookControllerMethods;
import com.challengers.User;
import com.challengers.UserControllerMethods;
import com.challengers.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

/**
 * Created by Malika(mxp134930) on 12/15/2015.
 */
@Controller
public class BookController {

    @Autowired
    private BookControllerMethods bookControllerMethods;

    @Autowired
    private UserControllerMethods userControllerMethods;

    @RequestMapping("/addbookform")
    public String addBookForm(Model model){
        model.addAttribute("book", new BookDto());
        return "addbook";
    }

    @RequestMapping(value = "/addbook", method = RequestMethod.POST)
    public String addBook(@ModelAttribute BookDto bookDto, Model model, Principal principal){
        Book book = bookDto.transformToBook();
        User user = userControllerMethods.userLogin(principal.getName());
        book.setUserId(user.getUserId());
        book.setSold(0);
        String result = bookControllerMethods.addBook(book);
        model.addAttribute("result", result);
        model.addAttribute("book", new BookDto());
        return "addbook";
    }
}
