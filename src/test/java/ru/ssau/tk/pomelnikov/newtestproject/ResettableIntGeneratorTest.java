package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    ResettableIntGenerator generatorTest = new ResettableIntGenerator();

    @Test
    public void resettableGeneratorTest(){
        int iterator;
        for(iterator=0; iterator<5; iterator++) {
            assertEquals(generatorTest.nextInt(), iterator);
        }
        generatorTest.reset();
        for(iterator=0; iterator<5; iterator++) {
            assertEquals(generatorTest.nextInt(), iterator);
        }
    }
}