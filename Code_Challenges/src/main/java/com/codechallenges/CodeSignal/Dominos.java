package com.CodeSignal;

import java.util.HashMap;


public class Dominos {
    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        for(int i =0; i < A.length; i++){
            if (A[i] == B[i]) return - 1;
        }
        /*Dominoes*/
        HashMap<Integer, Integer> bucketA = new HashMap<>();
        bucketA.put(1, 0);
        bucketA.put(2, 0);
        bucketA.put(3, 0);
        bucketA.put(4, 0);
        bucketA.put(5, 0);
        bucketA.put(6, 0);
        HashMap<Integer, Integer> bucketB = new HashMap<>();
        bucketB.put(1, 0);
        bucketB.put(2, 0);
        bucketB.put(3, 0);
        bucketB.put(4, 0);
        bucketB.put(5, 0);
        bucketB.put(6, 0);

        int turns = 0;
        int position = 1;
        /*Get most common number*/
        for (int i = 0; i < A.length; i++){
           int countA = bucketA.get(A[i]);
           countA++;
           bucketA.put(A[i], countA);


           int countB = bucketB.get(B[i]);
           countB++;
           bucketA.put(B[i], countB);

        }
        /*Check who has the most repeated numbers*/
        int greaterA = 0;
        int keyA = 0;
        for (int i = 1; i <= bucketA.size(); i++){
            if (bucketA.get(i) > greaterA){
                greaterA = bucketA.get(i);
                keyA = i;
            }
        }
        int greaterB = 0;
        int keyB = 0;
        for (int i = 1; i <= bucketB.size(); i++){
            if (bucketB.get(i) > greaterB){
                greaterB = bucketB.get(i);
                keyB = i;
            }
        }

        /*Compare both arrays*/
        if (greaterA > greaterB){
            for(int i = 0; i < A.length; i++){
                if(B[i] != bucketA.get(keyA)){
                    turns++;
                }
            }
        }
        else{
            for(int i = 0; i < A.length; i++){
                if(A[i] != bucketB.get(keyB)){
                    turns++;
                }
            }
        }
        return turns;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 6, 3, 2};
        int[] b = {2, 1, 2, 2, 2, 4};

        System.out.println(solution(a, b));
    }
}
