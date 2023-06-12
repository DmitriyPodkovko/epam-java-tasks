package com.epam.rd.qa.collections;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Iterator;


public class Client implements Iterable<Deposit> {
    private final Deposit[] deposits;
    private int index;

    protected Client() {
        this.deposits = new Deposit[10];
        index = 0;
    }

    public Client(Deposit[] deposits) {
        if (deposits == null || deposits.length == 0) throw new IllegalArgumentException();
        this.deposits = deposits;
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

    public void sortDeposits() {
        Arrays.sort(deposits, (o1, o2) -> {
            if (o2 != null && o1 != null) return o2.compareTo(o1);
            return 0;
        });
    }

    public int countPossibleToProlongDeposit() {
        int count = 0;
        for (Deposit deposit : deposits) {
            if (deposit.canToProlong()) count++;
        }
        return count;
    }

    @Override
    public Iterator<Deposit> iterator() {
        return new Iterator<>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < deposits.length && deposits[i] != null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("remove!!!");
            }

            @Override
            public Deposit next() {
                return deposits[i++];
            }
        };
    }
}
