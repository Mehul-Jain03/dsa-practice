package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    //Common String in all 2 words i.e. "Me";
    //When we sort the middle words will always have the character that first and last have.
    static String findLongestCommonPrefix(String[] strArray) {
        Arrays.sort(strArray);
        String strOne = strArray[0];
        String strTwo = strArray[1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strOne.length(); i++) {
            if (strOne.charAt(i) == strTwo.charAt(i)) {
                sb.append(strOne.charAt(i));
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String[] strArray = {"Mehul", "Meenu", "Megha"};
        System.out.println(findLongestCommonPrefix(strArray));
    }
}
