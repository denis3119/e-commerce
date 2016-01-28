package com.e_commerce.data.model.Product;

import com.e_commerce.data.enums.Currency;
import com.e_commerce.data.model.common.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by admin on 26.01.2016.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product extends AbstractEntity {
    private long count; //количество товара на складе
    private double price; //цена
    private Currency currency = Currency.USD; //валюта

    @Column(unique = true, nullable = false)
    private String number; //номер продукта, которыйн не может повторяться

    @OneToMany
    private List<Category> categories; //категории
}
