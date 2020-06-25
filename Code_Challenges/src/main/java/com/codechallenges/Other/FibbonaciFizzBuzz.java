package com.codechallenges.Other;

import java.util.ArrayList;
import java.util.List;

public class FibbonaciFizzBuzz {

    public static List<Long> fib(int num){ // 4
        List<Long> fibNumbers = new ArrayList<>();
        fibNumbers.add(1L); // 0
        if(num == 1){
           return fibNumbers;
        }
        fibNumbers.add(1L); // 1
        if(num == 2){
            return fibNumbers;
        }

        for(int i = 1; i < num - 1; i++){ // 3
            long previous = fibNumbers.get(i); // 3
            long current = fibNumbers.get(i - 1);; // 2
            fibNumbers.add(previous + current);
        }
        return fibNumbers;
    }

    public static List<String> printFizzBuzz(List<Long> list){
        List<String> output = new ArrayList<>();
        for(Long num : list){
            String word = "";
            if(num % 3 == 0){
                word = "Fizz";
            }
            if(num % 5 == 0){
                word += "Buzz";
            }
            if (word.equals("")) {
                word = Long.toString(num);
            }
            output.add(word);
        }
        return output;
    }

    public static void main(String[] args) {
	    List<Long> output = fib(50);
        List<String> fizzNumbers = printFizzBuzz(output);
        fizzNumbers.forEach(System.out::println);

    }
}

// input number Ex.50 means: you need to return the first 50 fibonacci numbers.


//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155 165580141 267914296 433494437 701408733 1134903170 1836311903 2971215073 4807526976 7778742049 12586269025