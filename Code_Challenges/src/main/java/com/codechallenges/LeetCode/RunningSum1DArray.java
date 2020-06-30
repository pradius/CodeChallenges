package com.codechallenges.LeetCode;


import java.util.Arrays;

public class RunningSum1DArray {

    public static int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            sums[i] = nums[i] + sums[i - 1];
        }
        return sums;
    }

    public static void main(String[] args) {
        System.out.println("---------------Test 1---------------"); //1, 3, 6, 10
        Arrays.stream(runningSum(new int[]{1, 2, 3, 4})).forEach(System.out::println);
        System.out.println("---------------Test 2---------------"); //1, 2, 3, 4, 5
        Arrays.stream(runningSum(new int[]{1, 1, 1, 1, 1,})).forEach(System.out::println);
        System.out.println("---------------Test 3---------------"); // 3 , 4, 6, 16, 17
        Arrays.stream(runningSum(new int[]{3 , 1, 2, 10, 1})).forEach(System.out::println);
    }
}
