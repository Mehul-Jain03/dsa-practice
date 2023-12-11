package strings;


public class Palindrome {

    public static boolean isPalindrome(String str) {
        String actual = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(actual);
        int first = 0;
        int last = actual.length() - 1;
        while (first < last) {
            if (actual.charAt(first) != actual.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

}
