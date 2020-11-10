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

    @Test
    private void fillArrayArithmeticProgressionTest() {
        assertEquals(arrayTest.fillArrayArithmeticProgression(5, 0, 1), new double[]{0., 1., 2., 3., 4.});
        assertEquals(arrayTest.fillArrayArithmeticProgression(5, -0.5, 0.5), new double[]{-0.5, 0., 0.5, 1., 1.5});
        assertEquals(arrayTest.fillArrayArithmeticProgression(5, 1.6, -0.8), new double[]{1.6, 0.8, 0, -0.8, -1.6});
    }

    @Test
    private void fillArrayGeometricProgressionTest() {
        assertEquals(arrayTest.fillArrayGeometricProgression(5, 1, 2), new double[]{1., 2., 4., 8., 16.});
        assertEquals(arrayTest.fillArrayGeometricProgression(5, 2, -2), new double[]{2., -4., 8., -16., 32.});
        assertEquals(arrayTest.fillArrayGeometricProgression(4, 1, 0.5), new double[]{1., 0.5, 0.25, 0.125});
    }

    @Test
    private void findDenominatorsTest() {
        assertEquals(arrayTest.findDenominators(2), new int[]{1, 2});
        assertEquals(arrayTest.findDenominators(18), new int[]{1, 2, 3});
        assertEquals(arrayTest.findDenominators(27), new int[]{1, 3});
        assertEquals(arrayTest.findDenominators(30), new int[]{1, 2, 3, 5, 6});
    }

    @Test
    private void testIsPrime() {
        assertTrue(Arrays.isPrime(2));
        assertTrue(Arrays.isPrime(5));
        assertTrue(Arrays.isPrime(13));
        assertFalse(Arrays.isPrime(4));
        assertFalse(Arrays.isPrime(10));
        assertFalse(Arrays.isPrime(75));
    }

    @Test
    private void testFindPrime() {
        assertEquals(arrayTest.findPrime(10), new int[]{2, 3, 5, 7});
        assertEquals(arrayTest.findPrime(23), new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23});
        assertEquals(arrayTest.findPrime(2), new int[]{2});
    }

    @Test
    private void testFillArrayMirror() {
        assertEquals(arrayTest.fillArrayMirror(7), new int[]{1, 2, 3, 4, 3, 2, 1});
        assertEquals(arrayTest.fillArrayMirror(2), new int[]{1, 1});
        assertEquals(arrayTest.fillArrayMirror(8), new int[]{1, 2, 3, 4, 4, 3, 2, 1});
    }

    @Test
    private void testIsInArray() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertTrue(arrayTest.isInArray(array, 0));
        assertTrue(arrayTest.isInArray(array, 3));
        assertTrue(arrayTest.isInArray(array, 9));
        assertFalse(arrayTest.isInArray(array, -5));
        assertFalse(arrayTest.isInArray(array, 10));
        assertFalse(arrayTest.isInArray(array, -1));
    }

    @Test
    private void testIsNullInArray() {
        Integer[] array1 = new Integer[]{1, 2, 3};
        Integer[] array2 = new Integer[]{1, null, 3};
        Integer[] array3 = new Integer[]{null, null};
        assertTrue(arrayTest.isNullInArray(array2));
        assertTrue(arrayTest.isNullInArray(array3));
        assertFalse(arrayTest.isNullInArray(array1));

    }

    @Test
    private void testFindNumberOfEven() {
        assertEquals(arrayTest.findCountOfEven(new int[]{1, 2, 1, 2, 1}), 2);
        assertEquals(arrayTest.findCountOfEven(new int[]{1, 3, 5, 7, 9}), 0);
        assertEquals(arrayTest.findCountOfEven(new int[]{1, 2, 4, 6, 10}), 4);
    }

    @Test
    private void testFindMax() {
        assertEquals(arrayTest.findMax(new int[]{1, 2, 3, 4, 3, 2, 1}), Integer.valueOf(4));
        assertEquals(arrayTest.findMax(new int[]{5, -2, -3, -4, -3, 10, -1}), Integer.valueOf(10));
        assertNull(arrayTest.findMax(new int[]{}));
    }

    @Test
    private void testFindMin() {
        assertEquals(arrayTest.findMin(new int[]{1, 2, 3, 4, 3, 2, 1}), Integer.valueOf(1));
        assertEquals(arrayTest.findMin(new int[]{5, -2, -3, -4, -3, 10, -1}), Integer.valueOf(-4));
        assertNull(arrayTest.findMin(new int[]{}));
    }

    @Test
    private void testFindSum() {
        assertEquals(arrayTest.findSum(new int[]{1, 0, 1, 0, 1, 0}), 3);
        assertEquals(arrayTest.findSum(new int[]{0, 1, 0, 1, 0, 1, 0}), 0);
        assertEquals(arrayTest.findSum(new int[]{9, 13, 5, 6, 9, 7, 32, 6, 10, 5, 6, 46, 5}), 76);
    }

    @Test
    private void testIsMultiple() {
        assertTrue(arrayTest.isMultiple(new int[]{2, 4, 6, 9, 10, 3}));
        assertTrue(arrayTest.isMultiple(new int[]{10, 100, 50, 58, 60, 3}));
        assertFalse(arrayTest.isMultiple(new int[]{10, 100, 50, 58, 60, 2}));
    }

    @Test
    private void testFindMostPopular() {
        assertEquals(arrayTest.findMostPopular(new int[]{1, 2, 3, 4, 1, 2}), 1);
        assertEquals(arrayTest.findMostPopular(new int[]{-1, 2, 2, 3, -1, -1, 2}), -1);
        assertEquals(arrayTest.findMostPopular(new int[]{1, 1, 2, 2, 2, 1}), 1);
    }

    @Test
    private void testFindIndexOfElem() {
        assertEquals(arrayTest.findIndexOfElem(new int[]{0, 1, 2, 3, 4, 5}, 1), 1);
        assertEquals(arrayTest.findIndexOfElem(new int[]{0, 1, 2, 3, 4, 5}, 3), 3);
        assertEquals(arrayTest.findIndexOfElem(new int[]{0, 1, 2, 3, 4, 5}, 5), 5);
        assertEquals(arrayTest.findIndexOfElem(new int[]{0, 1, 2, 3, 4, 5}, 6), -1);
    }

    @Test
    private void testExchangeMaxMin() {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 5, 3};
        int[] array3 = new int[]{-1, 0, 1, 4, 10, 5, 2};
        arrayTest.exchangeMaxMin(array1);
        arrayTest.exchangeMaxMin(array2);
        arrayTest.exchangeMaxMin(array3);
        assertEquals(array1, new int[]{3, 2, 1});
        assertEquals(array2, new int[]{5, 1, 3});
        assertEquals(array3, new int[]{10, 0, 1, 4, -1, 5, 2});
    }

    @Test
    private void testByteNegate() {
        int[] array = new int[]{-16, -8, -7, -2, -1, 0, 1, 2, 7, 8, 10, 32};
        arrayTest.byteNegate(array);
        assertEquals(array, new int[]{15, 7, 6, 1, 0, -1, -2, -3, -8, -9, -11, -33});
        arrayTest.byteNegate(array);
        assertEquals(array, new int[]{-16, -8, -7, -2, -1, 0, 1, 2, 7, 8, 10, 32});
    }

    @Test
    private void testByteNegateNewArray() {
        int[] array = new int[]{-16, -8, -7, -2, -1, 0, 1, 2, 7, 8, 10, 32};
        int[] firstResultArray = arrayTest.byteNegateNewArray(array);
        int[] secondResultArray = arrayTest.byteNegateNewArray(firstResultArray);
        assertEquals(firstResultArray, new int[]{15, 7, 6, 1, 0, -1, -2, -3, -8, -9, -11, -33});
        assertEquals(secondResultArray, new int[]{-16, -8, -7, -2, -1, 0, 1, 2, 7, 8, 10, 32});
    }

    @Test
    private void testSumPares() {
        int[] array1 = new int[]{1, 6, 2, 5, 3, 4};
        int[] array2 = new int[]{1, 6, 2, 5, 3, 4, 7};
        assertEquals(arrayTest.sumPares(array1), new int[]{7, 7, 7});
        assertEquals(arrayTest.sumPares(array2), new int[]{7, 7, 7, 7});
    }

    @Test
    private void testIsEven() {
        assertEquals(arrayTest.isEven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), new boolean[]{false, true, false, true, false, true, false, true, false});
        assertEquals(arrayTest.isEven(new int[]{1, 5, 3}), new boolean[]{false, false, false});
        assertEquals(arrayTest.isEven(new int[]{2, 4, 6}), new boolean[]{true, true, true});
    }

    @Test
    private void testFillCycle(){
        assertEquals(arrayTest.fillCycle(5,3), new int[]{3, 4, 5, 1, 2});
        assertEquals(arrayTest.fillCycle(8,2), new int[]{7, 8, 1, 2, 3, 4, 5, 6});
        assertEquals(arrayTest.fillCycle(4,1), new int[]{4, 1, 2, 3});
    }

    @Test
    private void testCutLong(){
        assertEquals(arrayTest.cutLong(0b1110010110001110011000110011000111110011001100110111111100010101L), new int[]{0b11100101100011100110001100110001, 0b11110011001100110111111100010101});
    }
}