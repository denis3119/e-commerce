package com.e_commerce.data.model.Product;

import com.e_commerce.data.enums.Currency;
import com.e_commerce.data.model.common.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by admin on 26.01.2016.
 */
@Entity
@Getter
@Setter
@Transactional
@NoArgsConstructor
public class Product extends AbstractEntity {
    private long count; //количество товара на складе
    private double price; //цена
    private Currency currency = Currency.USD; //валюта

    @Column(unique = true, nullable = false)
    private String number = UUID.randomUUID().toString(); //номер продукта, который не может повторяться

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Category> categories = new HashSet<>(); //категории
    @ManyToOne
    private ProductType productType;
}
