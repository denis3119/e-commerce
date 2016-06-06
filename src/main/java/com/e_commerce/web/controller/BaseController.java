package com.e_commerce.web.controller;

import com.e_commerce.data.model.user.Customer;
import com.e_commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/account/current", method = RequestMethod.GET)
    @ResponseBody
    @Secured("ROLE_USER")
    public Customer currentUser() {
        return userService.current();
    }

    public ModelAndView getHomePage(){
        return new ModelAndView();
    }
    public ModelAndView getDetailPage(){
        return new ModelAndView();
    }
    public ModelAndView getCategoryPage(){
        return new ModelAndView();
    }
}
