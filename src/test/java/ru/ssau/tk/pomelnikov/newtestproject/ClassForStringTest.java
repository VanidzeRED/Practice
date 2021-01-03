package ru.ssau.tk.pomelnikov.newtestproject;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class ClassForStringTest {

    private static ClassForString stringTest = new ClassForString();

    @Test
    public void stingToConsoleTest() {
        stringTest.stringToConsole("qwerty ");
        stringTest.stringToConsole("Hello, World! ");
        stringTest.stringToConsole("Java is my favourite language");
    }

    @Test
    public void stingToBytesTest() {
        stringTest.stringToBytes("qwerty");
        System.out.println("-");
        stringTest.stringToBytes("Hello!");
        System.out.println("-");
        stringTest.stringToBytes("Привет!");
    }

    @Test
    public void equalStringTest() {
        stringTest.equalString();
    }

    @Test
    public void isPalindromTest() {
        assertTrue(stringTest.isPalindrom("qwertytrewq"));
        assertTrue(stringTest.isPalindrom("abba"));
        assertFalse(stringTest.isPalindrom("buba"));
        assertFalse(stringTest.isPalindrom("qwerty"));
    }

    @Test
    public void isEqualTest() {
        assertTrue(stringTest.isEqual("AAA", "aaa"));
        assertTrue(stringTest.isEqual("AbC", "aBC"));
        assertFalse(stringTest.isEqual("Qwe", "Qwe"));
        assertFalse(stringTest.isEqual("rty", "UIO"));
        assertFalse(stringTest.isEqual(null, "world"));
        assertFalse(stringTest.isEqual("Hello!", null));
        assertFalse(stringTest.isEqual(null, null));
    }

    @Test
    public void screaningSymbolsTest() {
        stringTest.screaningSymbols();
    }

    @Test
    public void indexOfPartTest() {
        assertEquals(stringTest.indexOfPart("qwerty", "ty"), 4);
        assertEquals(stringTest.indexOfPart("Hello", "ll"), 2);
        assertEquals(stringTest.indexOfPart("Turmion katilot", "n k"), 6);
        assertEquals(stringTest.indexOfPart("Turmion katilot", "nk"), -1);
    }

    @Test
    public void indexOfSecondPartTest() {
        assertEquals(stringTest.indexOfSecondPart("qwerty", "ty"), 4);
        assertEquals(stringTest.indexOfSecondPart("Hello", "ll"), 2);
        assertEquals(stringTest.indexOfSecondPart("Turmion katilot", "kat"), 8);
        assertEquals(stringTest.indexOfSecondPart("Turmion katilot", "n  "), -1);
    }

    @Test
    public void lastIndexOfFirstPartTest() {
        assertEquals(stringTest.lastIndexOfFirstPart("qwerty", "we"), 1);
        assertEquals(stringTest.lastIndexOfFirstPart("qwertwertytyui", "we"), 5);
        assertEquals(stringTest.lastIndexOfFirstPart("Turmion katilot", "we"), -1);
        assertEquals(stringTest.lastIndexOfFirstPart("Turmion katilot", "mi"), 3);
    }

    @Test
    public void countOfStartAndEndTest() {
        assertEquals(stringTest.countOfStartAndEnd(new String[]{"qwertyuiop", "qwefvbnmop", "qweasdfgop"}, "qwe", "op"), 3);
        assertEquals(stringTest.countOfStartAndEnd(new String[]{"qwertyuiop", "qwefvbnmop", "qweasdfiop"}, "qwe", "iop"), 2);
        assertEquals(stringTest.countOfStartAndEnd(new String[]{"qwertyuiop", "qwefvbnmop", "qweasdfgop"}, "we", "gop"), 0);
    }

    @Test
    public void countOfStartAndEndIgnoreSpaceTest() {
        assertEquals(stringTest.countOfStartAndEndIgnoreSpace(new String[]{"  qwertyuiop   ", "  qwefvbnmop ", "   qweasdfgop  "}, "qwe", "op"), 3);
        assertEquals(stringTest.countOfStartAndEndIgnoreSpace(new String[]{"  qwertyuiop", "  qwefvbnmop  ", " qweasdfi o p  "}, "qwe", "op"), 2);
        assertEquals(stringTest.countOfStartAndEndIgnoreSpace(new String[]{"  qwert  yuiop  ", " qwe fvbn mop ", " qwea sd fg op "}, "we", "gop"), 0);
    }

    @Test
    public void replaceStringsTest() {
        assertEquals(stringTest.replaceStrings("ороророро", "оро", "ро"), "роррро");
        assertEquals(stringTest.replaceStrings("tautauautau", "tau", "t"), "ttt");
        assertEquals(stringTest.replaceStrings("dequeue", "eq", "a"), "daueue");
    }

    @Test
    public void stringFromToTest() {
        assertEquals(stringTest.stringFromTo("Ruoska", -1, 10), "Ruoska");
        assertEquals(stringTest.stringFromTo("Rammstein", 2, 7), "mmste");
        assertEquals(stringTest.stringFromTo("Grotteque", 5, 1), "");
    }

    @Test
    public void objectToStringTest() {
        stringTest.objectToString(new NamedPoint());
        stringTest.objectToString(new Point(1.2, 5.3, -5.69));
        stringTest.objectToString(new Matrix(2,2));
        stringTest.objectToString(new Person("Ivan", "Ivanov"));
        stringTest.objectToString(5);
    }

    @Test
    public void stringToArrayTest() {
        assertEquals(stringTest.stringToArray("qwe rty uiop"), new String[] {"Qwe", "Rty", "Uiop"});
        assertEquals(stringTest.stringToArray("Asdrt  hTfss"), new String[] {"Asdrt", "", "HTfss"});
        assertEquals(stringTest.stringToArray("q werty asdfg"), new String[] {"Q", "Werty", "Asdfg"});
    }
}