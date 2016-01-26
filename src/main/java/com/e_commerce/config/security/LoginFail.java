package com.e_commerce.config.security;

import com.e_commerce.data.model.user.Customer;
import com.e_commerce.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginFail implements AuthenticationFailureHandler {

    @Autowired
    private UserService userService;

    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        String email = httpServletRequest.getParameter("username");
        Customer customer = userService.getByEmail(email);
        httpServletResponse.setStatus(401);
        httpServletResponse.sendRedirect("/#/login?error");
    }
}
