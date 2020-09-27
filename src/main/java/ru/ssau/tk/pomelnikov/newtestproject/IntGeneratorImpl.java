package ru.ssau.tk.pomelnikov.newtestproject;

public class IntGeneratorImpl implements IntGenerator {
    private int count = -1;

    @Override
    public int nextInt() {
        this.count +=1;
        return count;
    }
}
