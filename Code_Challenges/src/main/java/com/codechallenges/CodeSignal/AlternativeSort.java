package com.codechallenges.CodeSignal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AlternativeSort {

    static boolean alternatingSort(int[] a) {
        int[] b = new int[a.length];
        b[0] = a[0];
        int bIndex = 1;
        int startIndex = 1;
        int lastIndex = a.length - 1;
        boolean flip = false;

        while(bIndex < a.length){

            if(flip){
                b[bIndex] = a[startIndex++];
                flip = false;
            }
            else {
                b[bIndex] = a[lastIndex--];
                flip = true;
            }
            bIndex++;
        }
        for(int num : b){
            System.out.print(num + " ");
        }
        System.out.println();
        return checkSort(b);
    }

    static boolean checkSort(int[] b){
        for(int i = 1, prev = b[0]; i < b.length; i++){
            if(b[i] < prev){
                return false;
            }
            prev = b[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 4, 2};
        System.out.println("Expected True - Actual: "+ alternatingSort(arr));

        int[] arr2 = {-92, -23, 0, 45, 89, 96, 99, 95, 89, 41, -17, -48};
        System.out.println("Expected True - Actual: "+ alternatingSort(arr2));

        int[] arr3 = {-99, -29, -7, 17, 28, 71, 98, 86, 42, 22, 0, -29, -86};
        System.out.println("Expected False - Actual: "+ alternatingSort(arr3));
    }
}
