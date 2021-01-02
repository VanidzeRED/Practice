package ru.ssau.tk.pomelnikov.newtestproject;

public class Points {

    static Point sumPoints(Point pointA, Point pointB) {
        return new Point(pointA.x + pointB.x, pointA.y + pointB.y, pointA.z + pointB.z);
    }

    static Point subtractPoints(Point pointA, Point pointB) {
        return new Point(pointA.x - pointB.x, pointA.y - pointB.y, pointA.z - pointB.z);
    }

    static Point multiplyPoints(Point pointA, Point pointB) {
        return new Point(pointA.x * pointB.x, pointA.y * pointB.y, pointA.z * pointB.z);
    }

    static Point dividePoints(Point pointA, Point pointB) {
        return new Point(pointA.x / pointB.x, pointA.y / pointB.y, pointA.z / pointB.z);
    }

    static Point enlarge(Point point, double number) {
        return new Point(point.x * number, point.y * number, point.z * number);
    }

    static double length(Point point) {
        return point.length();
    }

    static Point inverse(Point point) {
        Point pointHelper = new Point(1, 1, 1);
        return Points.dividePoints(pointHelper, point);
    }

    static Point opposite(Point point) {
        Point pointHelper = new Point(-1, -1, -1);
        return Points.multiplyPoints(pointHelper, point);
    }

    static double scalarProduct(Point firstVector, Point secondVector) {
        return firstVector.x * secondVector.x + firstVector.y * secondVector.y + firstVector.z * secondVector.z;
    }

    static Point vectorProduct(Point firstVector, Point secondVector) {
        return new Point(firstVector.y * secondVector.z - firstVector.z * secondVector.y, firstVector.z * secondVector.x - firstVector.x * secondVector.z, firstVector.x * secondVector.y - firstVector.y * secondVector.x);
    }

    private Points() {
    }
}
