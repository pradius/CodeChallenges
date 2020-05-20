package com.codechallenges;

public class isLuckyNumber {
    static boolean isLuckyNumber(int n) {
        String num = Integer.toString(n/10);
        if (num.contains("4") || num.contains("7")) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLuckyNumber(75));
    }
}
