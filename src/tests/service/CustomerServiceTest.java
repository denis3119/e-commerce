//package service;
//
//import com.e_commerce.config.Application;
//import com.e_commerce.data.model.user.Customer;
//import com.e_commerce.data.repository.UserRepository;
//import com.e_commerce.service.UserService;
//import org.junit.After;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import static com.e_commerce.data.model.user.Role.ROLE_USER;
//import static org.junit.Assert.*;
//
///**
// * Created by admin on 22.01.2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Application.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebAppConfiguration
//public class CustomerServiceTest {
//    @Autowired
//    UserService userService;
//    @Autowired
//    UserRepository userRepository;
//    private String testEmail = "test@test.com";
//
//    @Test
//    public void Register() {
//        Customer customer = createUser();
//        assertNotNull(customer);
//        assertNotNull(customer.getUserRoles());
//        assertTrue(customer.getUserRoles().iterator().next().getRole().equals(ROLE_USER.toString()));
//    }
//
//    @Test
//    public void Delete() {
//        Customer user = createUser();
//        userRepository.delete(user);
//        assertNull(userService.getByEmail(testEmail));
//    }
//
//
//    private Customer createUser() {
//        Customer customer = new Customer("password", testEmail);
//        return userService.register(customer);
//    }
//
//    @After
//    public void deleteUser() {
//        Customer customer = userService.getByEmail(testEmail);
//        if (customer != null) {
//            userRepository.delete(customer);
//        }
//    }
//}
