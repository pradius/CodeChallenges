package com.CodeSignal.TheCore;

public class KnapsackLight {
    public static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        int importantItem = value1 > value2 ? value1 : value2;

        if (weight1 < maxW && weight2 < maxW && (weight1 + weight2) > maxW) return importantItem; //Can carry any box but not both
        if ((weight1 + weight2) <= maxW) return value1 +value2; // Can carry both boxes
        if (weight1 <= maxW){
            if (importantItem == value1) return value1;
            if (weight2 <= maxW) return value2;
            return value1;
        }
        return 0;

    }


    public static void main(String[] args) {
        System.out.println(knapsackLight(10, 5, 6, 4, 8));
        System.out.println(knapsackLight(10, 5, 6, 4, 9));
        System.out.println(knapsackLight(5, 3, 7, 4, 6));
        System.out.println(knapsackLight(10, 2, 11, 4, 1));
        System.out.println(knapsackLight(2, 5, 3, 4, 5));
    }
}
