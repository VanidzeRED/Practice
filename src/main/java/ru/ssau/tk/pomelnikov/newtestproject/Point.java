package ru.ssau.tk.pomelnikov.newtestproject;

import java.io.Serial;
import java.io.Serializable;
import java.lang.Math;

public class Point implements Serializable {
    @Serial
    private static final long serialVersionUID = 6341456290558102780L;
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public String toString() {
        return "[" + this.x + ", " + this.y + ", " + this.z + "]";
    }
}
