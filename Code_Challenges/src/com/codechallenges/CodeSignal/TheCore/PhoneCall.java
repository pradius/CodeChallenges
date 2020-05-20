package com.CodeSignal.TheCore;

public class PhoneCall {
    public static int phoneCall(int min1, int min2_10, int min11, int s) {
        int duration = 0;
        if (s >= min1){
            duration += 1;
            s = s - min1;
        }
        else {
            return 0;
        }
        if (s >= min2_10 * 9){
            duration += 9;
            s = s - min2_10 * 9;
        }
        else {
            duration += s/min2_10;
            return duration;
        }

        if (s > min11){
            duration += s/min11;
        }
        else if(s == min11) duration += 1;
        return duration;
    }

    public static void main(String[] args) {
        System.out.println(phoneCall(1, 2, 1, 6));
    }
}


//TODO: TOP SOLUTION
/*
int phoneCall(int min1, int min2_10, int min11, int s) {
    int t1=min1+ min2_10*9;
    if (s>=t1){
        return 10+(s-t1)/min11;
    }
    if (s>=min1){
        return (s-min1)/min2_10+1;
    }
    return 0;
}*/
