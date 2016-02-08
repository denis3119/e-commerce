package com.e_commerce.service.impl;

import com.e_commerce.data.model.Product.ProductType;
import com.e_commerce.data.repository.ProductTypeRepository;
import com.e_commerce.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 08.02.2016.
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    ProductTypeRepository productTypeRepository;

    @Override
    public ProductType expired(ProductType item) {
        return productTypeRepository.saveAndFlush(item);
    }
}
