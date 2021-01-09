package ru.ssau.tk.pomelnikov.newtestproject;

public class ExceptionsTask {

    public String personToString(Person person) {
        return personToString(person);
    }

    public char[] findSymbol(String[] array, int n) {
        char[] returnArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[i].charAt(n);
        }
        return returnArray;
    }

    public char charAt(String[] array, int m, int n) {
        return array[m].charAt(n);
    }

    public int division(String firstNum, String secondNum){
        return Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
    }
}
