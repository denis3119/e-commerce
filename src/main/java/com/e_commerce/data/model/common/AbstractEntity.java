package com.e_commerce.data.model.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by admin on 22.01.2016.
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AbstractEntityListener.class)
public abstract class AbstractEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private Date creationDate;

    @Column
    private Date modificationDate;

    @Column
    private boolean expired = false;
}