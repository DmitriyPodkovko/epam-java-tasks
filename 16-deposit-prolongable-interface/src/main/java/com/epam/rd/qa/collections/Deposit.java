package com.epam.rd.qa.collections;

import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit> {
    protected final BigDecimal amount;
    protected final int period;

    protected Deposit(BigDecimal depositAmount, int depositPeriod) {
        if (depositAmount == null || depositAmount.doubleValue() <= 0 || depositPeriod <= 0)
            throw new IllegalArgumentException();
        this.amount = depositAmount;
        this.period = depositPeriod;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public abstract BigDecimal income();

    @Override
    public int compareTo(Deposit o) {
        return getAmount().add(income()).compareTo(o.getAmount().add(income()));
    }

    @Override
    public boolean equals(Object obj) {
        return (getAmount().doubleValue() == ((Deposit) obj).amount.doubleValue());
    }

    public boolean canToProlong() {
        return false;
    }
}
