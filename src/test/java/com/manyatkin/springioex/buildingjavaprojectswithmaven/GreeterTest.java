package com.manyatkin.springioex.buildingjavaprojectswithmaven;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello(){
        assertThat(greeter.sayHello(),containsString("Hello"));
    }

    @Test
    public void greeterSum(){
        assertEquals(greeter.sum(1,2),3);
        assertEquals(greeter.sum(12,2),14);
    }
}
