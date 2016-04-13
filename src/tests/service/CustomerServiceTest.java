package service;

import com.e_commerce.data.model.user.Customer;
import com.e_commerce.data.repository.UserRepository;
import com.e_commerce.service.UserService;
import com.e_commerce.service.impl.UserServiceImpl;
import org.junit.After;
import org.junit.Test;

import static com.e_commerce.data.model.user.Role.ROLE_USER;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by admin on 22.01.2016.
 */

public class CustomerServiceTest {
    private UserService userService = mock(UserServiceImpl.class);
    private String testEmail = "test@test.com";
    private Customer customer = createUser();

    @Test
    public void Register() {
        assertNotNull(customer);
        assertNotNull(customer.getUserRoles());
    }


    private Customer createUser() {
        Customer customer = new Customer("password", testEmail);
        return customer;
    }

}
