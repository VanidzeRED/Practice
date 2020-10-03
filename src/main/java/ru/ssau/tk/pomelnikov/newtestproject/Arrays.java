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
}
