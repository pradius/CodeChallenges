//HackerRank challenge Array DS
package com.codechallenges.HackerRank;

public class ArrayDS {

        // Complete the reverseArray function below.
        static int[] reverseArray(int[] a) {
            int[] result = new int[a.length];
            int index = 0;

            for(int i = a.length; i > 0; i--){
                result[index] = a[i - 1];
                index++;
            }
            return result;
         }

    public static void main(String[] args) {
        // Dummy Array
        int[] arr = {1, 23, 3, 5};

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(String.valueOf(res[i]));

            if (i != res.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
