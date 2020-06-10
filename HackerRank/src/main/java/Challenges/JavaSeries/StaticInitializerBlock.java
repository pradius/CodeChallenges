package Challenges.JavaSeries;

import java.util.*;

public class StaticInitializerBlock {
    static boolean flag;
    static int B;
    static int H;
    static {
        Scanner scan = new Scanner(System.in);
        flag = true;
        B = scan.nextInt();
        H = scan.nextInt();
        if (B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}