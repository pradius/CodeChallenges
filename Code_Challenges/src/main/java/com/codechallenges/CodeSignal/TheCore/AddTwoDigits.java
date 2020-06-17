package com.CodeSignal.TheCore;

public class AddTwoDigits {
    public static int addTwoDigits(int n) {
        String x = Integer.toString(n);
        return Character.getNumericValue(x.charAt(0)) + Character.getNumericValue(x.charAt(1)) ;
    }

    public static void main(String[] args) {
        System.out.println(addTwoDigits(29));
    }
}
