package com.codechallenges.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    public static int[] twoSum(int[] nums, int target) {
//        int[] arr = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (i == j) {
//                    continue;
//                } else if (nums[i] + nums[j] == target) {
//                    arr[0] = i;
//                    arr[1] = j;
//                    return arr;
//                }
//            }
//        }
//        return arr;
//    }

        public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numVisited = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int delta = target - nums[i];
            if (numVisited.containsKey(delta)) {
                return new int[] { numVisited.get(delta), i};
            }
            numVisited.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        //Test one
        int[] result = twoSum(arr, target);
        System.out.println("Test One Expected:\t 0 : 1\t Output: " + result[0] + " : " + result[1]);

        //Test Two
        int[] arr2 = {0,4,3,0};
        target = 0;
        result = twoSum(arr2, target);
        System.out.println("Test Two Expected:\t 0 : 3\t Output: " + result[0] + " : " + result[1]);

        //Test Three
        int[] arr3 = {-3,4,3,90};
        target = 0;
        result = twoSum(arr3, target);
        System.out.println("Test Three Expected:\t 0 : 2\t Output: " + result[0] + " : " + result[1]);
    }
}
