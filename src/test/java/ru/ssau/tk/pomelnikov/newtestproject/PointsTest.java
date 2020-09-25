package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    Point firstPoint = new Point(2, 8, 16);
    Point secondPoint = new Point(8.1, 9.36,24.45);
    Point thirdPoint = new Point(100, 100, 100);
    final double delta = 0.01;

    @Test
    public void testSum (){
        Point resultPoint = Points.sumPoints(firstPoint, secondPoint);
        assertEquals(resultPoint.x, 10.1, delta);
        assertEquals(resultPoint.y, 17.36, delta);
        assertEquals(resultPoint.z, 40.45, delta);
    }

    @Test
    public void testSubtract (){
        Point resultPoint = Points.subtractPoints(firstPoint, secondPoint);
        assertEquals(resultPoint.x, -6.1, delta);
        assertEquals(resultPoint.y, -1.36, delta);
        assertEquals(resultPoint.z, -8.45, delta);
    }

    @Test
    public void testMultiply (){
        Point resultPoint = Points.multiplyPoints (secondPoint, thirdPoint);
        assertEquals(resultPoint.x, 810.0, delta);
        assertEquals(resultPoint.y, 936.0, delta);
        assertEquals(resultPoint.z, 2445.0, delta);
    }

    @Test
    public void testDivide (){
        Point resultPoint = Points.dividePoints(firstPoint, thirdPoint);
        assertEquals(resultPoint.x, 0.02, delta);
        assertEquals(resultPoint.y, 0.08, delta);
        assertEquals(resultPoint.z, 0.155, delta);
    }

    @Test
    public void testEnlarge (){
        Point resultPoint = Points.enlarge(firstPoint, 5);
        assertEquals(resultPoint.x, 10.0, delta);
        assertEquals(resultPoint.y, 40.0, delta);
        assertEquals(resultPoint.z, 80.0, delta);
        resultPoint = Points.enlarge(secondPoint, 2.25);
        assertEquals(resultPoint.x, 18.22, delta);
        assertEquals(resultPoint.y, 21.06, delta);
        assertEquals(resultPoint.z, 55.01, delta);
    }

    @Test
    public void testLength (){
        assertEquals(Points.length(firstPoint), 18.0, delta);
        assertNotEquals(Points.length(secondPoint), 18.0, delta);
        assertEquals(Points.length(thirdPoint), 173.2, delta);
    }

    @Test
    public void testOpposite (){
        Point resultPoint = Points.opposite(firstPoint);
        assertEquals(resultPoint.x, -2.0, delta);
        assertEquals(resultPoint.y, -8.0, delta);
        assertEquals(resultPoint.z, -16.0, delta);
    }

    @Test
    public void testInverse (){
        Point resultPoint = Points.inverse(firstPoint);
        assertEquals(resultPoint.x, 0.5, delta);
        assertEquals(resultPoint.y, 0.13, delta);
        assertEquals(resultPoint.z, 0.06, delta);
    }

    @Test
    public void testScalar (){
        assertEquals(Points.scalarProduct(secondPoint, thirdPoint), 4191.0, delta);
    }

    @Test
    public void testVector (){
        Point resultPoint = Points.vectorProduct(firstPoint, thirdPoint);
        assertEquals(resultPoint.x, -800.0, delta);
        assertEquals(resultPoint.y, 1400.0, delta);
        assertEquals(resultPoint.z, -600.0, delta);
    }
}