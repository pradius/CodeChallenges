package com.codechallenges.HackerRank;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int numPairs = 0;
        for(int i = 0; i < ar.length; i++){
            for(int j = i + 1; j < ar.length; j++){
                numPairs += (ar[i] + ar[j]) % k == 0 ? 1 : 0;
            }
        }
        return numPairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int k = 5;
        int n = 6;
        System.out.println("Expected is 3 - Actual is : " + divisibleSumPairs(n, k, arr));

        int[] arr2 = {1, 3, 2, 6, 1, 2};
        int k2 = 3;
        int n2 = 6;
        System.out.println("Expected is 5 - Actual is : " + divisibleSumPairs(n2, k2, arr2));
    }
}
