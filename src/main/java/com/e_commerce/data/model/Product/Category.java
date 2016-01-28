package com.e_commerce.data.model.Product;

import com.e_commerce.data.model.common.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by admin on 26.01.2016.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends AbstractEntity {
    @OneToOne
    private Category subCategory;

    public boolean isParent() {
        return subCategory != null;
    }
}
