package ru.ssau.tk.pomelnikov.newtestproject;

abstract public class Operation {
    abstract double apply(double number);

    double applyTripple (double number){
        return apply(apply(apply(number)));
    }
}
