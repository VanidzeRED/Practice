package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import java.io.PrintStream;

import static org.testng.Assert.*;

public class TypeToTextTest {
    TypeToText typeToTextTest = new TypeToText();

    @Test
    public void testByte(){
        byte arg = 1;
        typeToTextTest.printType(arg);
        //assertEquals(System.setOut(PrintStream), "byte");
    }

    @Test
    public void testChar(){
        char arg = 'a';
        typeToTextTest.printType(arg);
    }

    @Test
    public void testShort(){
        short arg = 128;
        typeToTextTest.printType(arg);
    }

    @Test
    public void testInt(){
        int arg = 32000;
        typeToTextTest.printType(arg);
    }

    @Test
    public void testLong(){
        long arg = -960553235;
        typeToTextTest.printType(arg);
    }

    @Test
    public void testFloat(){
        float arg = 54;
        typeToTextTest.printType(arg);
    }

    @Test
    public void testDouble(){
        double arg = 128.69;
        typeToTextTest.printType(arg);
    }

    @Test
    public void testBoolean(){
        boolean arg = Boolean.TRUE;
        typeToTextTest.printType(arg);
    }

    @Test
    public void testObject(){
        Object object1 = null;
        typeToTextTest.printType(object1);
        Person object2 = new Person();
        typeToTextTest.printType(object2);
        Point object3 = new NamedPoint();
        typeToTextTest.printType(object3);
        ResettableIntGenerator object4 = new ResettableIntGenerator();
        typeToTextTest.printType(object4);
    }
}