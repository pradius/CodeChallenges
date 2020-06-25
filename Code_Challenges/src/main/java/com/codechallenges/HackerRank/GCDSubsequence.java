package com.codechallenges.HackerRank;

import java.util.*;

public class GCDSubsequence {

    public static List<Integer> findSubsequence(List<Integer> numbers, int k) {
        if(numbers.size() <= k) return numbers;
        List<Integer> subsequence = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == 0 || numbers.get(i) == 1){continue;}
            List<Integer> sub = new ArrayList<>();
            for(int j = i; j < numbers.size(); j++){
                if(numbers.get(j) % numbers.get(i) == 0){
                    sub.add(numbers.get(j));
                }
            }
            if(sub.size() > subsequence.size()){
                subsequence = sub;
            }
        }
        return subsequence;
    }

    public static void main(String[] args) {
        List<Integer> seq = Arrays.asList(5, 4, 15, 20, 1); // Expected [5,15,20]
        int k = 3;
        System.out.println("Expected: [5,15,20]");
        findSubsequence(seq, k).forEach(System.out::println);

        seq = Arrays.asList(1, 2, 8, 5, 6); // Expected [5,15,20]
        k = 2;
        System.out.println("Expected: [2,8,6]");
        findSubsequence(seq, k).forEach(System.out::println);
    }
}
