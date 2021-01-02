package ru.ssau.tk.pomelnikov.newtestproject;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;
    Gender gender;

    void setGender(Gender gender){
        this.gender = gender;
    }

    Gender getGender(){
        return gender;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getPassportId() {
        return passportId;
    }

    public Person (){
    }

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  Person (int passportId) {
        this.passportId = passportId;
    }

    public Person (String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person (String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }

    @Override
    public String toString (){
        return this.firstName + " " + this.lastName;
    }
}
