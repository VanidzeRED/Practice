package ru.ssau.tk.pomelnikov.newtestproject;

public class TangentOperation extends Operation{

    @Override
    double apply(double number){
        return java.lang.Math.tan(number);
    }
}
