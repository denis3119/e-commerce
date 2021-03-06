package com.e_commerce.util;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by admin on 06.01.2016.
 */
public class UserUtil {
    public static String getPasswordHash(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
        return passwordEncoder.encode(password);
    }

    public static UserDetails getCurrentUserDetailInfo() {
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getDetails();
    }
}
