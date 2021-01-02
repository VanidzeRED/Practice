package ru.ssau.tk.pomelnikov.newtestproject;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class MatrixTest {

    @Test
    public void testGetNM(){
        Matrix matrix = new Matrix (3,3);
        assertEquals(matrix.getM(), 3);
        assertEquals(matrix.getN(), 3);
        Matrix newMatrix = new Matrix (4,5);
        assertEquals(newMatrix.getM(), 5);
        assertEquals(newMatrix.getN(), 4);
    }

    @Test
    public void testSeterGeter(){
        Matrix matrix = new Matrix (3,3);
        double flag = 0;
        for (int i = 0; i < matrix.getN(); i++){
            for (int j = 0; j < matrix.getM(); j++){
                matrix.setAt(i, j, flag++);
            }
        }
        flag = 0;
        for (int i = 0; i < matrix.getN(); i++){
            for (int j = 0; j < matrix.getM(); j++){
                assertEquals(matrix.getAt(i, j), flag++);
            }
        }
    }

    @Test
    public void testToString(){
        Matrix matrix = new Matrix(2,2);
        int flag = 1;
        for (int i = 0; i < matrix.getN(); i++) {
            for (int j = 0; j < matrix.getM(); j++) {
                matrix.setAt(i, j, flag++);
            }
        }
        assertEquals(matrix.toString(), "1.0, 2.0;\n3.0, 4.0;\n");
        System.out.println(matrix.toString());
        Matrix newMatrix = new Matrix(3,3);
        flag = 1;
        for (int i = 0; i < newMatrix.getN(); i++) {
            for (int j = 0; j < newMatrix.getM(); j++) {
                newMatrix.setAt(i, j, flag++);
            }
        }
        assertEquals(newMatrix.toString(), "1.0, 2.0, 3.0;\n4.0, 5.0, 6.0;\n7.0, 8.0, 9.0;\n");
        System.out.println(newMatrix.toString());
    }
}