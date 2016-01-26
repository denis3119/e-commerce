package com.e_commerce.web.controller;

import com.e_commerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.security.PermitAll;

/**
 * Created by admin on 14.12.2015.
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private UserService userService;

    @Secured("ROLE_USER")
    @RequestMapping(value = "/edit/layout", method = RequestMethod.GET)
    public String editProfileLayout() {
        return "private/edit-profile";
    }

    //  @ResponseBody
    @Secured("ROLE_USER")
    @RequestMapping(value = "/score/layout", method = RequestMethod.GET)
    public String editScoreLayout() {
        return "private/edit-score";
    }

    @Secured("ROLE_USER")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "/profile/index";
    }

    @PermitAll
    @RequestMapping(value = "/confirm/{id}/{hash}", method = RequestMethod.GET)
    public ModelAndView confirm(@PathVariable Long id, @PathVariable int hash, ModelAndView modelAndView) {
        modelAndView.addObject("userId", id);
        modelAndView.addObject("hash", hash);
        modelAndView.setViewName("/profile/confirm_form");
        return modelAndView;
    }
    
}
