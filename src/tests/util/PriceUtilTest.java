//package util;
//
//import com.e_commerce.config.Application;
//import com.e_commerce.data.enums.Country;
//import com.e_commerce.data.enums.Currency;
//import com.e_commerce.data.model.Product.Product;
//import com.e_commerce.util.PriceUtil;
//import org.jetbrains.annotations.NotNull;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import static junit.framework.TestCase.assertEquals;
//
///**
// * Created by admin on 12.02.2016.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Application.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebAppConfiguration
//public class PriceUtilTest {
//    private double PRODUCT_PRICE = 100;
//
//    @Test
//    public void priceWithOutVATTest() {
//        Product product = getProduct();
//        assertEquals(PRODUCT_PRICE, PriceUtil.getPriceWithOutVAT(product, Currency.USD));
//        assertEquals(PRODUCT_PRICE * Currency.RUS.getCurs(), PriceUtil.getPriceWithOutVAT(product, Currency.RUS));
//    }
//
//
//    @Test
//    public void getFullPrice() {
//        Product product = getProduct();
//        double totalPrice = PriceUtil.getPrice(product, Currency.BLR, Country.BLR);
//        assertEquals(totalPrice, (product.getPrice() + product.getPrice() * Country.BLR.getValueVAT() / PriceUtil.PERCENT_MULTIPLE) * Currency.BLR.getCurs() / PriceUtil.DEFAULT_CURRENCY.getCurs());
//    }
//
//    @NotNull
//    private Product getProduct() {
//        Product product = new Product();
//        product.setPrice(PRODUCT_PRICE);
//        return product;
//    }
//}
