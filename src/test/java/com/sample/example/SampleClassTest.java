package com.sample.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleClassTest {

    @Test
    public void sampleTest() {
        SampleClass sampleClass = new SampleClass();

        Assert.assertEquals("data", sampleClass.sample("data"));
    }

}