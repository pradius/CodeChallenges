package com.CodeSignal.TheCore;

public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
        int result = 0;
        int half = n/2;

        while (half >= 0){
            result = firstNumber;
            half--;
            if (firstNumber + 1 == n){
                firstNumber = 0;
                continue;
            }
            firstNumber++;
        }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(circleOfNumbers(10, 2));
    }
}
