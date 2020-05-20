package com.CodeSignal.Intro;

public class Palindrome {
    public static void main(String[] args) {
        String input = "hlbeeykoqqqqokyeeblh";
        //String input = "aabaa";

        boolean check = checkPalindrome(input);
        System.out.println(check);
    }

    public static boolean checkPalindrome(String inputString){
        int length = inputString.length();
        boolean isEven = length%2 == 0 ? true : false;
        if (inputString.charAt(0) != inputString.charAt(length -1)) return false;
        String part1 = isEven ? inputString.substring(0 , length/2) : inputString.substring(0 , length/2 + 1);
        String part2 = inputString.substring(length/2, length);
        String part3 = "";

        for(int i = part2.length() - 1 ; i >= 0; i--){
            part3 += part2.charAt(i);
        }
        if (!(part1.equals(part3))) return false;
        return true;
    }
}
