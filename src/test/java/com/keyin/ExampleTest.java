package com.keyin;

import java.util.Date;
import com.java.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    public void testGetTodayDate(){
        Example exampleUnderTest = new Example();

        Assertions.assertEquals(new Date(),exampleUnderTest.getTodayDate());
    }
}
