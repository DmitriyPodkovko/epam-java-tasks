package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Company {
    private final Employee[] employees;

    public Company(Employee[] employees) {
        if (employees == null || employees.length == 0) throw new IllegalArgumentException();
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        for (Employee employee : employees) employee.setBonus(companyBonus);
    }

    public BigDecimal totalToPay() {
        BigDecimal total = BigDecimal.valueOf(0);
        for (Employee employee : employees) total = total.add(employee.toPay());
        return total;
    }

    public String nameMaxSalary() {
        String name = "";
        BigDecimal maxSalary = BigDecimal.valueOf(0);
        for (Employee employee : employees)
            if (employee.toPay().doubleValue() > maxSalary.doubleValue()) {
                maxSalary = employee.toPay();
                name = employee.getName();
            }
        return name;
    }
}
