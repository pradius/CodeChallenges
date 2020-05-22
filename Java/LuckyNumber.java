
class LuckuNumber {

    public static Long getLuckyNumber(long l, long h) {
        var output = 0L;

        for (long i = l; i <= h; i++) {
            String num = Long.toString(i);
            if (num.contains("6") ^ num.contains("8")) {
                output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        // TEST CASE 1
        long l = 1;
        long h = 10;
        long output = 2;
        System.out.println((getLuckyNumber(l, h)) == output ? "CASE 1 PASS" : "X CASE 1 FAIL");

        // TEST CASE 2
        l = 58;
        h = 72;
        output = 10;
        System.out.println((getLuckyNumber(l, h)) == output ? "CASE 2 PASS" : "X CASE 2 FAIL");

        // TEST CASE 3
        l = 3628;
        h = 3628;
        output = 0;
        System.out.println((getLuckyNumber(l, h)) == output ? "CASE 3 PASS" : "X CASE3 FAIL");

        // TEST CASE 4
        l = 361087;
        h = 773904;
        output = 224197;
        System.out.println((getLuckyNumber(l, h)) == output ? "CASE 4 PASS" : "X CASE 4 FAIL");

        // TEST CASE 5
        l = 92871036442L;
        h = 3363728910382456L;
        output = 1160053175781729L;
        System.out.println((getLuckyNumber(l, h)) == output ? "CASE 5 PASS" : "X CASE 5 FAIL");

        // TEST CASE 6
        l = 1;
        h = 1000000000000000000L;
        output = 264160473575034274L;
        System.out.println((getLuckyNumber(l, h)) == output ? "CASE 6 PASS" : "X CASE 6 FAIL");

    }
}

// A lucky number is a number which has the number 6 or 8 in its digits.
// However, if it has both 6 and 8 at the same time, then the number is not
// lucky.