package com.e_commerce.web.controller;

import com.e_commerce.data.model.Product.Category;
import com.e_commerce.data.model.Product.Product;
import com.e_commerce.service.CategoryService;
import com.e_commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 31.05.2016.
 */
@RestController
public class WebServiceController {

    @Autowired
    private ProductService productService;
    @Autowired
    CategoryService categoryService;

    public List<Category> getActiveCategories() {
        return new ArrayList<>();
    }

    public Category getCategoryByID(long id) {
        return new Category();
    }

    public List<Product> getAllActiveProducts() {
        return new ArrayList<>();
    }

    public Product getProductByID(long id) {
        return new Product();
    }
}
