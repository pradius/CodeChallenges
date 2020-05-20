/*
package com.codechallenges.Scholastic;

import java.util.Arrays;
import java.util.HashMap;

public class LetterCount {
    public static String LetterCount(String str) {
        // code goes here
        String[] words = str.split(" ");
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<String, Integer> greaterWord = new HashMap<>();

        int counter = 0;
        int masterCounter = 0;
        char current = '%';
        for (String word : words) {
            Arrays.sort(word.toLowerCase().toCharArray());
            masterCounter = 0;
            counter = 0;
            for (char letter : word.toCharArray()) {
                if (current == letter){
                    map.put(letter, counter++ );
                }
                else {
                    map.put(letter, counter);
                    current = letter;
                }
                System.out.println(letter + " : " + counter );
                map.forEach(key, value -> map.get(key));
            }
            greaterWord.put(word, masterCounter);


        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(LetterCount("Hello apple pie"));
    }
}
*/
