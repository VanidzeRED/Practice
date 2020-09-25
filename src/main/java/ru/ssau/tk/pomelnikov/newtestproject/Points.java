package ru.ssau.tk.pomelnikov.newtestproject;

public class Points {
    static Point sumPoints (Point pointA, Point pointB){
        return new Point (pointA.x + pointB.x,pointA.y + pointB.y,pointA.z + pointB.z);
    }

    static Point subtractPoints (Point pointA, Point pointB){
        return new Point (pointA.x - pointB.x,pointA.y - pointB.y,pointA.z - pointB.z);
    }

    static Point multiplyPoints (Point pointA, Point pointB){
        return new Point (pointA.x * pointB.x,pointA.y * pointB.y,pointA.z * pointB.z);
    }

    static Point dividePoints (Point pointA, Point pointB){
        return new Point (pointA.x / pointB.x,pointA.y / pointB.y,pointA.z / pointB.z);
    }

    private Points (){
    }
}
