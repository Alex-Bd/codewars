package com.kata.code.kata;

import org.springframework.stereotype.Component;


/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.
 */
@Component
public class VowelCount {

    int getCount(String str) {
        return str.replaceAll("[^aeiou]","").length();
    }

}
