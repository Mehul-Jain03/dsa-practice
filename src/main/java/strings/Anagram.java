package strings;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        if (str1 == null || str2 == null || (str1.length() != str2.length())) {
            return false;
        }
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean equals = Arrays.equals(char1, char2);
        if (equals) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }
}
