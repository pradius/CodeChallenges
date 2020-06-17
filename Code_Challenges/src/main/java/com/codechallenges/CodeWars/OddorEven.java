package com.codechallenges.CodeWars;


import static java.util.Arrays.stream;

public class OddorEven {
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) sum += array[i];
        return (sum%2 == 0)? "even":"odd";
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 34, 6};
        System.out.println(oddOrEven(arr));
    }
}

/*
    public static String oddOrEven (int[] array) {
        return stream(array).sum() % 2 == 0 ? "even":"odd";
    }*/
