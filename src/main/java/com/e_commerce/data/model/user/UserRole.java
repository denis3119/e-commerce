package com.e_commerce.data.model.user;

import com.e_commerce.data.model.common.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author admin.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserRole extends AbstractEntity {

    private String role;

    public UserRole(String role) {
        this.role = role;
    }
}