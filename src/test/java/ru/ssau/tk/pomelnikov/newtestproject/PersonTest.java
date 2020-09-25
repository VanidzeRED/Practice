package ru.ssau.tk.pomelnikov.newtestproject;

import static org.testng.Assert.*;

public class PersonTest {
    public void testGetSet(){
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
    }
}