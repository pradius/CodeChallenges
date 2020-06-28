package com.codechallenges.HackerRank.HackTheInterviewVContest;

import java.util.LinkedList;

public class JewelGame {

    public static int getMaxScore(String jewels) {
        int points = 0;

        LinkedList<Character> pieces = new LinkedList<>();
        for(char c : jewels.toCharArray()){
            pieces.add(c);
        }

        int current = 0;
        int next = 1;

        while (next < pieces.size()) {

            if (pieces.get(current) == pieces.get(next)) {
                pieces.remove(next);
                pieces.remove(current);
                current = 0;
                next = 1;
                points++;
            }
            current++;
            next++;
        }

        return points;
    }

    public static void main(String[] args) {
        System.out.println("Expected: 2 - Actual: " + getMaxScore("abccbda"));
        System.out.println("Expected: 3 - Actual: " + getMaxScore("abcddcbd"));
    }
}
