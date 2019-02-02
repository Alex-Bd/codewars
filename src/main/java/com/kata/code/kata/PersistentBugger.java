package com.kata.code.kata;

/* Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
   which is the number of times you must multiply the digits in num until you reach a single digit.
*/
import org.springframework.stereotype.Component;

@Component
public class PersistentBugger {


    public int persistence(long n) {

       int count=0;
       int y = 1;
       String p = Long.toString(n);
       for(;;) {
           if (Integer.parseInt(p) / 10 == 0)
               break;
           for(int x=0;x<p.length();++x) {
               y=y*Character.getNumericValue(p.charAt(x));
            }
            ++count;
            p=Integer.toString(y);
            y=1;
        }
        return count;
    }

}
