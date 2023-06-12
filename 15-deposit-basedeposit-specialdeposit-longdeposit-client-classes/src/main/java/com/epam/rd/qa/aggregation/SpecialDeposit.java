package com.epam.rd.qa.aggregation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SpecialDeposit extends Deposit {
    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal sum = getAmount();
        int i = 0;
        while (i < getPeriod()) {
            sum = sum.add(sum.multiply(BigDecimal.valueOf(((double) (i + 1) / 100.0))));
            i++;
        }
        return sum.subtract(getAmount()).setScale(2, RoundingMode.DOWN);
    }
}
