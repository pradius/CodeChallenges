package com.codechallenges.CodeWars;

public class GrowthPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p){
            p0 += (int)(p0 * percent/100 + aug);
            //System.out.println(p0);
            years++;
        }
        return years;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1000, 2, 50, 1200));
        System.out.println(nbYear(1500, 5, 100, 5000));
        System.out.println(nbYear(1500000, 2.5, 10000, 2000000));
    }
}
