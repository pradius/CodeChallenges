public class NumberStepsToReduceNumberToZero {

    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            }
            if (num % 2 != 0) {
                num = num - 1;
                steps++;
            }
        }

        return steps;
    }

    public static void main(String[] args) {

        // TEST CASE 1: Input: num = 14 Output: 6
        int num = 14;
        int output = 6;
        System.out.println((numberOfSteps(num)) == output ? "CASE 1 PASS" : "X CASE 1 FAIL");

        // TEST CASE 2: Input: num = 8 Output: 4
        num = 8;
        output = 4;
        System.out.println((numberOfSteps(num)) == output ? "CASE 2 PASS" : "X CASE 2 FAIL");

        // TEST CASE 3: Input: num = 123 Output: 12
        num = 123;
        output = 12;
        System.out.println((numberOfSteps(num)) == output ? "CASE 3 PASS" : "X CASE 3 FAIL");
    }

}

// Given a non-negative integer num, return the number of steps to reduce it to
// zero. If the current number is even, you have to divide it by 2, otherwise,
// you have to subtract 1 from it.