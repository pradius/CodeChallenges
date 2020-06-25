package com.codechallenges.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PermutationString {
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.isEmpty() || s2.isEmpty() || s1.length() > s2.length()) return false;
        if(s1.length() == 1) return s2.contains(s1);
        List<String> permutations = generatePermutation(s1);

        for(String permutation : permutations){
            if(s2.contains(permutation))
                return true;
        }
        return false;
    }

    public static List<String> generatePermutation(String s) {
        List<String> permutations = new ArrayList<>();
        String permutation = "";

        for (int i = 0; i < s.length(); i++) {
            permutation = s.substring(i, i + 1);
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    continue;
                }
                permutation += s.substring(j, j + 1);
            }
            permutations.add(permutation);
            permutation = "";
        }

        return permutations;
    }
    public static void main(String[] args) {
        //System.out.println("Expected: True - Actual: " + checkInclusion("ab", "eidbaooo"));
        //System.out.println("Expected: False - Actual: " + checkInclusion("ab", "eidboaoo"));
        //System.out.println("Expected: True - Actual: " + checkInclusion("a", "ab"));
        System.out.println("Expected: True - Actual: " + checkInclusion("abc", "bbbca"));
    }
}
