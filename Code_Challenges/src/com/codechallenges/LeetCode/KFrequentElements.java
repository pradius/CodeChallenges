package com.codechallenges.LeetCode;

import java.util.*;

public class KFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> list = new HashMap<>();

        Arrays.sort(nums);

        //Calculate frequency
        int current = nums[0];
        int counter = 0;
        list.put(nums[0], counter);
        for (int item : nums){
            if(current == item){
                counter++;
                list.put(item, list.get(item) + 1);
            }
            else {
                counter = 1;
                list.put(item, counter);
                current = item;
            }
        }

        //Determine most frequent
        while (k > 0){
            int value = 0;
            int key = 0;
            for (int item : list.keySet()){
                if (list.get(item) > value){
                    value = list.get(item);
                    key = item;
                }
            }
            result.add(key);
            list.remove(key);
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] myList = {1,2,3,3,3,3,3,3,3,4,3,4,-1,2,3,4,5,6,7,8,8,8,-1};
        System.out.println(topKFrequent(myList, 4));
    }
}
