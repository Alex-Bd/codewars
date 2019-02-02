package com.kata.code.kata;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlphabeticAnagramsTest {
    @Autowired
    AlphabeticAnagrams anagram;
    @Test
    public void testKnownInputs() {

   // assertEquals("Position for 'A' incorrect", BigInteger.ONE, anagram.listPosition("A"));
   //  assertEquals("Position for 'A' incorrect", BigInteger.ONE, anagram.listPosition("ABCDEFG"));

     // assertEquals("Position for 'ABAB' incorrect", BigInteger.valueOf(2), anagram.listPosition("ABAB"));

   // assertEquals("Position for 'AAAB' incorrect", BigInteger.ONE, anagram.listPosition("AAAB"));
    //  assertEquals("Position for 'BAAA' incorrect", BigInteger.valueOf(4), anagram.listPosition("BAAA"));

     //   assertEquals("Position for 'QUESTION' incorrect", BigInteger.valueOf(24572), anagram.listPosition("QUESTION"));

        assertEquals("Position for 'BOOKKEEPER' incorrect", BigInteger.valueOf(10743), anagram.listPosition("BOOKKEEPER"));
    //assertEquals("Position for 'ZRMYGBYEUMMLKFRDZZSCVIFGS' incorrect", BigInteger.("12870590285149953329269"), anagram.listPosition("ZRMYGBYEUMMLKFRDZZSCVIFGS"));

    }
}
