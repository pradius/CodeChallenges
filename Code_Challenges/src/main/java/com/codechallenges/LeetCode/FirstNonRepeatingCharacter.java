package com.codechallenges.LeetCode;


public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println("Test 1: " + getNonRepeatingChar("Bloomberg"));
    }

    private static char getNonRepeatingChar(String str) {
        char[] characters = str.toLowerCase().toCharArray();
        int current = 0;
        int next = 1;

        while (current + 1 < characters.length){
            if(characters[current] != characters[next]){
                if(next == characters.length - 1){
                    return characters[current];
                }
                next++;
            }
            else{
                current += 1;
                next = current + 1;
            }
        }
        return characters[current];
    }
}
