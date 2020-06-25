package com.codechallenges.HackerRank;


import java.math.BigInteger;

public class FibonacciModified {

    public static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n){
        if(n == 3){
            return  (t2.multiply(t2)).add(t1);
        }
        return fibonacciModified(t2 , (t2.multiply(t2)).add(t1) , n - 1);
    }


    public static void main(String[] args) {
        BigInteger t1 = new BigInteger("0");

        BigInteger t2 = new BigInteger("1");

        int n = 10;
        System.out.println(fibonacciModified(t1, t2, n));

    }
}

// input number Ex.50 means: you need to return the first 50 fibonacci numbers.


//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155 165580141 267914296 433494437 701408733 1134903170 1836311903 2971215073 4807526976 7778742049 12586269025