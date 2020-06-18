package com.codechallenges.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FulfillingOrders {

    public static int filledOrders(List<Integer> order, int k) {
        Collections.sort(order);
        int fulfullied = 0;

        for(int i = 0; i < order.size(); i++){
            if(k == 0){
                break;
            }
            if(order.get(i) > k){
                break;
            }
            if(order.get(i) <= k){
                fulfullied++;
                k = k - order.get(i);
            }
        }
        return fulfullied;
    }


    public static void main(String[] args) {
        List<Integer> orders =  new ArrayList<>(Arrays.asList(10,30));
        int widgets = 40;
        boolean result = filledOrders(orders, widgets) == 2;
        System.out.println(result);

        List<Integer> orders2 =  new ArrayList<>(Arrays.asList(5,4,6));
        int widgets2 = 3;
        boolean result2 = filledOrders(orders2, widgets2) == 0;
        System.out.println(result2);

        List<Integer> orders3 =  new ArrayList<>(Arrays.asList(3,5,4,6, 10, 11));
        int widgets3 = 3;
        boolean result3 = filledOrders(orders3, widgets3) == 1;
        System.out.println(result3);
    }
}
