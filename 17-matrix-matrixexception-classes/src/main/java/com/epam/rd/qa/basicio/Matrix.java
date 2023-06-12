package com.epam.rd.qa.basicio;

import java.util.Arrays;

/**
 * Encapsulates two-dimensional array-matrix block of real ({@code double}) type.
 * {@code Matrix} is the cover for two-dimensional array of real values, storing matrix
 * values with operations of matrix addition, deduction, and multiplication.
 */
public class Matrix {
    private final double[][] matrix;
    /**
     private static boolean isSquare(double[][] matrix) {
     boolean isSquare = true;
     int size = matrix.length;
     for (int i = 0; i < size && isSquare; i++) {
     isSquare = size == matrix[i].length;
     }
     return isSquare;
     }
     private static boolean hasAllZero(double[][] matrix) {
     boolean hasAllZero = true;
     for (double[] doubles : matrix)
     for (double aDouble : doubles)
     if (aDouble != 0) {
     hasAllZero = false;
     break;
     }
     return hasAllZero;
     }
     */
    /**
     * Creates an empty matrix with predetermined number
     * of rows and columns (all values in matrix equal to 0)
     *
     * @param rows number of rows
     * @param cols number of columns
     * @throws MatrixException if {@code rows} or {@code cols} less than 1
     */
    public Matrix(int rows, int cols) throws MatrixException {
        if (rows < 1 || cols < 1) throw new MatrixException("");
        this.matrix = new double[rows][cols];
        for (double[] doubles : this.matrix) Arrays.fill(doubles, 0);
    }

    /**
     * Creates a matrix based on existing two-dimensional array
     *
     * @param values two-dimensional array
     * @throws MatrixException if {@code rows} or {@code cols} less than 1
     */
    public Matrix(double[][] values) throws MatrixException {
        if (values == null || values.length < 1 || values[0].length < 1) throw new MatrixException("");
        for (double[] value : values)
            if (value.length == 0) throw new MatrixException("");
        for (int i = 0; i < values.length - 1; i++)
            if (values[i].length != values[i + 1].length) throw new MatrixException("");
        this.matrix = values;
    }

    /**
     * Returns count of matrix rows.
     *
     * @return count of rows in the matrix
     */
    public int getRows() {
        return matrix.length;
    }

    /**
     * Returns count of matrix columns
     *
     * @return count of columns in the matrix
     */
    public int getColumns() {
        return matrix[0].length;
    }

    /**
     * Returns an element via predetermined correct indexes.
     *
     * @param row row index
     * @param col column index
     * @return the element via indexes
     * @throws MatrixException if index out of bounds
     */
    public double get(int row, int col) throws MatrixException {
        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length)
            throw new MatrixException("");
        return matrix[row][col];
    }

    /**
     * Sets new value via predetermined correct indexes.
     *
     * @param row   row index
     * @param col   column index
     * @param value value to set
     * @throws MatrixException if index out of bounds
     */
    public void set(int row, int col, double value) throws MatrixException {
        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length)
            throw new MatrixException("");
        matrix[row][col] = value;
    }

    /**
     * Returns standard two-dimensional array out of matrix.
     * Any changes in the returned array will be reflected to internal array.
     *
     * @return matrix values
     */
    public double[][] toArray() {
        return matrix;
    }

    /**
     * Adds all elements of {@code other} matrix to corresponding elements
     * of this matrix and creates new {@code Matrix} with resulting two-dimensional array
     *
     * @param other another {@code Matrix} object
     * @return new matrix
     * @throws MatrixException if matrices have different size
     */
    public Matrix add(Matrix other) throws MatrixException {
        if (other == null || getRows() != other.getRows() || getColumns() != other.getColumns())
            throw new MatrixException("");
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++)
            for (int j = 0; j < getColumns(); j++)
                result.matrix[i][j] = matrix[i][j] + other.matrix[i][j];
        return result;
    }

    /**
     * Subtract all elements of {@code other} matrix from corresponding elements
     * of this matrix and creates new {@code Matrix} with resulting two-dimensional array
     *
     * @param other another {@code Matrix} object
     * @return new matrix
     * @throws MatrixException if matrices have different size
     */
    public Matrix subtract(Matrix other) throws MatrixException {
        if (other == null || getRows() != other.getRows() || getColumns() != other.getColumns())
            throw new MatrixException("");
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < getRows(); i++)
            for (int j = 0; j < getColumns(); j++)
                result.matrix[i][j] = matrix[i][j] - other.matrix[i][j];
        return result;
    }

    /**
     * Multiply this matrix to {@code other} matrix.<br/>
     * See
     * <a href="https://en.wikipedia.org/wiki/Matrix_multiplication">Matrix multiplication</a>
     * <a href="https://en.wikipedia.org/wiki/Matrix_multiplication_algorithm">Matrix multiplication algorithm</a>
     *
     * @param other another matrix
     * @return new matrix
     * @throws MatrixException if matrices have non-compliant sizes
     */
    public Matrix multiply(Matrix other) throws MatrixException {
        if (other == null || other.getRows() != getColumns()) throw new MatrixException("");
        Matrix result = new Matrix(getRows(), other.getColumns());
        for (int i = 0; i < getRows(); i++)
            for (int j = 0; j < other.getColumns(); j++)
                for (int k = 0; k < other.getRows(); k++)
                    result.matrix[i][j] += matrix[i][k] * other.matrix[k][j];
        return result;
    }
}
