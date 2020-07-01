package com.codechallenges.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidPalindrome {

    /*public static boolean isPalindrome(String s) {
        List<Character> originalSentence = new ArrayList<>();

        for(char word :  s.toLowerCase().toCharArray()){
            if(Character.isAlphabetic(word) || Character.isDigit(word))
                originalSentence.add(word);
        }

        List<Character> copiedSentence = new ArrayList<>(originalSentence);
        Collections.reverse(copiedSentence);

        for(int i = 0; i < originalSentence.size(); i++){
            if(originalSentence.get(i) != copiedSentence.get(i))
                return false;
        }

        return true;
    }*/

    /*public static boolean isPalindrome(String s) {
        List<Character> originalSentence = new ArrayList<>();

        for(char word :  s.toLowerCase().toCharArray()){
            if(Character.isAlphabetic(word) || Character.isDigit(word))
                originalSentence.add(word);
        }

        int listIndex = originalSentence.size() - 1;

        for(char c : s.toLowerCase().toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                if(c == originalSentence.get(listIndex)){
                    listIndex--;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }*/

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int headIndex = 0;
        int tailIndex = str.length() - 1;


        while(headIndex < tailIndex){
            char head = str.charAt(headIndex);
            char tail = str.charAt(tailIndex);

            if(!Character.isLetterOrDigit(head)){
                headIndex++;
                continue;
            }
            if(!Character.isLetterOrDigit(tail)){
                tailIndex--;
                continue;
            }
            if (head != tail){
                return false;
            }
            tailIndex--;
            headIndex++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Expected True - Actual: " + isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println("Expected false - Actual: " + isPalindrome("race a car"));
    }
}
