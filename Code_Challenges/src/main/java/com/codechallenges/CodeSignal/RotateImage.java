package com.codechallenges.CodeSignal;

public class RotateImage {
    public static int[][] rotateImage(int[][] a) {
        int last = a.length - 1;
        int level = 0;
        int decreaser = last;
        while(level <= last){
            for(int i = level; i < last; i++){
                int temp = a[i][last]; // save top right

                a[i][last] = a[level][i]; //top left -> top right
                a[level][i] = a[decreaser][level]; //botton left -> top left
                a[decreaser][level] = a[last][decreaser]; //bottom right -> bottom left
                a[last][decreaser] = temp; //top right - > bottom right
                decreaser--;
            }
            level++;
            last--;
            decreaser = last;
        }

        return a;
    }


    public static void main(String[] args) {
       int size = 6;
       int[][] a = createMatrix(size);
       System.out.println("---------------Original Matrix-----------------");
       printMatrix(a);
       System.out.println("---------------Rotated Matrix-----------------");
       printMatrix(rotateImage(a));
    }

    public static int[][] createMatrix(int size){
        int count = 1;
        int[][] a = new int[size][size];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = count++;
            }

        }
        return a;
    }

    public static void printMatrix(int[][] a){

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }


}
