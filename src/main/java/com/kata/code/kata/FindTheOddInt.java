package com.kata.code.kata;
/*
Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
 */

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class FindTheOddInt {


    public int findIt(int[] a) {

        Arrays.sort(a);
        int y=a[0];
        int count=0;
        for(int x : a){
           if(x==y)
               ++count;
           if(x!=y && count%2==1)
               break;
           if(x!=y) {
               count = 1;
               y=x;
           }
           }
        return y;
    }
}
