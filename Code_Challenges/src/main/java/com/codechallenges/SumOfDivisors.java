package com.codechallenges;

public class SumOfDivisors {

    public static int sumOfDivisors(int n) {
        if (n < 2) return n;
        int sum = n + 1;
        for (int i = (n/2); i > 1; i--)
            if  (n % i == 0) sum += i;
        return sum;
    }
    public static void main(String[] args) {

        System.out.println(sumOfDivisors(997));
    }
}

/*
if (value > 0)
        {
        for (int i = value + 1; i < 0; i++) sum += (n % i == 0) ? i : 0;
        } */
