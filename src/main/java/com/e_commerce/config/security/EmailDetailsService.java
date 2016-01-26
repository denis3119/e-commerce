package com.e_commerce.config.security;

import com.e_commerce.data.model.user.Customer;
import com.e_commerce.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class EmailDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        Customer persistedCustomer = userRepository.getByEmail(email);
        if (persistedCustomer == null) {
            throw new UsernameNotFoundException("No user found for username: " + email);
        }
        return persistedCustomer;
    }
}