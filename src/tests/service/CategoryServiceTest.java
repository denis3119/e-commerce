package service;

import com.e_commerce.config.Application;
import com.e_commerce.data.model.Product.Category;
import com.e_commerce.data.repository.CategoryRepository;
import com.e_commerce.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNotNull;

/**
 * Created by admin on 01.02.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class CategoryServiceTest {
    @Autowired
    CategoryService categoryService;

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void createTest() {
        Category category = create();
        assertNotNull(category);
        delete(category);
    }

    private Category create() {
        Category category = new Category();
        category.setName("category");
        return categoryService.create(category);
    }

    private void delete(Category category) {
        if (categoryRepository.getOne(category.getId()) != null) {
            categoryRepository.delete(category);
        }
    }
}
