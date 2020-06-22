package com.codechallenges.LeetCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class firstNotRepeatingCharacter {
    public static int firstUniqChar(String s) {
        if(s.isEmpty()) return -1;
        if(s.length() == 1) return 0;
        Set<Character> totalChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new LinkedHashSet<>();
        for(char letter : s.toCharArray()){
            if (totalChars.contains(letter)){
                repeatedChars.add(letter);
            }
            else{
                totalChars.add(letter);
            }
        }
        for (Character value : totalChars){
            if (!(repeatedChars.contains(value))) return s.indexOf(value);
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
    }
}
