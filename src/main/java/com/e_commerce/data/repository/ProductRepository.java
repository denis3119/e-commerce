package com.e_commerce.data.repository;

import com.e_commerce.data.model.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 26.01.2016.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
