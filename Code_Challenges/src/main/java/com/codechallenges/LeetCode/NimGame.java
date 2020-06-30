package com.codechallenges.LeetCode;

public class NimGame {
    public static boolean canWinNim(int n) {
        int number  = 4521;

        for(int i = 0; i < 4 ; i++){
            System.out.println(number % 10);
            number = number / 10;
        }

        if(n % 4 == 0 ) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Expected false: - Actual: " + canWinNim(4));
        //System.out.println("Expected true: - Actual: " + canWinNim(2));
    }
}
