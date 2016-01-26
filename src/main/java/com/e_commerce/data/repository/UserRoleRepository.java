package com.e_commerce.data.repository;

import com.e_commerce.data.model.user.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author admin.
 */
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
