package com.e_commerce.data.repository;

import com.e_commerce.data.model.Product.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 26.01.2016.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
