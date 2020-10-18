package ru.ssau.tk.pomelnikov.newtestproject;

public class Arrays {
    public double[] setArray(int count) {
        double[] firstArray = new double[count];
        return firstArray;
    }

    public int[] fillArrayOne(int count) {
        int[] filledArray = new int[count];
        for (int iterator = 0; iterator < count; iterator++) {
            filledArray[iterator] = (iterator == count - 1) | (iterator == 0) ? 2 : 1;
        }
        return filledArray;
    }

    public int[] fillArrayOdd(int count) {
        int[] filledArray = new int[count];
        int oddFlag = 1;
        for (int iterator = 0; iterator < count; iterator++) {
            filledArray[iterator] = oddFlag;
            oddFlag += 2;
        }
        return filledArray;
    }

    public int[] fillArrayEven(int count) {
        int[] filledArray = new int[count];
        int oddFlag = 2 * count;
        for (int iterator = 0; iterator < count; iterator++) {
            filledArray[iterator] = oddFlag;
            oddFlag -= 2;
        }
        return filledArray;
    }

    public int[] fillArrayFibonachi(int n) {
        int[] filledArray = new int[n];
        if (n == 1) {
            filledArray[0] = 1;
        }
        if (n == 2) {
            filledArray[0] = 1;
            filledArray[1] = 1;
        }
        if (n > 2) {
            filledArray[0] = 1;
            filledArray[1] = 1;
            for (int iterator = 2; iterator < n; iterator++) {
                filledArray[iterator] = filledArray[iterator - 1] + filledArray[iterator - 2];
            }
        }
        return filledArray;
    }

    public double[] fillArraySqr(int count) {
        double[] filledArray = new double[count];
        for (int i = 0; i < count; i++) {
            filledArray[i] = Math.pow(i, 2);
        }
        return filledArray;
    }

    public int[] fillArrayNatural(int count) {
        int[] filledArray = new int[count];
        filledArray[0] = 1;
        for (int i = 1; i < count; i++) {
            if ((filledArray[i - 1] + 1) % 3 != 0) {
                filledArray[i] = filledArray[i - 1] + 1;
            } else {
                filledArray[i] = filledArray[i - 1] + 2;
            }
        }
        return filledArray;
    }

    public void changeToNegative(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] *= -1;
        }
    }

    public int[][] createDoubleDimentionArray(int count) {
        int[][] newArray = new int[count][];
        int flag = 1;
        for (int i = 0; i < count; i++) {
            newArray[i] = new int[count - i];
            for (int j = 0; j < count - i; j++) {
                newArray[i][j] = flag++;
            }
        }
        return newArray;
    }


}
