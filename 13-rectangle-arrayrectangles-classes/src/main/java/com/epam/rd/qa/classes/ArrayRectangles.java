package com.epam.rd.qa.classes;

import java.util.Arrays;

public class ArrayRectangles {
    private Rectangle[] rectangleArray;
    private int index;

    protected ArrayRectangles(int size) {
        if (size <= 0) throw new IllegalArgumentException();
        this.rectangleArray = new Rectangle[size];
        index = 0;
    }

    protected ArrayRectangles(Rectangle... rectangles) {
        if (rectangles == null) throw new IllegalArgumentException();
        if (rectangles.length == 0) throw new IllegalArgumentException();
        this.rectangleArray = rectangles;
        index = rectangles.length - 1;
    }

    protected boolean addRectangle(Rectangle rectangle) {
        if (index < rectangleArray.length) {
            rectangleArray[index] = rectangle;
            index++;
            return index <= rectangleArray.length;
        }
        return false;
    }

    protected int size() {
        int count = 0;
        for (Rectangle rectangle : rectangleArray)
            if (rectangle != null) count++;
        return count;
    }

    protected int indexMaxArea() {
        int imaxArea = 0;
        double maxArea = rectangleArray[0].area();
        for (int i = 0; i < rectangleArray.length - 1; i++) {
            if (rectangleArray[i + 1].area() > maxArea) {
                maxArea = rectangleArray[i + 1].area();
                imaxArea = i + 1;
            }
        }
        return imaxArea;
    }

    protected int indexMinPerimeter() {
        int iminPerimeter = 0;
        double minPerimeter = rectangleArray[0].perimeter();
        for (int i = 0; i < rectangleArray.length - 1; i++) {
            if (rectangleArray[i + 1].perimeter() < minPerimeter) {
                minPerimeter = rectangleArray[i + 1].perimeter();
                iminPerimeter = i + 1;
            }
        }
        return iminPerimeter;
    }

    protected int numberSquares() {
        int count = 0;
        for (Rectangle rectangle : rectangleArray)
            if (rectangle.isSquare()) count++;
        return count;
    }
}
