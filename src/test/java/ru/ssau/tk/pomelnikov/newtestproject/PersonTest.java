package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    /*public void testGetSet(){
        Person firstPerson = new Person();
        firstPerson.setFirstName("Ivan");
        firstPerson.setLastName("Pomelnikov");
        firstPerson.setPassportId(1234);

        Person secondPerson = new Person();
        firstPerson.setFirstName("Aidar");
        firstPerson.setLastName("Timirbulatov");
        firstPerson.setPassportId(5678);

        assertEquals(firstPerson.getFirstName(), "Ivan");
        assertEquals(firstPerson.getLastName(), "Pomelnikov");
        assertNotEquals(firstPerson.getPassportId(), 5678);
        assertEquals(secondPerson.getPassportId(), 5678);
    }*/

    @Test
    public void testFirstName(){
        Person somePerson = new Person();
        somePerson.setFirstName("Till");
        assertEquals(somePerson.getFirstName(), "Till");

        somePerson.setFirstName("John");
        assertNotEquals(somePerson.getFirstName(), "Till");
        assertEquals(somePerson.getFirstName(), "John");
    }

    @Test
    public void testLastName(){
        Person somePerson = new Person();
        somePerson.setLastName("Lindemann");
        assertEquals(somePerson.getLastName(), "Lindemann");

        somePerson.setLastName("Lenon");
        assertNotEquals(somePerson.getLastName(), "Till");
        assertEquals(somePerson.getLastName(), "Lenon");
    }

    @Test
    public void testPassportId(){
        Person somePerson = new Person();
        somePerson.setPassportId(1036);
        assertEquals(somePerson.getPassportId(), 1036);

        somePerson.setPassportId(9506);
        assertNotEquals(somePerson.getPassportId(), 1036);
        assertEquals(somePerson.getPassportId(), 9506);
    }
}