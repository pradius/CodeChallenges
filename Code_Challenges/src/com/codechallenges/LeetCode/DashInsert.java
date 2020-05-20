package com.codechallenges.LeetCode;

public class DashInsert {
    public static int DashInsertII(int num) {
        // code goes here
        StringBuilder nums = new StringBuilder(Integer.toString(num));

        for (int i = 1; i < nums.length(); i = i + 2){
            if (i%2 == 1) nums.insert(i, "*");
            if (i%2 == 0) nums.insert(i, "-");
        }
        String result = nums.toString();
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        System.out.println(DashInsertII(99946));
    }
}
