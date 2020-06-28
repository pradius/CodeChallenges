package com.codechallenges.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class IntegerPermutations {

    public static List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<List<Integer>>();
        }

        int first = nums[0];
        int[] nums2 = new int[nums.length -1];
        for(int i = nums.length -1; i < 0; i--){
            nums2[i] = nums[i];
        }
        List<List<Integer>> prevResults = permute(nums2);

        List<List<Integer>> output = new ArrayList<>();

        for (List<Integer> list : prevResults){
            List<Integer> preList = new ArrayList<>();
            for(int i = 0; i < list.size(); i++){
                preList.add(list.get(0));
                preList.add(first);
                preList.add(list.get(i));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }
}
