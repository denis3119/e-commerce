package com.e_commerce.util;

import com.e_commerce.data.enums.Country;
import com.e_commerce.data.enums.Currency;
import com.e_commerce.data.model.Product.Product;


/**
 * Created by admin on 12.02.2016.
 */
public class PriceUtil {
    public static final Currency DEFAULT_CURRENCY = Currency.USD;
    public static final int PERCENT_MULTIPLE = 100;

    public static double getPriceWithOutVAT(Product product, Currency resultCurrency) {
        return product.getPrice() * getCurrencyCoefficient(resultCurrency);
    }

    public static double getPrice(Product product, Currency resultCurrency) {
        return getPrice(product, resultCurrency, Country.BLR);
    }

    public static double getPrice(Product product, Currency resultCurrency, Country country) {
        double priceWithOutVAT = getPriceWithOutVAT(product, resultCurrency);
        double vat = getProductVAT(priceWithOutVAT, country);
        return vat + priceWithOutVAT;
    }


    private static double getProductVAT(double priceWithOutVAT, Country country) {
        return priceWithOutVAT * getPercentBetwenZeroAndOne(country);
    }

    //TODO имя функции перевод
    private static double getPercentBetwenZeroAndOne(Country country) {
        return country.getValueVAT() / PERCENT_MULTIPLE;
    }

    private static double getCurrencyCoefficient(Currency currency) {
        return currency.getCurs() / DEFAULT_CURRENCY.getCurs();
    }
}
