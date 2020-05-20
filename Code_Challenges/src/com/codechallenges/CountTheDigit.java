package com.codechallenges;

public class CountTheDigit {

    public static int nbDig(int n, int d) {
        int count = 0;
        String value = "";
        for (int i = 0; i <= n; i++){
            value = Integer.toString(i*i);
            for (char c : value.toCharArray()) {
                if (d == Character.getNumericValue(c)) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(nbDig(5750, 0));
    }
}
