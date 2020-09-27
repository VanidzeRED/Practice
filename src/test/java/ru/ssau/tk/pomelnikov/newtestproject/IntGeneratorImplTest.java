package ru.ssau.tk.pomelnikov.newtestproject;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {
    IntGenerator generatorTest = new IntGeneratorImpl();

    @Test
    public void intGeneratorImplTest(){
        int iterator;
        for(iterator=0; iterator<5; iterator++) {
            assertEquals(generatorTest.nextInt(), iterator);
        }
    }
}