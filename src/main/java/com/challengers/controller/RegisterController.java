package com.challengers.controller;

import com.challengers.Book;
import com.challengers.User;
import com.challengers.UserControllerMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Malika(mxp134930) on 12/7/2015.
 */

@Controller
public class RegisterController {

    @Autowired
    private UserControllerMethods userControllerMethods;

    @RequestMapping("/showregisterform")
    public String registerUser(Model model){
        model.addAttribute("user", new User());
        return "customerregister";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String display(@ModelAttribute User user, Model model){
        String result = userControllerMethods.userRegister(user);
        model.addAttribute("result", result);
        return "customerregister";
    }
}
