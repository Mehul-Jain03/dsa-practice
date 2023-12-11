package queue;

import java.util.Stack;

public class QueueUsingTwoStack {

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public void Push(int x) {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		s1.push(x);

		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}

	}

	public int Pop() {
		if (s1.isEmpty()) {
			return -1;
		}

		int val = s1.peek();
		s1.pop();
		return val;

	}

	public static void main(String[] args) {

		QueueUsingTwoStack q = new QueueUsingTwoStack();
		q.Push(10);
		q.Push(20);
		q.Push(30);
		System.out.println(q.Pop());
	}
}
