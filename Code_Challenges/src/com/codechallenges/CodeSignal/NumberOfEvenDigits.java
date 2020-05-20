package com.CodeSignal;

public class NumberOfEvenDigits {
    public static int numberOfEvenDigits(int n) {

        String num = Integer.toString(n);
        int count = 0;

        for (char c : num.toCharArray()){
            if (Character.getNumericValue(c)%2 ==0) count++;
        }

      return count;
    }

    public static void main(String[] args) {
        System.out.println(numberOfEvenDigits(1010));
    }
}
