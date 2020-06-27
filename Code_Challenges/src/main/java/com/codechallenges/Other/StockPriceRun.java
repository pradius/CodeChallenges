package com.codechallenges.Other;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StockPriceRun {


    public static int stock_runs(int[] prices) {
        int longest = 0;
        Set<Integer> streaks = new TreeSet<>();

        boolean isUp = false;
        boolean isDown = false;
        int trend = prices[0];
        for (int price : prices) {
            if (price > trend) {
                if (isUp) {
                    longest++;
                }
                longest++;
                isDown = false;
                isUp = true;
                trend = price;
            } else if (price < trend) {
                if (isDown) {
                    longest++;
                }
                isDown = true;
                isUp = false;
                trend = price;
            }
            streaks.add(longest);
        }
        List<Integer> output = new LinkedList<>(streaks);
        return output.get(output.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,1};
        System.out.println(stock_runs(arr));
    }
}
