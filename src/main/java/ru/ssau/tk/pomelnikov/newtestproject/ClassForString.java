package ru.ssau.tk.pomelnikov.newtestproject;

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
}
