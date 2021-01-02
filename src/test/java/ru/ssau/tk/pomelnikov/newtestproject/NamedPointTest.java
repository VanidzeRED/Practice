package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void testNamedPoint() {
        NamedPoint firstTestPoint = new NamedPoint();
        assertEquals(firstTestPoint.x, 0.0, 0.01);
        assertEquals(firstTestPoint.y, 0.0, 0.01);
        assertEquals(firstTestPoint.z, 0.0, 0.01);
        assertEquals(firstTestPoint.getName(), "Origin");

        NamedPoint secondTestPoint = new NamedPoint(5, 6, 10, "PointA");
        assertEquals(secondTestPoint.x, 5.0, 0.01);
        assertEquals(secondTestPoint.y, 6.0, 0.01);
        assertEquals(secondTestPoint.z, 10.0, 0.01);
        assertEquals(secondTestPoint.getName(), "PointA");
    }

    @Test
    public void testReset() {
        NamedPoint thirdTestPoint = new NamedPoint(0, 0, 0, "PointC");
        assertEquals(thirdTestPoint.getName(), "PointC");
        thirdTestPoint.reset();
        assertEquals(thirdTestPoint.getName(), "Absent");
    }

    @Test
    public void testToString() {
        Point firstPoint = new NamedPoint(1, 2, 2, "First point");
        Point secondPoint = new NamedPoint(10, 6, -9);
        Point thirdPoint = new NamedPoint();

        assertEquals(firstPoint.toString(), "First point [1.0, 2.0, 2.0]");
        assertEquals(secondPoint.toString(), "[10.0, 6.0, -9.0]");
        assertEquals(thirdPoint.toString(), "Origin [0.0, 0.0, 0.0]");
    }
}