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

    public double[] fillArrayArithmeticProgression(int count, double begin, double difference) {
        double[] filledArray = new double[count];
        filledArray[0] = begin;
        for (int i = 1; i < count; i++) {
            filledArray[i] = filledArray[i - 1] + difference;
        }
        return filledArray;
    }

    public double[] fillArrayGeometricProgression(int count, double begin, double denominator) {
        double[] filledArray = new double[count];
        filledArray[0] = begin;
        for (int i = 1; i < count; i++) {
            filledArray[i] = filledArray[i - 1] * denominator;
        }
        return filledArray;
    }

    public int[] findDenominators(int arg) {
        int borderValue = (int) Math.sqrt(arg) + 1;
        int count = 0;
        boolean[] helpArray = new boolean[borderValue];
        for (int i = 0; i < borderValue; i++) {
            if (arg % (i + 1) == 0) {
                helpArray[i] = true;
                count++;
            } else {
                helpArray[i] = false;
            }
        }
        int[] newArray = new int[count];
        int flag = 0;
        for (int i = 0; i < borderValue; i++) {
            if (helpArray[i]) {
                newArray[flag++] = i + 1;
            }
        }
        return newArray;
    }

    public static boolean isPrime(int arg) {
        int count = 0;
        for (int i = 1; i <= arg; i++) {
            if (arg % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public int[] findPrime(int arg) {
        boolean[] helpArray = new boolean[arg];
        int count = 0;
        for (int i = 1; i < arg; i++) {
            helpArray[i] = isPrime(i + 1);
            if (helpArray[i]) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int flag = 0;
        for (int i = 1; i < arg; i++) {
            if (helpArray[i]) {
                newArray[flag++] = i + 1;
            }
        }
        return newArray;
    }

    public int[] fillArrayMirror(int arg) {
        int[] newArray = new int[arg];
        int center = (arg % 2 == 1) ? arg / 2 : arg / 2 - 1;
        for (int i = 0; i <= center; i++) {
            newArray[i] = i + 1;
        }
        int flag = 1;
        for (int i = arg - 1; i > center; i--) {
            newArray[i] = flag++;
        }
        return newArray;
    }

    public boolean isInArray(int[] array, int arg) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arg) {
                return true;
            }
        }
        return false;
    }

    public boolean isInArray(double[] array, double arg) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == (arg)) {
                return true;
            }
        }
        return false;
    }

    public boolean isNullInArray(Integer[] objects) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                return true;
            }
        }
        return false;
    }

    public int findCountOfEven(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public Integer findMax(int[] array) {
        if (array.length == 0) {
            return null;
        } else {
            Integer max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) max = array[i];
            }
            return max;
        }
    }

    public Integer findMin(int[] array) {
        if (array.length == 0) {
            return null;
        } else {
            Integer min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) min = array[i];
            }
            return min;
        }
    }

    public int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ) {
            sum += array[i];
            i += 2;
        }
        return sum;
    }

    public boolean isMultiple(int[] array) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] % array[0] == 0) count1++;
            if (array[i] % array[array.length - 1] == 0) count2++;
        }
        return count1 > count2;
    }

    public int findMostPopular(int[] array) {
        int length = array.length;
        int[] newArray = new int[length];
        for (int i = 0; i < length - 1; i++) {
            newArray[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) newArray[i]++;
            }
        }
        int max = newArray[0];
        int maxIndex = 0;
        for (int i = 1; i < length; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
                maxIndex = i;
            }
        }
        return array[maxIndex];
    }

    public int findIndexOfElem(int[] array, int arg) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arg) return i;
        }
        return -1;
    }

    public void exchangeMaxMin(int[] array) {
        int maxIndex = findIndexOfElem(array, findMax(array));
        int minIndex = findIndexOfElem(array, findMin(array));
        int buffer = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = buffer;
    }

    public void byteNegate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public int[] byteNegateNewArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = ~array[i];
        }
        return newArray;
    }

    public int[] sumPares(int[] array) {
        int length = array.length;
        int newLength = (length % 2 == 0) ? array.length / 2 : array.length / 2 + 1;
        int[] newArray = new int[newLength];
        int flag = 0;
        for (int i = 0; i < newLength; i++) {
            newArray[i] = (i + flag + 1 < length) ? array[i + flag] + array[i + flag + 1] : array[i + flag];
            flag++;
        }
        return newArray;
    }

    public boolean[] isEven(int[] array) {
        int length = array.length;
        boolean[] newArray = new boolean[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i] % 2 == 0;
        }
        return newArray;
    }

    public int[] cutLong(long arg) {
        int[] newArray = new int[2];
        newArray[0] = (int) (arg >> 32);
        newArray[1] = (int) arg;
        return newArray;
    }

    public int[] fillCycle(int length, int index) {
        int flag = 1;
        int[] newArray = new int[length];
        for (int i = index; i < length; i++) {
            newArray[i] = flag++;
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = flag++;
        }
        return newArray;
    }

    public void sortArray(double[] array) {
        for (double currentElement : array) {
            if (Double.isNaN(currentElement)) {
                return;
            }
        }
        java.util.Arrays.sort(array);
    }

    public void arrayToConsole(String[] array){
        for (String currentString : array){
            System.out.println(currentString);
        }
    }
}
