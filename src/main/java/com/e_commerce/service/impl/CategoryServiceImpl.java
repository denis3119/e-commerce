package com.e_commerce.service.impl;

import com.e_commerce.data.model.Product.Category;
import com.e_commerce.data.repository.CategoryRepository;
import com.e_commerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 26.01.2016.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category expired(Category category) {
        category.setExpired(true);
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    public Category editName(long id, String name) {
        return categoryRepository.findOne(id);
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    public Category getCategory(long id) {
        return categoryRepository.findOne(id);
    }
}
