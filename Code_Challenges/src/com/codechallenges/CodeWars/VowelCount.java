package com.codechallenges.CodeWars;

import java.util.HashSet;
import java.util.Set;

public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e');vowels.add('i'); vowels.add('o');vowels.add('u');

        for (char letter : str.toCharArray()){
            if (vowels.contains(letter)) vowelsCount++;
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
        System.out.println(getCount("Nope!"));
    }
}
