package ru.ssau.tk.pomelnikov.newtestproject;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class ClassForStringTest {

    private static ClassForString stringTest = new ClassForString();

    @Test
    public void stingToConsoleTest(){
        stringTest.stringToConsole("qwerty ");
        stringTest.stringToConsole("Hello, World! ");
        stringTest.stringToConsole("Java is my favourite language");
    }

    @Test
    public void stingToBytesTest(){
        stringTest.stringToBytes("qwerty");
        System.out.println("-");
        stringTest.stringToBytes("Hello!");
        System.out.println("-");
        stringTest.stringToBytes("Привет!");
    }
}