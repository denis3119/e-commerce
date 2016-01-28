import com.e_commerce.config.Application;
import com.e_commerce.data.model.Product.Product;
import com.e_commerce.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * Created by admin on 26.01.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ProductServiceTest {
    @Autowired
    ProductService service;

    @Test
    public void createProduct() {
        Product product = create();
        assertNotNull(product);
    }

    private Product create() {
        Product product = new Product();
        product.setNumber(UUID.randomUUID().toString());
        return service.create(product);
    }

}
