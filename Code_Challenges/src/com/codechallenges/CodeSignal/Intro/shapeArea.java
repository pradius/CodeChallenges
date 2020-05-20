package com.CodeSignal.Intro;

public class shapeArea {
    public static int shapeArea(int n) {
        if (n == 1)  return 1;
        int exp = 2;
        int result = 1;
        for (int i = 1;  i < n; i++){
            if (i%4 == 0) exp -= 4;
            else {
                exp += exp;
            }
            System.out.println(exp);
            result = result + exp;
        }
        System.out.println("-------------------");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(shapeArea(100));
    }
}
