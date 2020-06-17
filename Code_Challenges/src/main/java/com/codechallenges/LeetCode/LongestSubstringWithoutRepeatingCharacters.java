package com.codechallenges.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
//    public static int lengthOfLongestSubstring(String s) {
//        if(s.length() == 1) return 1;
//        if(s.length() < 1) return 0;
//        String longestStr = "";
//        String str = "";
//        for(int i = 0; i < s.length(); i++){
//            for(int k = i; k < s.length(); k++){
//                String current = s.substring(k,k + 1);
//                if(str.contains(current)){
//                   if(str.length() > longestStr.length()){
//                       longestStr = str;
//                   }
//                    str = "";
//                    break;
//                }else{
//                    str += current;
//                }
//            }
//        }
//        return longestStr.length();
//    }


    public static int lengthOfLongestSubstring(String s) {
       int maxCount = 0;
       int i = 0;
       int j = 0;
       Set<Character> visitedChar = new HashSet<>();

       while(i < s.length() && j < s.length()){

           if(!visitedChar.contains(s.charAt(j))){
               visitedChar.add(s.charAt(j));
               j++;
               maxCount = Math.max(maxCount, j-i);
           }
           else {
               visitedChar.remove(s.charAt(i));
               i++;
           }
       }
       return maxCount;
    }


    public static void main(String[] args) {

        //Test one
        System.out.println("Test 1 Expected: 3 \t Output: " + lengthOfLongestSubstring("abcabcbb"));

        //Test two
        System.out.println("Test 2 Expected: 1 \t Output: " + lengthOfLongestSubstring("bbbbb"));

        //Test three
        System.out.println("Test 3 Expected: 3 \t Output: " + lengthOfLongestSubstring("pwwkew"));

        //Test 4
        System.out.println("Test 4 Expected: 4 \t Output: " + lengthOfLongestSubstring("jbpnbwwd"));
    }
}
