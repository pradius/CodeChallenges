package com.CodeSignal.InterviewPractice;

import java.util.*;

public class firstNotRepeatingCharacter {
    public static char firstNotRepeatingCharacter(String s) {
        List<Character> totalChars = new ArrayList<>();
        List<Character> repeatedChars = new ArrayList<>();
        for(char letter : s.toCharArray()){
            if (totalChars.contains(letter)){
                repeatedChars.add(letter);
            }
            else{
                totalChars.add(letter);
            }
        }
        System.out.println(repeatedChars);
        System.out.println("-------------");
        System.out.println(totalChars);


        for (Character value : totalChars){
            if (!(repeatedChars.contains(value))) return value;
        }

        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
    }
}
