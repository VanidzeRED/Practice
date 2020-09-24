package ru.ssau.tk.pomelnikov.newtestproject;

public class HelloWorld {
    public static void main(String[] args) {
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
    }
}
