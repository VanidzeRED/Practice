package ru.ssau.tk.pomelnikov.newtestproject;

public class ClassForString {
    public void stringToConsole(String string){
        for (int i=0; i<string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}
