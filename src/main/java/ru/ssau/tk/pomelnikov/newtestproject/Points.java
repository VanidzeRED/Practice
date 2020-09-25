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

    static Point enlarge (Point point, double number){
        return new Point (point.x * number,point.y * number,point.z * number);
    }

    static double length (Point point){
        return point.length();
    }

    static Point inverse (Point point){
        Point point1 = new Point(1,1,1);
        return Points.dividePoints(point1, point);
    }

    static Point opposite (Point point){
        Point point1 = new Point(-1,-1,-1);
        return Points.multiplyPoints(point1, point);
    }

    private Points (){
    }
}
