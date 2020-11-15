package ru.ssau.tk.pomelnikov.newtestproject;

public class Matrices {
    static Matrix sumMatrices(Matrix firstMatrix, Matrix secondMatrix) {
        if ((firstMatrix.getM() != secondMatrix.getM()) || (firstMatrix.getN() != secondMatrix.getN())) {
            return null;
        }
        int n = firstMatrix.getN();
        int m = firstMatrix.getM();
        Matrix resultMatrix = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix.setAt(i, j, firstMatrix.getAt(i, j) + secondMatrix.getAt(i, j));
            }
        }
        return resultMatrix;
    }

    static Matrix multiplyMatrixAndNumber(Matrix matrix, double number) {
        int n = matrix.getN();
        int m = matrix.getM();
        Matrix resultMatrix = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultMatrix.setAt(i, j, matrix.getAt(i, j) * number);
            }
        }
        return resultMatrix;
    }

    static Matrix multiplyMatrixAndMatrix(Matrix firstMatrix, Matrix secondMatrix) {
        if (firstMatrix.getM() != secondMatrix.getN()) {
            return null;
        }
        int n = firstMatrix.getN();
        int m = secondMatrix.getM();
        int p = firstMatrix.getM();
        double currentElem;
        Matrix resultMatrix = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                currentElem = 0;
                for (int k = 0; k < p; k++) {
                    currentElem += firstMatrix.getAt(i, k) * secondMatrix.getAt(k, j);

                }
                resultMatrix.setAt(i, j, currentElem);
            }
        }
        return resultMatrix;
    }

    static double findDeterminate(Matrix matrix) {
        int n = matrix.getN();
        int m = matrix.getM();
        if (n != m) {
            return Double.NaN;
        }
        if (n == 2) {
            return matrix.getAt(0, 0) * matrix.getAt(1, 1) - matrix.getAt(0, 1) * matrix.getAt(1, 0);
        }
        double determinate = 0;
        for (int i = 0; i < n; i++) {

        }
        return determinate;
    }
}
