package com.codechallenges.LeetCode;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
       char[] xBit =  String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0").toCharArray();
       char[] yBit =  String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0").toCharArray();
       int distance = 0;
       for(int i = 0; i < xBit.length; i++){
           if(xBit[i] != yBit[i]){
               distance++;
           }
       }
       return distance;
    }


    public static void main(String[] args) {
        System.out.println("Expected 2 - Actual: " + hammingDistance(1, 4));
    }

}

//    The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//
//    Given two integers x and y, calculate the Hamming distance.