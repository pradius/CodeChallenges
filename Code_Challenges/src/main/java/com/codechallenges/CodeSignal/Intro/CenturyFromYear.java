package com.CodeSignal.Intro;

public class CenturyFromYear {

    public static int centuryFromYear(int year){
        //Create a list of Century years to compare
        int[] decades = new int[22];
        int decade = 0;
        int count = 0;
        for (int i = 0; i < decades.length; i++) {
            count += 1;
            decades[i] = count;
            count += 99;
        }
        for (int i = 0; i < decades.length; i++){
            if (year >= decades[i] && year < decades[i + 1]) decade = i +1;
        }
        return decade;
    }

    public static void main(String[] args) {
        int year = 10;
        System.out.println(centuryFromYear(year));
    }

}
