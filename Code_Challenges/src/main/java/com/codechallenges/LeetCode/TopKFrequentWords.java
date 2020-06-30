package com.codechallenges.LeetCode;

import java.util.*;

public class TopKFrequentWords {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        List<String> output = new ArrayList<>();

        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1 );
        }
        List<Map.Entry<String, Integer> > list = new LinkedList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));


        for(int i = 0; i < k ; i++){
            for(int j = i; j < list.size(); j++ ){
                if(list.get(j).getValue() > list.get(i).getValue()){
                    Map.Entry temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, temp);
                }
                else if(list.get(j).getValue() == list.get(i).getValue()){
                    if(list.get(j).getKey().compareTo(list.get(i).getKey()) < 0){
                        Map.Entry temp = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j, temp);
                    }
                }
            }
            output.add(list.get(i).getKey());
        }

        return output;
    }


    public static void main(String[] args) {
        topKFrequent(new String[]{ "i", "love", "leetcode", "i", "love", "coding" }, 2 ).forEach(System.out::println);
        System.out.println("-----------------------");
        topKFrequent(new String[]{ "i", "love", "leetcode", "i", "love", "coding" }, 3 ).forEach(System.out::println);
        System.out.println("-----------------------");
        topKFrequent(new String[]{ "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" }, 4 ).forEach(System.out::println);
    }
}
