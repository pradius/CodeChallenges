package com.CodeSignal.InterviewPractice;

import java.util.HashSet;

public class FirstDuplicate {
    public static int firstDuplicate(int[] a) {
        HashSet<Integer> bucket = new HashSet<>();
        for (int item : a){
            if (bucket.contains(item)) return item;
            bucket.add(item);
        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] arr = {2, 4, 3, 5, 1};
        int[] arr = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(arr));
    }
}

