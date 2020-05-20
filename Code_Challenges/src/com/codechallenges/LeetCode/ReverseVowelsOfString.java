package com.codechallenges.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<Character>(){{
            add('a'); add('e'); add('i'); add('o'); add('u');
            add('A'); add('E'); add('I'); add('O'); add('U');
        }};
        char[] str = s.toCharArray();
        String result = "";
        int forward = 0;
        int backwards = s.length() - 1;
        char forwardVowel = 'Y';
        char backwardVowel = 'Y';

        while (forward < backwards){
            if(vowels.contains(str[forward])) forwardVowel = str[forward];
            else{
                if(forward < backwards) forward++;
            }
            if(vowels.contains(str[backwards])) backwardVowel = str[backwards];
            else {
                if(forward < backwards)backwards--;
            }

            if(vowels.contains(forwardVowel) && vowels.contains(backwardVowel)){
                str[backwards] = forwardVowel;
                str[forward] = backwardVowel;
                forwardVowel = 'Y';
                backwardVowel = 'Y';
                forward++;
                backwards--;
            }
        }
        for (char letter : str) result += letter;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aA"));
        System.out.println(reverseVowels("ai"));

    }
}
