package ru.ssau.tk.pomelnikov.newtestproject;

public class ResettableIntGenerator implements Resettable, IntGenerator {
    private int count = -1;

    @Override
    public int nextInt() {
        this.count +=1;
        return count;
    }

    @Override
    public void reset(){
        this.count = -1;
    }
}
