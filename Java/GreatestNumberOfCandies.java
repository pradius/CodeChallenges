import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class GreatestNumberOfCandies {

    // Original: Faster
    // public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    // {
    // List<Boolean> output = new ArrayList<Boolean>();
    // int greatestNumber = 0;

    // for (var candy : candies)
    // if (candy > greatestNumber){
    // greatestNumber = candy;
    // }
    // for (var i = 0; i < candies.length; i++) {
    // if ((candies[i] + extraCandies) >= greatestNumber) {
    // output.add(true);
    // } else {
    // output.add(false);
    // }
    // }

    // return output;
    // }

    // Improved : Cleaner
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).map(i -> i + extraCandies).mapToObj(i -> i >= max).collect(Collectors.toList());

    }

    public static void main(String[] args) {

        // TEST CASE 1 : Input: candies = [2,3,5,1,3], extraCandies = 3
        // Output: [true,true,true,false,true]
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> output = new ArrayList<Boolean>(Arrays.asList(true, true, true, false, true));

        System.out.println(kidsWithCandies(candies, extraCandies).equals(output) ? "PASS CASE 1" : " X FAIL CASE 1");

        // TEST CASE 2: Input: candies = [4,2,1,1,2, extraCandies = 1
        // Output: [true,false,false,false,false]
        int[] candies2 = { 4, 2, 1, 1, 2 };
        int extraCandies2 = 1;
        List<Boolean> output2 = new ArrayList<Boolean>(Arrays.asList(true, false, false, false, false));

        System.out.println(kidsWithCandies(candies2, extraCandies2).equals(output2) ? "PASS CASE 2" : "X FAIL CASE 2");

        // TEST CASE 3: Input: candies = [12,1,12], extraCandies = 10
        // Output: [true,false,true]
        int[] candies3 = { 12, 1, 12 };
        int extraCandies3 = 10;
        List<Boolean> output3 = new ArrayList<Boolean>(Arrays.asList(true, false, true));

        System.out.println(kidsWithCandies(candies3, extraCandies3).equals(output3) ? "PASS CASE 3" : "X FAIL CASE 3");

    }
}

// Given the array candies and the integer extraCandies, where candies[i]
// represents the number of candies that the ith kid has.

// For each kid check if there is a way to distribute extraCandies among the
// kids such that he or she can have the greatest number of candies among them.
// Notice that multiple kids can have the greatest number of candies.