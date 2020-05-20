package com.codechallenges.LeetCode;

import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        if (Arrays.equals(S, T)) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); //true
        System.out.println(isAnagram("rat", "car")); //false
        System.out.println(isAnagram("", "")); // true
        System.out.println(isAnagram("a", "a")); //true
        System.out.println(isAnagram("a", "b")); //false
        System.out.println(isAnagram("ab", "ba")); //true
    }
}
