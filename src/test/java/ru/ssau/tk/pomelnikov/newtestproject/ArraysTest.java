package ru.ssau.tk.pomelnikov.newtestproject;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class ArraysTest {
    Arrays arrayTest = new Arrays();

    @Test
    private void setArrayTest() {
        for (int iterator = 1; iterator <= 10; iterator++) {
            double[] currentArray = new double[iterator];
            assertEquals(arrayTest.setArray(iterator), currentArray);
        }
    }

    @Test
    private void fillArrayOneTest() {

        assertEquals(arrayTest.fillArrayOne(4), new int[]{2, 1, 1, 2});
        assertEquals(arrayTest.fillArrayOne(5), new int[]{2, 1, 1, 1, 2});
        assertEquals(arrayTest.fillArrayOne(6), new int[]{2, 1, 1, 1, 1, 2});
        assertEquals(arrayTest.fillArrayOne(7), new int[]{2, 1, 1, 1, 1, 1, 2});
    }

    @Test
    private void fillArrayOddTest() {
        assertEquals(arrayTest.fillArrayOdd(1), new int[]{1});
        assertEquals(arrayTest.fillArrayOdd(3), new int[]{1, 3, 5});
        assertEquals(arrayTest.fillArrayOdd(4), new int[]{1, 3, 5, 7});
        assertEquals(arrayTest.fillArrayOdd(8), new int[]{1, 3, 5, 7, 9, 11, 13, 15});
        //System.out.println(java.util.Arrays.toString(arrayTest.fillArrayOdd(8)));
    }

    @Test
    private void fillArrayEvenTest() {
        assertEquals(arrayTest.fillArrayEven(1), new int[]{2});
        assertEquals(arrayTest.fillArrayEven(3), new int[]{6, 4, 2});
        assertEquals(arrayTest.fillArrayEven(4), new int[]{8, 6, 4, 2});
        assertEquals(arrayTest.fillArrayEven(8), new int[]{16, 14, 12, 10, 8, 6, 4, 2});
        //System.out.println(java.util.Arrays.toString(arrayTest.fillArrayEven(8)));
    }

    @Test
    private void fillArrayFibonachTest() {
        assertEquals(arrayTest.fillArrayFibonachi(1), new int[]{1});
        assertEquals(arrayTest.fillArrayFibonachi(3), new int[]{1, 1, 2});
        assertEquals(arrayTest.fillArrayFibonachi(4), new int[]{1, 1, 2, 3});
        assertEquals(arrayTest.fillArrayFibonachi(8), new int[]{1, 1, 2, 3, 5, 8, 13, 21});
    }

    @Test
    private void fillArraySqrTest() {
        assertEquals(arrayTest.fillArraySqr(3), new double[]{0., 1., 4.});
        assertEquals(arrayTest.fillArraySqr(4), new double[]{0., 1., 4., 9.});
        assertEquals(arrayTest.fillArraySqr(6), new double[]{0., 1., 4., 9., 16., 25.});

    }

    @Test
    private void fillArrayNaturalTest() {
        assertEquals(arrayTest.fillArrayNatural(3), new int[]{1, 2, 4});
        assertEquals(arrayTest.fillArrayNatural(4), new int[]{1, 2, 4, 5});
        assertEquals(arrayTest.fillArrayNatural(6), new int[]{1, 2, 4, 5, 7, 8});
        assertEquals(arrayTest.fillArrayNatural(10), new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14});

    }

    @Test
    private void changeToNegative() {
        final int[] testArray1 = {-1, 0, 1};
        final int[] testArray2 = {9, -9};
        arrayTest.changeToNegative(testArray1);
        arrayTest.changeToNegative(testArray2);
        assertEquals(testArray1[0], 1);
        assertEquals(testArray1[1], 0);
        assertEquals(testArray1[2], -1);
        assertEquals(testArray2[0], -9);
        assertEquals(testArray2[1], 9);
    }

    @Test
    private void createDoubleDimentionArrayTest() {
        int[][] resultArray1 = arrayTest.createDoubleDimentionArray(3);
        int[][] resultArray2 = arrayTest.createDoubleDimentionArray(4);

        assertEquals(resultArray1[0], new int[]{1, 2, 3});
        assertEquals(resultArray1[1], new int[]{4, 5});
        assertEquals(resultArray1[2], new int[]{6});

        assertEquals(resultArray2[0], new int[]{1, 2, 3, 4});
        assertEquals(resultArray2[1], new int[]{5, 6, 7});
        assertEquals(resultArray2[2], new int[]{8, 9});
        assertEquals(resultArray2[3], new int[]{10});
    }
}