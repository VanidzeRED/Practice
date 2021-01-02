package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    Point firstPoint = new Point(1, 2, 2);
    Point secondPoint = new Point(10, 6, -9);
    Point thirdPoint = new Point(5.3, -3.54, 2.05);

    @Test
    public void testLength() {
        assertEquals(firstPoint.length(), 3.0, 0.01);
        assertEquals(secondPoint.length(), 14.73, 0.01);
        assertEquals(thirdPoint.length(), 6.69, 0.01);
    }

    @Test
    public void testTestToString() {
        assertEquals(firstPoint.toString(), "[1.0, 2.0, 2.0]");
        assertEquals(secondPoint.toString(), "[10.0, 6.0, -9.0]");
        assertEquals(thirdPoint.toString(), "[5.3, -3.54, 2.05]");
    }
}