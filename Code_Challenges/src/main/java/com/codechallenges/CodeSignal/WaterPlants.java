package com.CodeSignal;

public class WaterPlants {

    public static int solution(int[] plants, int capacity1, int capacity2) {
        // write your code in Java SE 8
        int halfway = plants.length/2;
        int can1 = 0;
        int can2 = 0;

        int refill = 0;
        int last = plants.length -1;
        for(int i = 0; i < halfway; i++){
            if (can1 == 0 || can1 < plants[i]){
                can1 = capacity1;
                refill++;
            }
            if (can2 == 0 || can2 < plants[last]){
                can2 = capacity2;
                refill++;
            }
            can1 = can1 - plants[i];
            //System.out.print(can1 + " ");
            can2 = can2 - plants[last];
            //System.out.println(can2);

            last--;
        }
        return refill;
    }

    public static void main(String[] args) {

        int[] plants =  {2, 4, 5, 1, 2};
        int cap1 = 5;
        int cap2 = 7;
        System.out.println(solution(plants, cap1, cap2));
    }
}
