package com.CodeSignal.Intro;

public class MakeArrayConsecutive {

    public static int[] sort(int[] arr){
        int[] sorted = arr;
        int len = sorted.length;
        while (len != 0){
            for(int i = sorted.length - 1; i > 0; i--){
                if (sorted[i] < sorted [i - 1]){
                    int temp = sorted [i - 1];
                    sorted[i - 1] = sorted [i];
                    sorted[i] = temp;
                }
            }
            for (int item : sorted){
                System.out.print(item + " " );
            }
            System.out.println();
            len--;
        }
        return sorted;
    }


    public static int makeArrayConsecutive2(int[] statues) {
        int count = 0;
        // sort the array
        int[] sorted = sort(statues);

        for (int i = 0; i < sorted.length - 1; i++){
            int base = sorted[i];
            while(base + 1  != sorted[i + 1]){
                base++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 8};

        System.out.println(makeArrayConsecutive2(arr));
    }
}

//TODO: Top Solution
//    int makeArrayConsecutive2(int[] a) {
//        Arrays.sort(a);
//        int n = a[a.length-1] - a[0];
//        return n - a.length + 1;
//    }