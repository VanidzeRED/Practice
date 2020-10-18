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

}