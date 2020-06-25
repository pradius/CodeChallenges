package com.codechallenges.LeetCode;

import java.util.*;

public class UniqueOcurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        if(arr.length == 1) return true;

        Arrays.sort(arr);

        Map<Integer, Integer> repeatedValues = new HashMap<>(); //<Value, Occurrence>
        Set<Integer> ocurrenceBucket = new HashSet<>();

        for( int num : arr){
            if(repeatedValues.containsKey(num)){
                repeatedValues.replace(num, repeatedValues.get(num) + 1);
            }
            else{
                repeatedValues.put(num, 1);
            }
        }

        for(int value : repeatedValues.values()){
            if(ocurrenceBucket.contains(value)){
                return false;
            }
            ocurrenceBucket.add(value);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}) + " - Expected True");
        System.out.println(uniqueOccurrences(new int[]{1,2}) + " - Expected False");
    }
}
