package com.codechallenges.LeetCode;

import java.util.Arrays;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] phrase1 = s.toCharArray();
        char[] phrase2 = t.toCharArray();
        Arrays.sort(phrase1);
        Arrays.sort(phrase2);

        for(int i = 0; i < phrase1.length; i++){
            if(phrase1[i] != phrase2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s, t);
        System.out.println("Test 1: " + result + " Expected - true");

        s = "rat";
        t = "car";
        result = isAnagram(s, t);
        System.out.println("Test 2: " + result + " Expected - false");
    }
}
