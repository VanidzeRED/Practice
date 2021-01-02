package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    Person firstPerson = new Person("Ivan", "Petrov", 1265, Gender.MALE);
    Person secondPerson = new Person("Marya", "Smirnova", 3597, Gender.FEMALE);

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

    @Test
    public void testGender(){
        Person somePerson = new Person("Rob", "Zombie", 7895, Gender.MALE);
        assertEquals(somePerson.getGender(), Gender.MALE);
        // Шок операция по смене пола!!!
        somePerson.setGender(Gender.FEMALE);
        assertEquals(somePerson.getGender(), Gender.FEMALE);
        assertNotEquals(somePerson.getGender(), Gender.MALE);
    }

    @Test
    public void testToString() {
        assertEquals(firstPerson.toString(), "Ivan Petrov");
        assertEquals(secondPerson.toString(), "Marya Smirnova");
    }
}