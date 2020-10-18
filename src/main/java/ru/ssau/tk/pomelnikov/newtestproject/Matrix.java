package ru.ssau.tk.pomelnikov.newtestproject;

public class Matrix {
    private static int n;
    private static int m;
    private static double[][] matrix;

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
        matrix = new double[n][m];
    }
}
