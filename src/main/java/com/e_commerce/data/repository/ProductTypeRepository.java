package com.e_commerce.data.repository;

import com.e_commerce.data.model.Product.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 08.02.2016.
 */
@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

}
