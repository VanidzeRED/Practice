package ru.ssau.tk.pomelnikov.newtestproject;

public class SqrtOperation extends Operation{

    @Override
    double apply (double number){
        return java.lang.Math.sqrt(number);
    }
}
