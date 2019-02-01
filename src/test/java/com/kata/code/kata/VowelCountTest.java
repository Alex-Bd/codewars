package com.kata.code.kata;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class VowelCountTest {

    @Autowired
    VowelCount Vowels ;

    @Test
    public void testCase1() {
        Assert.assertEquals("Nope!", 5, Vowels.getCount("abracadabra") );
    }
}
