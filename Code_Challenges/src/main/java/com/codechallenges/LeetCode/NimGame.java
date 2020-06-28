package com.codechallenges.LeetCode;

public class NimGame {
    public static boolean canWinNim(int n) {
        if(n % 4 == 0 ) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Expected false: - Actual: " + canWinNim(4));
        System.out.println("Expected true: - Actual: " + canWinNim(2));
    }
}
