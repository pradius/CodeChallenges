package com.codechallenges.LeetCode;


public class RemoveVowelsFromString {
    public static String removeVowels(String S) {
        String result = "";
        for (char letter : S.toCharArray()){
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') continue;
            result += letter;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("leetcodeisacommunityforcoders"));
        System.out.println(removeVowels("aeiou"));
    }
}
