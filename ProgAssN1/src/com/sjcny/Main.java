package com.sjcny;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    /*
     Set the size of the array
     Small:   100
     Mid:     1000
     Large:   10000
     */
    public static int size = 100000;

    public static void main(String[] args) {
        //Time measure
        long startTime = 0;
        long endTime = 0;
        long timeElapsed = 0;
        // Set a Random number generator
        Random rand = new Random();
        //create the array
        double[] arr = new double[size];

        for (int i = 0; i < size; i++){
            arr[i] = i + rand.nextInt(size);
        }
        // Value to manipulate
        double value = arr[arr.length/2];

        //Time of execution for each operation
        long fetchTime = 0;
        long deleteTime = 0;
        long insertTime = 0;
        long updateTime = 0;

        //repeat a number of times and get average
        int repetitions = 1000;
        int calAverage = 1000;
        while(repetitions > 0) {
            //TODO: FETCH ALGORITHM
            startTime = System.nanoTime();
            //Operation-----------------------------------------------
            for (double item : arr) {
                if (item == value) break;
            }
            //--------------------------------------------------------
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            fetchTime = fetchTime + timeElapsed;
            //System.out.print("FETCH Time: " + timeElapsed + " : ");

            //TODO: DELETE ALGORITHM
            startTime = System.nanoTime();
            //Operation-----------------------------------------------
            //New array to copy the old one
            double[] anotherArray = new double[arr.length - 1];
            int k = 0;
            // Copy the elements except the index from original array to the other array
            for (double item : arr) {
                // if the index is the removal element index
                if (item == value) continue;
                anotherArray[k++] = item;
            }
            //--------------------------------------------------------
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            deleteTime = deleteTime + timeElapsed;
            //System.out.print("DELETE Time: " + timeElapsed + " : ");

            //TODO: INSERT ALGORITHM
            startTime = System.nanoTime();
            //Operation-----------------------------------------------
            Array.set(arr, (arr.length / 2), value);
            //--------------------------------------------------------
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            insertTime = insertTime + timeElapsed;
            //System.out.print("INSERT Time: " + timeElapsed + " : ");

            //TODO: UPDATE ALGORITHM
            startTime = System.nanoTime();
            //Operation-----------------------------------------------
            int count = 0;
            for (double item : arr) {
                if (count == arr.length / 2) item = 3;
                count++;
            }
            //--------------------------------------------------------
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            updateTime = updateTime + timeElapsed;
            //System.out.println("UPDATE Time: " + timeElapsed );

            //Part of the while loop
            repetitions--;
        }
        System.out.println("-------------------------------");
        System.out.println("Array size: " + size + "\n");
        System.out.println("Average FETCH Time is: " + fetchTime/calAverage);
        System.out.println("Average DELETE Time is: " + deleteTime/calAverage);
        System.out.println("Average INSERT Time is: " + insertTime/calAverage);
        System.out.println("Average UPDATE Time is: " + updateTime/calAverage);
        System.out.println("-------------------------------");
    }
}

