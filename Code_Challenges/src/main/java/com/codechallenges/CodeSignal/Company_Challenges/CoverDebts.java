package com.codechallenges.CodeSignal.Company_Challenges;

public class CoverDebts {
    static double coverDebts(double s, double[] debts, double[] interests) {
        int months = 1;
        double amountSpent = 0;
        boolean hasDebt = true;

        while(hasDebt) {
            double budget = (s * 0.10);// 10% of salary to cover debts

            while(budget > 0) {
                //Find the highest interest debts
                double highest = 0;
                int highestIndex = -1;
                for (int i = 0; i < interests.length; i++) {
                    if (interests[i] > highest) {
                        highest = interests[i];
                        highestIndex = i;
                    }
                }
                if(highest == 0){
                    return amountSpent;
                }
                //pay in order of priority
                //calculate out of money
                //re-calculate new debt based on interest
                // if debt is paid off, set interest to 0
                if(debts[highestIndex] >= budget){
                    amountSpent += budget;
                    debts[highestIndex] -= budget;
                    budget = 0;

                }else{
                    budget -= debts[highestIndex];
                    amountSpent += debts[highestIndex];
                    debts[highestIndex] = 0;
                }

                if(debts[highestIndex] == 0){
                    interests[highestIndex] = -1;
                }

            }

            for(int i = 0; i < interests.length; i++){
                if(interests[i] > 0){
                    debts[i] +=  (interests[i] / 100.0) * debts[i];
                }
            }

            System.out.println("Months : " + months);
            months++;
        }
        return amountSpent;
    }


    public static void main(String[] args) {
        double s = 50;
        double[] debts = {2, 2, 5};
        double[] interests = {200, 100, 150};

        System.out.println("Expected: 22.0 - Actual: " + coverDebts(s, debts, interests));

        double s1 = 40;
        double[] debts1 = {2, 2, 5};
        double[] interests1 = {75, 25, 25};

        System.out.println("Expected: 10.8125 - Actual: " + coverDebts(s1, debts1, interests1));
    }
}
