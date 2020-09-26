package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void testNamedPoint(){
        NamedPoint firstTestPoint = new NamedPoint();
        assertEquals(firstTestPoint.x,0.0, 0.01);
        assertEquals(firstTestPoint.y,0.0, 0.01);
        assertEquals(firstTestPoint.z,0.0, 0.01);
        assertEquals(firstTestPoint.getName(),"Origin");

        NamedPoint secondTestPoint = new NamedPoint(5, 6, 10, "PointA");
        assertEquals(secondTestPoint.x,5.0, 0.01);
        assertEquals(secondTestPoint.y,6.0, 0.01);
        assertEquals(secondTestPoint.z,10.0, 0.01);
        assertEquals(secondTestPoint.getName(),"PointA");
    }
}