package ru.ssau.tk.pomelnikov.newtestproject;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class MatricesTest {

    static Matrix firstMatrix = new Matrix(2,2);
    static Matrix secondMatrix = new Matrix(2,2);
    static Matrix thirdMatrix = new Matrix(3,2);
    static Matrix fourthMatrix = new Matrix(2,1);

    public static void fillMatrices(){
        for (int i = 0; i< firstMatrix.getN(); i++){
            for (int j = 0; j< firstMatrix.getM(); j++){
                firstMatrix.setAt(i,j,1);
                secondMatrix.setAt(i,j,2);
            }
        }
        for (int i = 0; i< thirdMatrix.getN(); i++){
            for (int j = 0; j< thirdMatrix.getM(); j++){
                thirdMatrix.setAt(i,j,3);
            }
        }

        for (int i = 0; i< fourthMatrix.getN(); i++){
            for (int j = 0; j< fourthMatrix.getM(); j++){
                fourthMatrix.setAt(i,j,4);
            }
        }
    }

    @Test
    public void testSumMatrices(){
        MatricesTest.fillMatrices();
        Matrix result1 = Matrices.sumMatrices(firstMatrix, secondMatrix);
        Matrix result2 = Matrices.sumMatrices(firstMatrix, thirdMatrix);
        Matrix result3 = Matrices.sumMatrices(fourthMatrix, secondMatrix);
        assertNull(result2);
        assertNull(result3);
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                assertEquals(result1.getAt(i,j), 3);
            }
        }
    }
}