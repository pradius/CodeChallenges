package com.codechallenges.LeetCode.BloombergChallenges;

public class MinCostClimbingStair {

    public static int minCostClimbingStairs(int[] cost) {
        if(cost.length == 1){
            return cost[0];
        }
        if(cost.length == 2){
            return cost[0] > cost[1] ? cost[0] : cost[1];
        }
        int costPaid = 0;
        int currentIndex = 0;
        int step1 = 0;
        int step2 = 1;

        while(step2 < cost.length){
            if(cost[step1] >= cost[step2 ]){
                costPaid += cost[step2];
                currentIndex = step2;
                step1 = currentIndex + 1;
                step2 = step1 + 1;
            }else{
                costPaid += cost[step1];
                currentIndex = step1;
                step1 = currentIndex + 1;
                step2 = step1 + 1;
            }
        }
        return costPaid;
    }

    public static void main(String[] args) {
        System.out.println("Expected: 15 - Actual: " + minCostClimbingStairs(new int[] {10, 15, 20}));
        System.out.println("Expected: 6 - Actual: " + minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        System.out.println("Expected: 1 - Actual: " + minCostClimbingStairs(new int[] {0,0,2,1}));
        System.out.println("Expected: 1 - Actual: " + minCostClimbingStairs(new int[] {0,1,1,1}));
    }
}
