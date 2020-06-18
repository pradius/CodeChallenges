package com.codechallenges.Other;

public class HappyNumber {

    public static String inputCase = "7";

    public static void main(String[] args) {


        System.out.printf("Final Result " + happyNumber(inputCase));
    }

        public static String happyNumber(String number){
            int sum = 0;
            int num = 0;

            for (char num1 : number.toCharArray()){
                try{
                    num = Character.getNumericValue(num1); // convert digit to integer
                    num = num * num;                       // get the square of the digit
                    sum = sum + num;                       // add square to the sum
                }
                catch (Exception e){
                    continue;//if cant convert to integer, do nothing, go to next iteration
                }
            }
            // IF sum == 1, print the happy number
            System.out.println("before if statement " + sum );
            String total = Integer.toString(sum);
            if (sum == 1){
                System.out.println("inside if statement " + sum );
                return total;
            }
            else {

                return happyNumber(total);
            }

    }
}
