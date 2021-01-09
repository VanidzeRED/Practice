package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExceptionsTaskTest {

    ExceptionsTask exceptionsTask = new ExceptionsTask();

    @Test
    public void testPersonToString() {
        assertEquals(exceptionsTask.personToString(new Person("Ivan", "Ivanov", 3987)), "Ivan Ivanov");
        assertThrows(NullPointerException.class, () -> exceptionsTask.personToString(null));
    }

    @Test
    public void testFindSymbol() {
        assertEquals(exceptionsTask.findSymbol(new String[]{"qwerty", "asdFg", "zxcv", "string"}, 3), new char[]{'r', 'F', 'v', 'i'});
        assertThrows(StringIndexOutOfBoundsException.class, () -> exceptionsTask.findSymbol(new String[]{"qwerty", "asdFg", "zxcv", "string"}, 4));
        assertThrows(StringIndexOutOfBoundsException.class, () -> exceptionsTask.findSymbol(new String[]{"qwerty", "asdFg", "zxcv", "string"}, -1));
        assertThrows(NullPointerException.class, () -> exceptionsTask.findSymbol(new String[]{null, "asdFg", "zxcv", "string"}, 4));
        assertThrows(NullPointerException.class, () -> exceptionsTask.findSymbol(null, 10));
    }

    @Test
    public void testCharAt() {
        assertEquals(exceptionsTask.charAt(new String[]{"qwerty", "asdFg", "zxcv", "string"}, 3, 2), 'r');
        assertEquals(exceptionsTask.charAt(new String[]{"qwerty", "asdFg", "zxcv", "string"}, 1, 3), 'F');
        assertThrows(NullPointerException.class, () -> exceptionsTask.charAt(null, 1, 2));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> exceptionsTask.charAt(new String[]{"qwerty", "asdFg", "zxcv", "string"}, 4, 1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> exceptionsTask.charAt(new String[]{"qwerty", "asdFg", "zxcv", "string"}, 5, 10));
        assertThrows(StringIndexOutOfBoundsException.class, () -> exceptionsTask.charAt(new String[]{"qwerty", "asdFg", "zxcv", "string"}, 0, 8));
    }

    @Test
    public void testDivision() {
        assertEquals(exceptionsTask.division("54", "20"), 2);
        assertEquals(exceptionsTask.division("100", "10"), 10);
        assertThrows(NumberFormatException.class, () -> exceptionsTask.division(null, "2"));
        assertThrows(NumberFormatException.class, () -> exceptionsTask.division("1", "aaa"));
        assertThrows(NumberFormatException.class, () -> exceptionsTask.division("1", "0.5"));
        assertThrows(ArithmeticException.class, () -> exceptionsTask.division("1", "0"));
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        CloneClass cloneClass = new CloneClass();
        CloneClassWithInterfaceRealisation cloneClassWithInterfaceRealisation = new CloneClassWithInterfaceRealisation();
        assertThrows(CloneNotSupportedException.class, cloneClass::clone);
        // Throws exception due to not realises interface
        Object object = cloneClassWithInterfaceRealisation.clone();
        // Not throws exception due to realises interface
    }
}