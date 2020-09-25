package ru.ssau.tk.pomelnikov.newtestproject;

import java.lang.Math;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length (){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
    }
}
