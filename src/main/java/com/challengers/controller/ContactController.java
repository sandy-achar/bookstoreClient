package com.challengers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Malika(mxp134930) on 12/14/2015.
 */

@Controller
public class ContactController {

    @RequestMapping("/contactus")
    public String contactInfo(Model model){
        return "contact";
    }
}
