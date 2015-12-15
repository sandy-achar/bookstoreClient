package com.challengers.controller;

import com.challengers.User;
import com.challengers.UserControllerMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

/**
 * Created by Malika(mxp134930) on 12/13/2015.
 */
@Controller
public class UserController {

    @Autowired
    private UserControllerMethods userControllerMethods;

    @RequestMapping("/profile")
    public String getUserProfile(Model model, Principal principal){
        User user = userControllerMethods.userLogin(principal.getName());
        model.addAttribute("user", user);
        return "profile";
    }

    @RequestMapping("/updateuser")
    public String updateUserProfile(Model model, Principal principal){
        User userToUpdate = userControllerMethods.userLogin(principal.getName());
        model.addAttribute("usertoupdate", userToUpdate);
        return "updateuserprofile";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(@RequestParam Long userId, @ModelAttribute User user, Model model){
        String result = userControllerMethods.userUpdate(user, userId);
        model.addAttribute("result", result);
        model.addAttribute("usertoupdate", user);
        return "updateuserprofile";
    }
}
