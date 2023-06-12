package com.epam.rd.qa.aggregation;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Client {
    private final Deposit[] deposits;
    private int index;

    protected Client() {
        this.deposits = new Deposit[10];
        index = 0;
    }

    public boolean addDeposit(Deposit deposit) {
        if (index < deposits.length) {
            deposits[index] = deposit;
            index++;
            return index <= deposits.length;
        }
        return false;
    }

    public BigDecimal totalIncome() {
        BigDecimal total = BigDecimal.valueOf(0);
        for (Deposit deposit : deposits) {
            if (deposit == null) break;
            total = total.add(deposit.income());
        }
        return total;

    }

    public BigDecimal maxIncome() {
        BigDecimal maxIncome = BigDecimal.valueOf(0);
        for (Deposit deposit : deposits) {
            if (deposit == null) break;
            if (deposit.income().doubleValue() > maxIncome.doubleValue()) {
                maxIncome = deposit.income();
            }
        }
        return maxIncome;

    }

    public BigDecimal getIncomeByNumber(int number) {
        if (deposits[number] == null) return BigDecimal.valueOf(0).setScale(2, RoundingMode.DOWN);
        return deposits[number].income();
    }
}
