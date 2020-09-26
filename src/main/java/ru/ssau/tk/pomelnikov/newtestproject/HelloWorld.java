package ru.ssau.tk.pomelnikov.newtestproject;

public class HelloWorld {
    public static void someMethod(String[] args) {
        //System.out.println("Hello, world!");

        Person firstPerson = new Person();
        firstPerson.setFirstName("Mark");
        firstPerson.setLastName("Kierhe");
        firstPerson.setPassportId(1234);

        Person secondPerson = new Person();
        secondPerson.setFirstName("Aleksandr");
        secondPerson.setLastName("Bassilica");
        secondPerson.setPassportId(5678);

        Person thirdPerson =  new Person("Gans", "von Stromberg");

        Person fourthPerson = new Person (1596);

        Person fifthPerson = new Person ("Filipp", "August", 6688);

        Point firstPoint = new Point (1,1,1);

        Point secondPoint = new Point (5.4, 6.9, 10.2);

        Point thirdPoint = new Point (-98.5, 1002.4589, -963.54);

        Point resultPoint = Points.sumPoints(firstPoint,secondPoint);

        System.out.println(resultPoint.x);
        System.out.println(resultPoint.y);
        System.out.println(resultPoint.z);
        System.out.println("----");

        resultPoint = Points.subtractPoints(secondPoint, thirdPoint);

        System.out.println(resultPoint.x);
        System.out.println(resultPoint.y);
        System.out.println(resultPoint.z);
        System.out.println("----");

        resultPoint = Points.multiplyPoints(secondPoint, thirdPoint);

        System.out.println(resultPoint.x);
        System.out.println(resultPoint.y);
        System.out.println(resultPoint.z);
        System.out.println("----");

        resultPoint = Points.dividePoints(firstPoint, secondPoint);

        System.out.println(resultPoint.x);
        System.out.println(resultPoint.y);
        System.out.println(resultPoint.z);
        System.out.println("----");

    }
}
