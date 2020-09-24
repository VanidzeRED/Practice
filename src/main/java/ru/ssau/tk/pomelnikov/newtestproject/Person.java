package ru.ssau.tk.pomelnikov.newtestproject;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    void setFirstName (String firstName){
        this.firstName = firstName;
    }

    void setLastName (String lastName){
        this.lastName = lastName;
    }

    void setPassportId (int passportId){
        this.passportId = passportId;
    }

    String getFirstName (){
        return firstName;
    }

    String getLastName (){
        return  lastName;
    }

    int getPassportId (){
        return passportId;
    }
}
