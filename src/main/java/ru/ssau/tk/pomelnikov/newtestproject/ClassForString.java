package ru.ssau.tk.pomelnikov.newtestproject;

public class ClassForString {
    public void stringToConsole(String string){
        for (int i=0; i<string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public void stringToBytes(String string){
        byte[] bytesArray = string.getBytes();
        for (byte currentByte: bytesArray){
            System.out.println(currentByte);
        }
    }
}
