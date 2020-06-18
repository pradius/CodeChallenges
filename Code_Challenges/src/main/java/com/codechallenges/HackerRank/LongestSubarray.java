package com.codechallenges.HackerRank;

import java.util.*;

public class LongestSubarray {

    public static int longestSubarray(List<Integer> arr){
        List<Integer> bucket = new ArrayList<>();
        if(arr.size() > 0){
            bucket.add(arr.get(0));
        }
        else{
            return 0;
        }
        int maxCount = 1;

        for(int i = 1; i < arr.size(); i++){
            if (bucket.contains(arr.get(i))){
                bucket.add(arr.get(i));
            }
            else{
                if(Math.abs(arr.get(i) - bucket.get(0)) == 1){
                    bucket.add(arr.get(i));
                }
                else{
                    bucket.clear();
                    bucket.add(arr.get(i));
                }
            }
            maxCount = Math.max(maxCount, bucket.size());
        }

        return maxCount;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(0, 1, 2, 1, 2, 3));
        boolean result = longestSubarray(arr) == 4;
        System.out.println(result);

        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 1, 1, 3, 3, 2, 2));
        boolean result2 = longestSubarray(arr2) == 4;
        System.out.println(result2);

        List<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 1, -1, 3, 3, -2, 2));
        boolean result3 = longestSubarray(arr2) == 4;
        System.out.println(result2);
    }
}
