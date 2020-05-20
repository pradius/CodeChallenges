public class JewelsAndStones {

    public static int numJewelsInStones(String J, String S) {
        var count = 0;

        for (char j : J.toCharArray()) {
            for (char s : S.toCharArray()) {
                if (j == s) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // TEST CASE 1
        var J = "aA";
        var S = "aAAbbbb";
        var output = 3;
        System.out.println((numJewelsInStones(J, S)) == output ? "CASE 1 PASS" : "X CASE 1 FAIL");

        // TEST CASE 1
        J = "z";
        S = "ZZ";
        output = 0;
        System.out.println((numJewelsInStones(J, S)) == output ? "CASE 1 PASS" : "X CASE 1 FAIL");
    }
}

// You're given strings J representing the types of stones that are jewels, and
// S representing the stones you have. Each character in S is a type of stone
// you have. You want to know how many of the stones you have are also jewels.

// The letters in J are guaranteed distinct, and all characters in J and S are
// letters. Letters are case sensitive, so "a" is considered a different type of
// stone from "A".