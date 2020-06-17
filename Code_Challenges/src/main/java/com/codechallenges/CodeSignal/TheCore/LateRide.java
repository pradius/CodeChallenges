package com.CodeSignal.TheCore;

public class LateRide {
    public static int add(int i){
        String num = Integer.toString(i);
        if(num.length() > 1){
            return Character.getNumericValue(num.charAt(0)) + Character.getNumericValue(num.charAt(1));
        }
        return i;
    }

    public static int lateRide(int n) {
        if (n == 0) return n;
        int hour = 0;
        int minutes = -1;
        for( int i = 0; i <= n; i++){
            if(i%60 == 0 && i !=0 && i != 1){
                hour++;
                minutes = 0;
            }
            else{
                minutes++;
            }
        }
        System.out.println("hour: " + hour + ": Minutes: " + minutes);
        return add(hour) + add(minutes);
    }

    public static void main(String[] args) {
        System.out.println(lateRide(470));
    }
}


//TODO: TOP SOLUTION
/*
int lateRide(int n) {
    int hours = n/60;
    int minutes = n%60;
    return hours/10 + hours%10 + minutes/10 + minutes%10;
}*/
