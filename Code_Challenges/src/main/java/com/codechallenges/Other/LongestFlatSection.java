package com.codechallenges.Other;

import java.util.HashMap;
import java.util.Map;

public class LongestFlatSection {

    public static int longestFlat(int[] array){
        int longest = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int value : map.values()){
            if(value > longest){
                longest = value;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2};
        System.out.println("Expected 4 : " + longestFlat(arr));
    }
}
