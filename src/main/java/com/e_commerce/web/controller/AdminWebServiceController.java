package com.e_commerce.web.controller;

import com.e_commerce.data.model.Product.Category;
import com.e_commerce.data.model.Product.Product;
import com.e_commerce.service.CategoryService;
import com.e_commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 31.05.2016.
 */
@RestController
@Secured("ROLE_ADMIN")
public class AdminWebServiceController {
    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;

    public List<Category> getCategories() {
        return new ArrayList<>();
    }

    public Category getCategoryByID(long id) {
        return new Category();
    }

    public Category setCategoryName(long categoryID, String name) {
        return categoryService.update(categoryService.getCategory(categoryID));
    }

    public Product joinCategory(Product product, Category category) {
        return productService.joinCategory(product, category);
    }

    public Product moveProduct(Product product, Category from, Category to) {
        return product;
    }
}
