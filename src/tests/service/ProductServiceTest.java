//package service;
//
//import com.e_commerce.config.Application;
//import com.e_commerce.data.model.Product.Category;
//import com.e_commerce.data.model.Product.Product;
//import com.e_commerce.data.repository.CategoryRepository;
//import com.e_commerce.data.repository.ProductRepository;
//import com.e_commerce.service.CategoryService;
//import com.e_commerce.service.ProductService;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import java.util.HashSet;
//
//import static org.junit.Assert.*;
//
///**
// * Created by admin on 26.01.2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Application.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebAppConfiguration
//public class ProductServiceTest {
//    @Autowired
//    ProductService productService;
//    @Autowired
//    ProductRepository productRepository;
//    @Autowired
//    CategoryRepository categoryRepository;
//    @Autowired
//    CategoryService categoryService;
//
//    @Test
//    public void createProduct() {
//        Product product = create();
//        assertNotNull(product);
//        remove(product);
//    }
//
//    @Test
//    public void expiredProduct() {
//        Product product = create();
//        product = productService.expired(product);
//        assertTrue(product.isExpired());
//        remove(product);
//    }
//
//    @Test
//    public void joinCategory() {
//        Product product = create();
//        Category category = new Category();
//        category.setName("category");
//        category = categoryService.create(category);
//        product = productService.joinCategory(product, category);
//        assertFalse(product.getCategories().isEmpty());
//        product.setCategories(new HashSet<>());
//        product = productRepository.saveAndFlush(product);
//        categoryRepository.delete(category);
//        remove(product);
//    }
//
//    @Test
//    public void removeCategory(){
//        Product product = create();
//        Category category = new Category();
//        category.setName("category");
//        category = categoryService.create(category);
//        product = productService.joinCategory(product, category);
//        productService.removeCategory(product,category);
//    }
//
//    private Product create() {
//        Product product = new Product();
//        return productService.create(product);
//    }
//
//    private void remove(Product product) {
//        if (productRepository.getOne(product.getId()) != null) {
//            productRepository.delete(product);
//        }
//    }
//}
