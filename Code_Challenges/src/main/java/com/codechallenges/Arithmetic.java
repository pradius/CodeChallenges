package com.codechallenges;

public class Arithmetic {
    public static int arithmetic(int a, int b, String operator) {
        switch (operator.toLowerCase()){
            case "add":
                return a + b;
            case "multiply":
                return a * b;
            case "divide":
                return a / b;
            case "subtract":
                return a - b;
            default: return a % b;
        }
    }
    public static void main(String[] args) {
        System.out.println(arithmetic(5, 2, "add"));
    }
}
