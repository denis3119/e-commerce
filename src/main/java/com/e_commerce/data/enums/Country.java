package com.e_commerce.data.enums;

import lombok.Getter;

/**
 * Created by admin on 12.02.2016.
 */
@Getter
public enum Country {
    BLR("BLR", "Belarus", 20),
    RU("RU", "Russia", 10);
    private String code;
    private String englishName;
    private double valueVAT; // percent (0<valueVAT<100)

    Country(String countryCode, String englishName, double valueVAT) {
        this.code = countryCode;
        this.englishName = englishName;
        this.valueVAT = valueVAT;
    }
}
