package com.e_commerce.data.enums;

import lombok.Getter;

/**
 * Created by admin on 26.01.2016.
 */
@Getter
public enum Currency {
    BLR(22000), EUR(0.88), RUS(70), USD(1);
    private double curs;

    private Currency(double curs) {
        this.curs = curs;
    }
}
