package com.e_commerce.web.controller;

import com.e_commerce.data.model.user.Customer;
import com.e_commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "index";
    }


    @RequestMapping(value = "/public/home/layout", method = RequestMethod.GET)
    public String testHome() {
        return "public/home";
    }

    @RequestMapping(value = "/login/layout", method = RequestMethod.GET)
    public String loginView() {
        return "public/login";
    }

    @RequestMapping(value = "/profile/layout", method = RequestMethod.GET)
    @Secured("ROLE_USER")
    public String profileView() {
        return "private/profile";
    }

    @RequestMapping(value = "/account/current", method = RequestMethod.GET)
    @ResponseBody
    @Secured("ROLE_USER")
    public Customer currentUser() {
        return userService.current();
    }
}
