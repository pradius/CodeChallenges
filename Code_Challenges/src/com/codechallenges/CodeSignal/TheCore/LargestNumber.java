package com.CodeSignal.TheCore;

public class LargestNumber {

    public static int largestNumber(int n) {
        String value = "";
        for(int i = 1; i <= n; i++) {
            value += "9";
        }
        return Integer.parseInt(value);
    }

    public static void main(String[] args) {
        System.out.println(largestNumber(9));
    }
}
