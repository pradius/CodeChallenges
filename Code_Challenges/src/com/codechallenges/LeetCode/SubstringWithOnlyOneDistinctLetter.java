package com.codechallenges.LeetCode;

public class SubstringWithOnlyOneDistinctLetter {
    public static int countLetters(String S){
        char[] arr = S.toCharArray();
        int result = 0;

        for(int start = 0; start < arr.length; start++){
            int end = start;
            while(arr[end]== arr[start])
            {   end++;
                result++;
                if (end == arr.length) break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countLetters("aaaba"));
    }
}
