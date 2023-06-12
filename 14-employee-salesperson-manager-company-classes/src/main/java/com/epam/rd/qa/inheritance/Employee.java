package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final BigDecimal salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        if (name == null || name.trim().equals("") || salary == null || salary.intValue() <= 0)
            throw new IllegalArgumentException();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setBonus(BigDecimal bonus) {
        if (bonus == null || bonus.doubleValue() <= 0) throw new IllegalArgumentException();
        this.bonus = bonus;
    }

    public BigDecimal toPay() {
        return getSalary().add(bonus);
    }
}
