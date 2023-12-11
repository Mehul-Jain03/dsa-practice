package strings;

public class ReverseStringWithoutReversingSpecialChars {


    public static String reverseStringWithoutReversingSpecialChars(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (!Character.isAlphabetic(chars[start])){
                start++;
            }
            if (!Character.isAlphabetic(chars[end])) {
                end--;
            } else {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        System.out.println(reverseStringWithoutReversingSpecialChars("a,b$c"));
    }


}