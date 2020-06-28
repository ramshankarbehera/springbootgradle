package com.javadeveloperzone;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

class TestMyCode {


    @Tag("fast")
    @Test
    void justAnExample() {
        System.out.println("This test method should be run");
    }
}