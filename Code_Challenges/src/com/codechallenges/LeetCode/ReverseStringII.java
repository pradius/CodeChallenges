package com.codechallenges.LeetCode;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        if (s.length() < k) return new StringBuilder(s).reverse().toString();
        char[] str = s.toCharArray();
        s = "";
        boolean on = true;
        for (int i = 0; i < str.length - 1; i = i + k){
                if(on){
                    char temp = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = temp;
                }
           if(on) on = false;
           else on = true;
        }
        for (char letter : str) s += letter;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcdefg", 3));
    }
}
