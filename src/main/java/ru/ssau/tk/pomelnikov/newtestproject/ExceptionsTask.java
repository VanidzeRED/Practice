package ru.ssau.tk.pomelnikov.newtestproject;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ExceptionsTask {

    public String personToString(Person person) {
        return person.toString();
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

    public int division(String firstNum, String secondNum) {
        return Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
    }

    public void serialize(OutputStream outputStream, Object object) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(outputStream);
        out.writeObject(object);
    }
}