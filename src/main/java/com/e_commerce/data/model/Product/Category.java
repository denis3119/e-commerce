package com.e_commerce.data.model.Product;

import com.e_commerce.data.model.common.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

/**
 * Created by admin on 26.01.2016.
 */
@Entity
@Getter
@Setter
@Transactional
@NoArgsConstructor
public class Category extends AbstractEntity {
    @Column(nullable = false)
    String name;

    @OneToOne
    private Category subCategory;

    public boolean isParent() {
        return subCategory != null;
    }
}
