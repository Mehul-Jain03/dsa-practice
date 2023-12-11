package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public Queue<Integer> reverse(Queue<Integer> q) {
		Stack<Integer> st = new Stack<Integer>();
		while (!q.isEmpty()) {
			st.push(q.remove());
		}
		while (!st.isEmpty()) {
			q.add(st.pop());
		}

		return q;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		ReverseQueue rev = new ReverseQueue();
		rev.reverse(q);
		System.out.println(q);
	}

}