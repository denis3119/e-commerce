package com.e_commerce.service;


import com.e_commerce.data.model.user.Customer;
import com.e_commerce.service.common.MainService;

/**
 * Created by admin on 11/3/2015.
 */
public interface UserService extends MainService<Customer> {

    Customer getByEmail(String email);

    boolean userCreated(String email);

    boolean hasRole(String string, Customer customer);

    Customer current();

    Customer register(Customer customer);

}
