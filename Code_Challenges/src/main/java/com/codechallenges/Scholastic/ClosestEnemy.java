package com.codechallenges.Scholastic;

import java.util.Arrays;

public class ClosestEnemy {
    public static int ClosestEnemy(int[] arr) {
        // code goes here
        int hero = -1;
        int enemy = -1;
        for (int i = 0; i <arr.length; i++){
            if (arr[i] == 1 ) hero = i;
            if (arr[i] == 2) enemy = i;
            if (hero >= 0 && enemy >= 0) break;
        }
        if (hero == -1 || enemy == -1) return 0;
        int steps =Math.abs(hero - enemy);
        return steps;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 2, 2, 2};
        int[] arr1 = {2, 0, 0, 0, 2, 2, 1, 0};
        int[] arr2 = {0, 1, 0};
        System.out.println(ClosestEnemy(arr));
        System.out.println(ClosestEnemy(arr1));
        System.out.println(ClosestEnemy(arr2));
    }
}
