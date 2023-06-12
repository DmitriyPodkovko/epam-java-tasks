package com.epam.rd.qa.classes;

import java.util.Objects;

public class Rectangle {
    private double sideA;
    private double sideB;

    protected Rectangle(double sideA, double sideB) {
        if (sideA > 0) this.sideA = sideA;
        else throw new IllegalArgumentException();
        if (sideB > 0) this.sideB = sideB;
        else throw new IllegalArgumentException();
    }

    protected Rectangle(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
            this.sideB = sideA;
        }
        else throw new IllegalArgumentException();
    }

    protected Rectangle() {
        this(4, 3);
    }

    protected double getSideA() {
        return sideA;
    }

    protected double getSideB() {
        return sideB;
    }

    protected double area() {
        return this.sideA * this.sideB;
    }

    protected double perimeter() {
        return 2 * this.sideA + 2 * this.sideB;
    }

    protected boolean isSquare() {
        return this.sideA == this.sideB;
    }

    protected void replaceSides() {
        double temp = this.sideA;
        this.sideA = this.sideB;
        this.sideB = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }

}
