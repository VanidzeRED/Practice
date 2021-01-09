package ru.ssau.tk.pomelnikov.newtestproject.Exceptions;

public class UncheckableException extends RuntimeException {

    public UncheckableException (Exception e) {
        super(e);
    }
}
