package com.codechallenges.Other;

public class DeletionDistance {

    public static int deletionDistance(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        // if one of the strings is empty
        if (n * m == 0)
            return n + m;

        // array to store the convertion history
        int [][] d = new int[n + 1][m + 1];

        // init boundaries
        for (int i = 0; i < n + 1; i++) {
            d[i][0] = i;
        }
        for (int j = 0; j < m + 1; j++) {
            d[0][j] = j;
        }

        // DP compute
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int left = d[i - 1][j] + 1;
                int down = d[i][j - 1] + 1;
                int left_down = d[i - 1][j - 1];
                if (str1.charAt(i - 1) != str2.charAt(j - 1))
                    left_down += 1;
                d[i][j] = Math.min(left, Math.min(down, left_down));

            }
        }
        return d[n][m];
    }

    public static void main(String[] args) {
        System.out.println(deletionDistance("boat", "got"));
        System.out.println(deletionDistance("thought", "sloughs"));
        System.out.println(deletionDistance("at", "cat"));
    }
}
