package com.kata.code.kata;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class AlphabeticAnagrams {

    char[] words;
    public BigInteger listPosition(String word) {
       BigInteger counter = new BigInteger("1");
        int letterCount= word.length()-1;
        words = word.toCharArray();
        Arrays.sort(words);

        if(word.compareTo(String.valueOf(words))==0)
            return BigInteger.ONE;

        for(int x=0; x<=letterCount;++x) {
            char currentPos=word.charAt(x);

            char[] subWords = Arrays.copyOfRange(words,x,letterCount+1);

            for (int y=0; y<=subWords.length-1; ++y) {
                if(currentPos==subWords[y]) {
                    char temp=words[x];
                    words[x]=subWords[y];
                    words[y+x]=temp;
                    Arrays.sort(words,x+1,words.length);
                    break;
                }
                System.out.println(perm(letterCount-x,subWords));
                counter = counter.add(perm(letterCount-x,subWords));
                }
        }
        return counter;
    }


    public BigInteger perm(int top, char[] bottom){
        return recfact(top).divide(bottomSum(bottom));
    }
    public BigInteger bottomSum(char[] bottom){
        BigInteger result= new BigInteger("1");
        Map<Character,Integer> letters = new HashMap<>();

       for(int i = 0; i <= bottom.length-1; i++) {
           if (!letters.containsKey(bottom[i]))
               letters.put(bottom[i], 1);
           else
               letters.put(bottom[i], letters.get(bottom[i]) + 1);
       }
           for (Map.Entry<Character, Integer> entry : letters.entrySet())
           {
               result = result.multiply(recfact(entry.getValue().intValue()));
           }
        return result;
    }

    BigInteger recfact(int number) {

            BigInteger factorial = BigInteger.ONE;

            for (int i = number; i > 0; i--) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            return factorial;
        }
}
