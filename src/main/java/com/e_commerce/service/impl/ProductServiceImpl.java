package com.e_commerce.service.impl;

import com.e_commerce.data.model.Product.Category;
import com.e_commerce.data.model.Product.Product;
import com.e_commerce.data.repository.ProductRepository;
import com.e_commerce.service.CategoryService;
import com.e_commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 26.01.2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryService categoryService;

    @Override
    public Product create(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public Product expired(Product product) {
        product.setExpired(true);
        return productRepository.saveAndFlush(product);
    }

    @Override
    public Product joinCategory(Product product, Category category) {
        product = productRepository.getOne(product.getId());
        product.getCategories().add(category);
        productRepository.saveAndFlush(product);
        return product;
    }

    @Override
    public Product removeCategory(Product product, Category category) {
        product = productRepository.getOne(product.getId());
        product.getCategories().remove(category);
        return productRepository.saveAndFlush(product);
    }
}
