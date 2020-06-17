package com.codechallenges.CodeWars;

public class Mumbling {
    public static String accum(String s) {
        String result = "";
        int repetitions = 0;
        for (char letter : s.toLowerCase().toCharArray()){
            result += Character.toUpperCase(letter);

            int count = repetitions;
            while(count > 0){
                result += letter;
                count--;
            }
            repetitions++;
            if (repetitions != s.length()) result += "-";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }
}
