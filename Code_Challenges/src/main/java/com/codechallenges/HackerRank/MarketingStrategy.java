package com.codechallenges.HackerRank;


public class MarketingStrategy {

    public static int minimumSwaps(String status) {
        if(status.length() <= 1) return 0;
        if(status.length() == 2){
            if(status.contains("R") && status.contains("S")){
                return 0;
            }
            return 1;
        }
        char[] arr = status.toCharArray();
        int swaps = 0;

        for(int i = 1; i < arr.length; i = i + 2){
            if(arr[i] == arr[i-1] && (i + 1 < arr.length && arr[i] == arr[i+1])){
                swaps++;
                arr[i] = arr[i] == 'R' ? 'S' : 'R';
            }
            else if(arr[i] == arr[i-1]){
                swaps++;
                arr[i-1] = arr[i-1] == 'R' ? 'S' : 'R';
            }
            else if( i + 1 < arr.length && arr[i] == arr[i+1]){
                swaps++;
                arr[i+1] = arr[i+1] == 'R' ? 'S' : 'R';
            }
        }
        return swaps;
    }



    public static void main(String[] args) {
        System.out.println("Expected 1 - Actual: " + minimumSwaps("SSSRSR"));

        System.out.println("Expected 2 - Actual: " + minimumSwaps("RSRSSR"));

        System.out.println("Expected 2 - Actual: " + minimumSwaps("SSRRRSR"));

        System.out.println("Expected 0 - Actual: " + minimumSwaps("SR"));

        System.out.println("Expected 1 - Actual: " + minimumSwaps("SS"));
    }
}
