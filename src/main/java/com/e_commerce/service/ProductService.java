package com.e_commerce.service;

import com.e_commerce.data.model.Product.Product;
import com.e_commerce.service.common.MainService;

/**
 * Created by admin on 26.01.2016.
 */
public interface ProductService extends MainService<Product> {
    Product create(Product product);

    Product expired(Product product);
}
