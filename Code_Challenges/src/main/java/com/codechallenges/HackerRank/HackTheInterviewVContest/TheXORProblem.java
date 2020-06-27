package com.codechallenges.HackerRank.HackTheInterviewVContest;


public class TheXORProblem {

    public static String maxXorValue(String x, int k) {
        char[] bits = x.toCharArray();
        String y = "";

        for(int i = 0; i < x.length(); i++){
            if(k > 0) {
                if (bits[i] == '0') {
                    y += "1";
                }
                else{
                    y += "0";
                }
            }
            else{
                y += "0";
            }
            k--;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Expected 1000 - Actual: " + maxXorValue("0100", 1) + " - From input: 0100 , 1");
        System.out.println("Expected 01101 - Actual: " + maxXorValue("10010", 5)+ " - From input: 10010 , 5");
        System.out.println("Expected 10000 - Actual: " + maxXorValue("01010", 1)+ " - From input: 01010 , 1");
        System.out.println("Expected 101010000000 -  Actual: " + maxXorValue("010101010101", 5));
        System.out.println("Expected 1 - Actual: " + maxXorValue("0", 1) + " - From input: 0 , 1");
        System.out.println("Expected 0 - Actual: " + maxXorValue("1", 1) + " - From input: 1 , 1");
        System.out.println("Expected 00 - Actual: " + maxXorValue("10", 1) + " - From input: 10 , 1");
        System.out.println("Expected 10 - Actual: " + maxXorValue("00", 1) + " - From input: 00 , 1");
        System.out.println("Expected 11 - Actual: " + maxXorValue("00", 2) + " - From input: 00 , 2");
        System.out.println("Expected 00 - Actual: " + maxXorValue("11", 2) + " - From input: 11 , 2");
        System.out.println("Expected 0000 - Actual: " + maxXorValue("1111", 2) + " - From input: 11 , 2");
        System.out.println("Expected 1100 - Actual: " + maxXorValue("0011", 2) + " - From input: 11 , 2");
    }
}
