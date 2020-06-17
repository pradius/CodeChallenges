package com.CodeSignal.InterviewPractice;

import java.util.Arrays;


public class RotateImage {


    /*public static int[][] rotateImage(int[][] a) {

    }*/

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int count = 1;
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = count++;
            }
        }
        for (int[] row :  arr){
            System.out.println(Arrays.toString(row));
        }

        System.out.println("----------------------------");
        /*rotateImage(arr);
        for (int[] row: arr){
            System.out.println(Arrays.toString(row));
        }*/
    }
}
