package ru.ssau.tk.pomelnikov.newtestproject;

public class IncompatibleDimensionsException extends Exception{

    IncompatibleDimensionsException(){
        super();
    }

    IncompatibleDimensionsException(String message){
        super(message);
    }
}
