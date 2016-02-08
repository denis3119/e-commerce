package com.e_commerce.data.model.Product;

import com.e_commerce.data.model.common.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by admin on 08.02.2016.
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
public class ProductType extends AbstractEntity {
    String name;
}
