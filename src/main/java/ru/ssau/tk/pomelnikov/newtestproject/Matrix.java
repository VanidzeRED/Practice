package ru.ssau.tk.pomelnikov.newtestproject;

import java.util.Arrays;
import java.util.stream.Stream;

public class Matrix {
    private final int n;
    private final int m;
    private final double[][] matrix;

    public double getAt(int n, int m) {
        return matrix[n][m];
    }

    public void setAt(int n, int m, double elem) {
        matrix[n][m] = elem;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new double[n][m];
    }

    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                returnString.append(this.getAt(i, j));
                if (j != m - 1) {
                    returnString.append(", ");
                }
            }
            returnString.append(";\n");
        }
        return returnString.toString();
    }
}

