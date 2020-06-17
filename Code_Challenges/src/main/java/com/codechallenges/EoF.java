package com.codechallenges;

import java.util.Scanner;

public class EoF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String phrase = "";

        // Code used in HackerRank Editor
//        while(scan.hasNextLine()){
//            phrase += scan.nextLine() + "\n";
//        }

        //Dummy entry
        phrase = "Hello world\n" +
                        "I am a file\n" +
                        "Read me until end-of-file.";

        scan = new Scanner(phrase);

        while (scan.hasNext()){
            count++;
            System.out.println( count + " " + scan.nextLine());
        }
    }
}
