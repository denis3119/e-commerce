package com.e_commerce.service;

import com.e_commerce.data.model.Product.Category;
import com.e_commerce.service.common.MainService;

/**
 * Created by admin on 26.01.2016.
 */
public interface CategoryService extends MainService<Category> {
    Category create(Category category);
    Category update(Category category);
    Category getCategory(long id);
}
