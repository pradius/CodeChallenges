package com.codechallenges.CodeSignal.InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class myHashMap {

    long hashMap(String[] queryType, int[][] query) {
        Map<Integer, Integer> map = new HashMap<>();

        int queryIndex = 0;
        for(String q: queryType){

            if (q == "insert") {
                map.put(query[queryIndex][0], query[queryIndex][1]);
                queryIndex++;
            }
            if (q == "get"){
                return map.get(query[queryIndex][0]);
            }
            if(q == "addToValue"){
                for (int set : map.keySet()){
                    map.put(set, map.get(set) + query[queryIndex][0]);
                }
                queryIndex++;
            }
            if (q == "addToKey") {
                Map<Integer, Integer> temp = new HashMap<>();
                for(int set : map.keySet()){
                    temp.put(set + query[queryIndex][0], map.get(set));
                }
                map = temp;
            }

        }
        return map.get(query[queryIndex][0]);
    }
}
