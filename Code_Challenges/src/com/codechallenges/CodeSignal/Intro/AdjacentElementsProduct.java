package com.CodeSignal.Intro;

public class AdjacentElementsProduct {
    public static void main(String[] args) {
        //int[] inputArray ={-23, 4, -3, 8, -12};
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        int result = inputArray[0] * inputArray[1];
        for(int i = 1; i < inputArray.length - 1; i++){
            int product = inputArray[i] * inputArray[i + 1];
            result = product > result ? product : result;
        }

        System.out.println(result);
    }
}
