package ru.ssau.tk.pomelnikov.newtestproject;

public class Arrays {
    public double[] setArray(int count){
        double[] firstArray = new double[count];
        return firstArray;
    }

    public int[] fillArrayOne(int count){
        int[] filledArray = new int[count];
        for (int iterator=0; iterator<count; iterator++){
            filledArray[iterator] = (iterator==count-1)|(iterator==0) ? 2: 1;
        }
        return filledArray;
    }

    public int[] fillArrayOdd(int count){
        int[] filledArray = new int[count];
        int oddFlag=1;
        for (int iterator=0; iterator<count; iterator++){
            filledArray[iterator] = oddFlag;
            oddFlag += 2;
        }
        return filledArray;
    }

    public int[] fillArrayEven(int count){
        int[] filledArray = new int[count];
        int oddFlag=2*count;
        for (int iterator=0; iterator<count; iterator++){
            filledArray[iterator] = oddFlag;
            oddFlag -= 2;
        }
        return filledArray;
    }

    public int[] fillArrayFibonachi(int n){
        int[] filledArray = new int[n];
        switch (n){
            case 1: filledArray[0] = 1;
            case 2: {filledArray[0] = 1; filledArray[1] = 1;}
            default: {
                filledArray[0] = 1;
                filledArray[1] = 1;
                for (int iterator = 2; iterator<n; iterator++){
                    filledArray[iterator]=filledArray[iterator-1]+filledArray[iterator-2];
                }
            }
        }
        return filledArray;
    }
}
