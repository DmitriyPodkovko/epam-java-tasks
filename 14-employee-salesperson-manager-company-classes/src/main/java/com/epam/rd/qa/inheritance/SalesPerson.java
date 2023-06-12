package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        if (percent < 0) throw new IllegalArgumentException();
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (percent < 101) super.setBonus(bonus);
        if (percent > 100 && percent < 201) super.setBonus(bonus.multiply(BigDecimal.valueOf(2)));
        if (percent > 200) super.setBonus(bonus.multiply(BigDecimal.valueOf(3)));
    }
}