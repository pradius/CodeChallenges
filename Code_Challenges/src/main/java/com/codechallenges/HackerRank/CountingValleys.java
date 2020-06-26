package com.codechallenges.HackerRank;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        boolean isInValley = false;
        int countValleys = 0;

        int index = 0;
        int level = 0;
        while ( index < n){
            level += s.charAt(index++) == 'D' ? -1 : 1;

            if(level < 0){
                if(!isInValley){
                    isInValley = true;
                    countValleys++;
                }
            }
            if(level >= 0 ){
                isInValley = false;
            }
        }
        return countValleys;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
