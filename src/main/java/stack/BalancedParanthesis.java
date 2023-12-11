package stack;

import java.util.Stack;

public class BalancedParanthesis {

	public boolean matching(char a, char b) {
		return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
	}

	public boolean isBalanced(String s) {
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				st.push(s.charAt(i));
			} else {
				if (st.isEmpty() == true) {
					return false;
				} else if (matching(st.peek(), s.charAt(i)) == false) {
					return false;
				} else
					st.pop();
			}
		}
		return (st.isEmpty() == true);
	}

	public static void main(String args[]) {
		BalancedParanthesis bp = new BalancedParanthesis();
		System.out.println(bp.isBalanced("({}AA{}(){})"));
	}
}