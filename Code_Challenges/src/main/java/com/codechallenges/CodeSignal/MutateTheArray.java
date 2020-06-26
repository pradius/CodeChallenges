package com.codechallenges.CodeSignal;

public class MutateTheArray {

    static int[] mutateTheArray(int n, int[] a) {
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            int prev = i - 1 >= 0 ? a[i - 1] : 0;
            int next = i + 1 < n ? a[i + 1] : 0;
            b[i] = prev + a[i] + next;
        }
        return b;
    }


    public static void main(String[] args) {
        int[] arr = {4, 0, 1, -2, 3};
        int n = 5;
        for(int i : mutateTheArray(n, arr)){
            System.out.print(i + " ");
        }
    }
}
