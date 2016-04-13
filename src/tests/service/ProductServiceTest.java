package service;

import com.e_commerce.data.model.Product.Product;
import com.e_commerce.service.CategoryService;
import com.e_commerce.service.ProductService;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by admin on 26.01.2016.
 */
public class ProductServiceTest {
    private ProductService productService;
    private CategoryService categoryService;

    @Test
    public void createProduct() {
        Product product = create();
        assertNotNull(product);
    }


    private Product create() {
        Product product = new Product();
        return product;
    }

}
