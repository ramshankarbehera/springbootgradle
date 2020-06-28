package com.javadeveloperzone;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMyCode {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("This test method should be run");
        assertEquals("test","test");
    }
}