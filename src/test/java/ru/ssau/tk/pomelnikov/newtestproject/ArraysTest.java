package ru.ssau.tk.pomelnikov.newtestproject;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class ArraysTest {
    Arrays arrayTest = new Arrays();

    @Test
    private void setArrayTest(){
        for (int iterator=1; iterator<=10; iterator++){
            double[] currentArray = new double[iterator];
            assertEquals(arrayTest.setArray(iterator), currentArray);
        }
    }

    @Test
    private void fillArrayOneTest(){

        assertEquals(arrayTest.fillArrayOne(4), new int[]{2, 1, 1, 2});
        assertEquals(arrayTest.fillArrayOne(5), new int[]{2, 1, 1, 1, 2});
        assertEquals(arrayTest.fillArrayOne(6), new int[]{2, 1, 1, 1, 1, 2});
        assertEquals(arrayTest.fillArrayOne(7), new int[]{2, 1, 1, 1, 1, 1, 2});
    }

    @Test
    private void fillArrayOddTest(){
        assertEquals(arrayTest.fillArrayOdd(1), new int[]{1});
        assertEquals(arrayTest.fillArrayOdd(3), new int[]{1, 3, 5});
        assertEquals(arrayTest.fillArrayOdd(4), new int[]{1, 3, 5, 7});
        assertEquals(arrayTest.fillArrayOdd(8), new int[]{1, 3, 5, 7, 9, 11, 13, 15});
        //System.out.println(java.util.Arrays.toString(arrayTest.fillArrayOdd(8)));
    }

    @Test
    private void fillArrayEvenTest(){
        assertEquals(arrayTest.fillArrayEven(1), new int[]{2});
        assertEquals(arrayTest.fillArrayEven(3), new int[]{6, 4, 2});
        assertEquals(arrayTest.fillArrayEven(4), new int[]{8, 6, 4, 2});
        assertEquals(arrayTest.fillArrayEven(8), new int[]{16, 14, 12, 10, 8, 6, 4, 2});
        //System.out.println(java.util.Arrays.toString(arrayTest.fillArrayEven(8)));
    }

    @Test
    private void fillArrayFibonachTest(){
        /*assertEquals(arrayTest.fillArrayEven(1), new int[]{2});
        assertEquals(arrayTest.fillArrayEven(3), new int[]{6, 4, 2});
        assertEquals(arrayTest.fillArrayEven(4), new int[]{8, 6, 4, 2});
        assertEquals(arrayTest.fillArrayEven(8), new int[]{16, 14, 12, 10, 8, 6, 4, 2});*/
        System.out.println(java.util.Arrays.toString(arrayTest.fillArrayFibonachi(1)));
    }
}