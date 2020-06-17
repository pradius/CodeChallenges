package com.codechallenges.CodeWars;

public class SumOffOddNumber {
    public static int rowSumOddNumbers(int n) {
        if (n == 1) return 1;
        int result = 0;
        int sum = 0;
        int element = 1;
        int count = 1;

        while(count != n){
            sum = 0;
            for(int i = 0; i <= count; i++){
                element = element + 2;
                sum += element;
            }
            count++;
            result = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1) + " Expected: 1");
        System.out.println(rowSumOddNumbers(2) + " Expected: 8");
        System.out.println(rowSumOddNumbers(42) + " Expected: 74088");
    }
}
