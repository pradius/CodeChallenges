package com.codechallenges.CodeSignal.InterviewPractice;

import java.util.*;

public class firstNotRepeatingCharacter {
    public static char firstNotRepeatingCharacter(String s) {
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
            if (!(repeatedChars.contains(value))) return value;
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
    }
}
