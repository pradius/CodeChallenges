package com.codechallenges.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty() || s1.length() > s2.length()) return false;
        if (s1.length() == 1) return s2.contains(s1);
        List<String> permutations = generatePermutation(s1);

        for (String permutation : permutations) {
            if (s2.contains(permutation))
                return true;
        }
        return false;
    }

    public static ArrayList<String> generatePermutation(String str) {
        if (str.length() == 0) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        char ch = str.charAt(0);
        String subStr = str.substring(1);
        ArrayList<String> prevResult = generatePermutation(subStr);
        ArrayList<String> Res = new ArrayList<>();

        for (String val : prevResult) {
            for (int i = 0; i <= val.length(); i++) {
                Res.add(val.substring(0, i) + ch + val.substring(i));
            }
        }
        return Res;
    }


    public static void main(String[] args) {
        System.out.println("Expected: True - Actual: " + checkInclusion("ab", "eidbaooo"));
        System.out.println("Expected: False - Actual: " + checkInclusion("ab", "eidboaoo"));
        System.out.println("Expected: True - Actual: " + checkInclusion("a", "ab"));
        System.out.println("Expected: True - Actual: " + checkInclusion("abc", "bbbca"));
    }
}
