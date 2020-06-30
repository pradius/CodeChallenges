package com.codechallenges.LeetCode;

import java.math.BigInteger;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        String tempDigits = "";
        for(int num : digits){
            tempDigits += num;
        }
        BigInteger numericDigits = new BigInteger(tempDigits);
        BigInteger sum;
        sum = numericDigits.add(new BigInteger("1"));
        tempDigits = String.valueOf(sum);

        int[] newDigits = new int[tempDigits.length()];
        for(int i = 0; i < tempDigits.length(); i++){
            newDigits[i] = Integer.valueOf(tempDigits.substring(i, i+1));
        }
        return newDigits;
    }
        /** Best Solution on LeetCode **/
//    public int[] plusOne(int[] digits) {
//
//        int len = digits.length-1;
//
//        while(len>=0){
//            if(digits[len] == 9){
//                digits[len] = 0;
//            }
//            else{
//                digits[len] = digits[len] + 1;
//                break;
//            }
//            len--;
//        }
//        if(digits[0] == 0){
//            int[] result = new int[digits.length + 1];
//            result[0] = 1;
//            return result;
//        }
//        return digits;
//    }

    public static void main(String[] args) {
        System.out.println("---------------Test 1 ----------------");
        for(int num : plusOne(new int[]{9})){
            System.out.print(num + " ");

        }
        System.out.println();

        System.out.println("---------------Test 2 ----------------");
        for(int num : plusOne(new int[]{1, 2, 3})){
            System.out.print(num + " ");

        }
        System.out.println();

        System.out.println("---------------Test 3 ----------------");
        for(int num : plusOne(new int[]{9, 9})){
            System.out.print(num + " ");

        }
        System.out.println();

        System.out.println("---------------Test 4 ----------------");
        for(int num : plusOne(new int[]{4, 3, 2, 1})){
            System.out.print(num + " ");

        }

    }

}
