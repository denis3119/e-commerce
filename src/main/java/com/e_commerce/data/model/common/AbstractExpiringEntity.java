package com.e_commerce.data.model.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by admin on 22.01.2016.
 */
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractExpiringEntity {
    @Id
    @GeneratedValue
    private long id;
}
