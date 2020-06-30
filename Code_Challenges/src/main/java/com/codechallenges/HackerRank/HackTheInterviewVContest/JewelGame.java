package com.codechallenges.HackerRank.HackTheInterviewVContest;



public class JewelGame {

    public static int getMaxScore(String str) {
        StringBuilder jewels = new StringBuilder(str);
        int points = 0, current = 0, next = 1;

        while (next < jewels.length()) {
            if (jewels.charAt(current) == jewels.charAt(next)) {
                jewels.deleteCharAt(next);
                jewels.deleteCharAt(current);
                current = 0;
                next = 1;
                points++;
            }else{
                current++;
                next++;
            }
        }
        return points;
    }


//     public static int getMaxScore(String jewels) {
//        if (jewels.length() == 1) return 0;
//        int points = 0, current = 0, next = 1;
//
//        while (next < jewels.length()) {
//            if (jewels.charAt(current) == jewels.charAt(next)) {
//                points++;
//                break;
//            }
//            current++;
//            next++;
//        }
//
//        if(next == jewels.length()) return points;
//
//        points += getMaxScore(jewels.substring(0, current) + jewels.substring(next + 1));
//        return points;
//    }

    public static void main(String[] args) {
        System.out.println("Expected: 2 - Actual: " + getMaxScore("abccbda"));
        System.out.println("Expected: 0 - Actual: " + getMaxScore("abcd"));
        System.out.println("Expected: 3 - Actual: " + getMaxScore("abcddcbd"));
    }
}
