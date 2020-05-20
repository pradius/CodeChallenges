package com.CodeSignal.TheCore;

public class Candies {
    public static int candies(int n, int m) {
        return m -(m%n);
    }

    public static void main(String[] args) {
        System.out.println(candies(3, 10));
    }
}
