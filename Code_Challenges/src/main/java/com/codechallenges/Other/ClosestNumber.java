package com.codechallenges.Other;

import java.util.*;

public class ClosestNumber {
    static int[] num = new int[]{-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};


    public static void main(String[] args) {

        int[] array = closestNumbers(num);

        for(int i = 0; i < array.length; i++){
            System.out.println("Result " + array[i]);
        }
    }

    static int[] closestNumbers(int[] arr) {

        int current = 0;
        int previous = 0;
        Map<Integer , Integer> pairs = new HashMap<>();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            if (arr[i] != arr[ arr.length - 1]){

                //current index value minus the second index value
                current = (Math.abs(arr[i + 1]) - Math.abs(arr[i]) );

                //if current result is less than previous, store the pair
                if (previous <= current){
                    pairs.put(arr[i], arr[i + 1]);

                }
                previous = current;
            }
            else{
                int count = 0;
                int[] newPairs = new int[pairs.size() * 2];
                for (Map.Entry<Integer, Integer> pair : pairs.entrySet()){

                    newPairs[count] = pair.getKey();
                    newPairs[count + 1] = pair.getValue();
                    count = count + 2;
                }
                return newPairs;

            }
        }

        return arr;
    }
}
