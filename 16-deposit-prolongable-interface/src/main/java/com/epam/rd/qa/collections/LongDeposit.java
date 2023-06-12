package com.epam.rd.qa.collections;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LongDeposit extends Deposit implements Prolongable {
    public LongDeposit(BigDecimal depositAmount, int depositPeriod) {
        super(depositAmount, depositPeriod);
    }

    @Override
    public BigDecimal income() {
        BigDecimal sum = getAmount();
        int i = 6;
        while (i < getPeriod()) {
            sum = sum.add(sum.multiply(BigDecimal.valueOf(0.15)));
            i++;
        }
        return sum.subtract(getAmount()).setScale(2, RoundingMode.DOWN);
    }

    @Override
    public boolean canToProlong() {
        return (getPeriod() < 36);
    }
}
