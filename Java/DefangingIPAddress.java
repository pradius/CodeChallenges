
class DefangingIPAddress {

    // public static String defangIPaddr(String address) {
    // var newAddress = new StringBuilder(address);

    // for (var i = 0; i < newAddress.length(); i++) {
    // if (newAddress.charAt(i) == '.') {
    // newAddress.deleteCharAt(i);
    // newAddress.insert(i, "[.]");
    // i += 3;
    // }
    // }
    // return newAddress.toString();
    // }

    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();

        for (var letter : address.toCharArray()) {
            if (letter == '.') {
                str.append("[.]");
            } else {
                str.append(letter);
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {

        // TEST CASE 1
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1") ? "PASS CASE 1" : "X FAIL CASE 1");

        // TEST CASE 2
        // System.out.println(defangIPaddr("255.100.50.0"));
        System.out.println(defangIPaddr("255.100.50.0").equals("255[.]100[.]50[.]0") ? "PASS CASE 2" : "X FAIL CASE 2");
    }
}

// Given a valid (IPv4) IP address, return a defanged version of that IP address
// A defanged IP address replaces every period "." with "[.]".