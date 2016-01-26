package com.e_commerce.data.repository;

import com.e_commerce.data.model.user.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Yugov Alexandr.
 */
@Repository
public interface UserRepository extends JpaRepository<Customer, Long> {
    Customer getByEmail(@Param("email") String email);
}
