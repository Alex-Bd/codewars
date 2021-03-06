package com.kata.code.kata;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class AlphabeticAnagrams {

    BigInteger listPosition(String word) {

        BigInteger counter = new BigInteger("1");
        int letterCount= word.length()-1;
        char[] words = word.toCharArray();
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
                counter = counter.add(perm(letterCount-x,subWords));
            }
        }
        return counter;
    }


    private BigInteger perm(int top, char[] bottom){
        return factorial(top).divide(bottomSum(bottom));
    }

    private BigInteger bottomSum(char[] bottom){
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
            result = result.multiply(factorial(entry.getValue()));
        }
        return result;
    }

    private BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
