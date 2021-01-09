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
    }

    @Test
    public void testCharAt() {
    }

    @Test
    public void testDivision() {
    }
}