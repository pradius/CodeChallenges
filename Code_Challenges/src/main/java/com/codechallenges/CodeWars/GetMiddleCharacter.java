package com.codechallenges.CodeWars;


public class GetMiddleCharacter {
    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) return word.substring(word.length() / 2 - 1, word.length()/ 2 + 1);
        return Character.toString(word.charAt(word.length()/2));
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test") + " Expect: es");
        System.out.println(getMiddle("testing") + " Expect: t");
        System.out.println(getMiddle("middle") + " Expect: dd");
        System.out.println(getMiddle("A") + " Expect: A");
    }
}
