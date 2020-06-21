package com.codechallenges.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if( numRows == 0) return pascal;
        pascal.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows == 1) return pascal;

        int listIndex = 0;
        while(numRows - 1 > 0){
            int current = 0;
            int next = 1;
             List<Integer> elements = new ArrayList<>();
             elements.add(1);

             while(next != pascal.get(listIndex).size()){
                 int num =  pascal.get(listIndex).get(current++) + pascal.get(listIndex).get(next++);
                 elements.add(num);
             }
             elements.add(1);
             pascal.add(elements);
             listIndex++;
             numRows--;
        }
        return pascal;
    }

    public static void main(String[] args) {

        //generate(5).forEach(System.out::println);

        generate(20).forEach(System.out::println);
    }
}
