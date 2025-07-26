package stack;

import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                k = 0;
                current = new StringBuilder();
            } else if (ch == ']') {
                StringBuilder decode = stringStack.pop();
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++) {
                    decode.append(current);
                }
                current = decode;
            } else {
                current.append(ch);
            }

        }

        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));       // Output: aaabcbc
        System.out.println(decodeString("3[a2[c]]"));        // Output: accaccacc
        System.out.println(decodeString("2[abc]3[cd]ef"));   // Output: abcabccdcdcdef   // Output: abcabccdcdcdef
    }

}
