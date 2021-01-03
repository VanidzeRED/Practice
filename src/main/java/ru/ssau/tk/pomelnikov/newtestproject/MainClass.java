package ru.ssau.tk.pomelnikov.newtestproject;

public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
        ArraysClass arrays = new ArraysClass();
        arrays.arrayToConsole(new String[]{"qwe", "rtyu", "asdf", "nbvcxz"});
        System.out.println("\nКодировка:");
        System.out.println(java.nio.charset.Charset.defaultCharset());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }

}
