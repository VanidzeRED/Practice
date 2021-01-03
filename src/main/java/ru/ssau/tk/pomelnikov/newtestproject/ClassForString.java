package ru.ssau.tk.pomelnikov.newtestproject;

import java.util.Arrays;
import java.util.Locale;

public class ClassForString {

    public void stringToConsole(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public void stringToBytes(String string) {
        byte[] bytesArray = string.getBytes();
        for (byte currentByte : bytesArray) {
            System.out.println(currentByte);
        }
    }

    public void equalString() {
        String stringOne = "Some string";
        String stringTwo = new String(stringOne);
        System.out.println(stringOne == stringTwo);
        System.out.println(stringOne.equals(stringTwo));
    }

    public boolean isPalindrom(String string) {
        int strLen = string.length();
        for (int i = 0; i * 2 < strLen; i++) {
            if (string.charAt(i) != string.charAt(strLen - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public boolean isEqual(String firstString, String secondString) {
        if ((firstString == null) || (secondString == null)) {
            return false;
        } else {
            return !(firstString.equals(secondString)) & (firstString.equalsIgnoreCase(secondString));
        }
    }

    public void screaningSymbols() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }

    public int indexOfPart(String firstString, String secondString) {
        return firstString.indexOf(secondString);
    }

    public int indexOfSecondPart(String firstString, String secondString) {
        int middle = firstString.length() / 2;
        return firstString.indexOf(secondString, middle);
    }

    public int lastIndexOfFirstPart(String firstString, String secondString) {
        int middle = firstString.length() % 2 == 0 ? firstString.length() / 2 : firstString.length() / 2 + 1;
        return firstString.lastIndexOf(secondString, middle);
    }

    public int countOfStartAndEnd(String[] arrayStr, String prefix, String postfix) {
        int count = 0;
        for (String currentStr : arrayStr) {
            if (currentStr.startsWith(prefix) && currentStr.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public int countOfStartAndEndIgnoreSpace(String[] arrayStr, String prefix, String postfix) {
        int count = 0;
        for (String currentStr : arrayStr) {
            if (currentStr.trim().startsWith(prefix) && currentStr.trim().endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    public String replaceStrings(String original, String entering, String replacer) {
        int flag = 1;
        while (flag <= 100) {
            if (!original.contains(entering)) {
                return original;
            }
            original = original.replaceAll(entering, replacer);
            flag++;
        }
        return original;
    }

    public String stringFromTo(String string, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > string.length()) {
            to = string.length();
        }
        if (to <= from) {
            return "";
        }
        return string.substring(from, to);
    }

    public void objectToString(Object object) {
        System.out.println("Описание объекта: " + object.toString());
    }

    public String[] stringToArray(String string) {
        String[] arrayString = string.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].length() == 1) {
                arrayString[i] = arrayString[i].toUpperCase();
            }
            if (arrayString[i].length() > 1) {
                arrayString[i] = arrayString[i].substring(0, 1).toUpperCase() + arrayString[i].substring(1);
            }
        }
        return arrayString;
    }

    public String arrayToString(String[] array) {
        return String.join(", ", array);
    }

    public String newStringBuilder(String string) {
        StringBuilder newString = new StringBuilder(string);
        for (int i = 1; i < string.length(); ) {
            newString.replace(i, i+1, String.valueOf(i + 1));
            i += 2;
        }
        return newString.reverse().toString();
    }

    public String allNumbersBefore (int arg){
        StringBuilder newString = new StringBuilder();
        if (arg > 0){
            for (int i = 0; i < arg; i++){
                newString.append(i);
                newString.append(" ");
            }
        }
        if (arg < 0){
            for (int i = 0; i > arg; i--){
                newString.append(i);
                newString.append(" ");
            }
        }
        return newString.toString();
    }
}
