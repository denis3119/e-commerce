package com.e_commerce.service;


import com.e_commerce.data.model.user.Customer;

/**
 * Created by admin on 11/3/2015.
 */
public interface UserService {

    Customer getByEmail(String email);

    boolean userCreated(String email);

    boolean hasRole(String string, Customer customer);

    Customer current();

    Customer register(Customer customer);

    void remove(Customer customer);
}
