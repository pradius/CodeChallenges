package com.codechallenges.LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length < 1) return;
        int index2 = 0;

        for (int i = m; i < nums1.length; i++){
            nums1[i] = nums2[index2++];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {

        //Test 1
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println("Test 1: Expected [1,2,2,3,5,6]");
        merge(nums1, m,  nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
