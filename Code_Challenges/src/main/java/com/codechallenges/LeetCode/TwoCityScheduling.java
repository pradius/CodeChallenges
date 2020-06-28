package com.codechallenges.LeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));
        int cost = 0;

        for(int i = 0;  i < costs.length; i++){
            if(i < costs.length / 2){
                cost += costs[i][0];
            }
            else{
                cost += costs[i][1];
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int[][] costs = {{10, 20} , {30,200}, {400, 50}, {30, 20}};
        System.out.println("Expected: 110 - Actual: " + twoCitySchedCost(costs));

        int[][] costs1 = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}} ;
        System.out.println("Expected: 1859 - Actual: " + twoCitySchedCost(costs1));
    }
}
