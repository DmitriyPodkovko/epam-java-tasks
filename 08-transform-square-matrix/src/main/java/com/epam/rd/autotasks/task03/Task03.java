package com.epam.rd.autotasks.task03;

import java.util.Arrays;

public class Task03 {

    private static boolean isSquare(int[][] matrix) {
        boolean isSquare = true;
        int size = matrix.length;
        for (int i = 0; i < size && isSquare; i++) {
            isSquare = size == matrix[i].length;
        }
        return isSquare;
    }

    public static void transformMatrix(int[][] matrix) {
        if (matrix != null)
            if (isSquare(matrix)) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i > j) {matrix[i][j] = 0;}
                        if (i < j) {matrix[i][j] = 1;}
                    }
                }
            }
    }

    public static void main(String[] args) {
        {
            int[][] matrix = null;
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{}, {}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 3}, {4, 5, 6}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 3}, {4, 5}, {}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 3}, {4, 5}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {

            int[][] matrix = {{2, 3}, {4, 5}, {6, 7}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }
        {
            int[][] matrix = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}};
            transformMatrix(matrix);
            System.out.println(Arrays.deepToString(matrix));
        }

    }

}
