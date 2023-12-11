package miscellaneous;

import java.util.Stack;

public class BalancedParanthesis {

	public static boolean matching(char a, char b) {
		return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
	}

	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				st.push(str.charAt(i));
			} else {
				if (st.isEmpty() == true) {
					return false;
				} else if (matching(st.peek(), str.charAt(i)) == false) {
					return false;
				} else
					st.pop();
			}
		}
		return (st.isEmpty() == true);
	}

	public static void main(String[] args) {

		String str = "{[]}(){";
		System.out.println(isBalanced(str));

	}

}