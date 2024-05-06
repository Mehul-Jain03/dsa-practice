package strings;

public class GreatestCommonDivisorOfStrings {

    public static String greatestCommonDivisorOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, gcd(str1.length(), str2.length()));
        } else {
            return "";
        }
    }

    public static int gcd(int length1, int length2) {
        while (length2 % length1 != 0) {
            int remainder = length2 % length1;
            length2 = length1;
            length1 = remainder;
        }
        return length1;
    }

    public static void main(String[] args) {
        String str1 = "abababab";
        String str2 = "ab";
        System.out.println(greatestCommonDivisorOfStrings(str1, str2));
    }

}