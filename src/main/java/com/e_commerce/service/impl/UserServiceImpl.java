package com.e_commerce.service.impl;

import com.e_commerce.config.mail.EmailSender;
import com.e_commerce.data.model.user.Customer;
import com.e_commerce.data.model.user.UserRole;
import com.e_commerce.data.repository.UserRepository;
import com.e_commerce.service.UserService;
import com.e_commerce.util.UserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.e_commerce.data.model.user.Role.ROLE_USER;

/**
 * Created by admin on 11/6/2015.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailSender sender;

    public Customer get(long ID) {
        return userRepository.getOne(ID);
    }

    public List<Customer> getAll() {
        return userRepository.findAll();
    }

    public Customer getByEmail(String email) {
        return userRepository.getByEmail(email);
    }

    @Override
    public boolean userCreated(String email) {
        return getByEmail(email) != null;
    }

    @Override
    public boolean hasRole(String string, Customer customer) {
        for (UserRole role : customer.getUserRoles()) {
            if (role.getRole().equals(string)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Customer current() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return userRepository.getByEmail(authentication.getName());
    }


    public Customer register(Customer customer) {
        Set<UserRole> userRoles = new LinkedHashSet<>();
        userRoles.add(new UserRole(ROLE_USER.name()));
        customer.setUserRoles(userRoles);
        customer.setPassword(UserUtil.getPasswordHash(customer.getPassword()));
        return userRepository.saveAndFlush(customer);
    }

    @Override
    public void remove(Customer customer) {
        userRepository.delete(customer);
    }
}
