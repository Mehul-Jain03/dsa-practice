package stack;

import java.util.ArrayList;

public class MyArrayListStack {

	ArrayList<Integer> al = new ArrayList<>();

	public void push(int x) {
		al.add(x);

	}

	public int pop() {
		int rem = al.get(al.size() - 1);
		al.remove(al.size() - 1);
		return rem;
	}

	public int size() {
		return al.size();
	}

	public int peek() {
		int rem = al.get(al.size() - 1);
		return rem;
	}

	public boolean isEmpty() {
		return al.isEmpty();
	}

	public static void main(String args[]) {

		MyArrayListStack ms = new MyArrayListStack();
		ms.push(10);
		ms.push(20);
		ms.push(30);

		System.out.println(ms.pop());
		System.out.println(ms.peek());
		System.out.println(ms.size());
		System.out.println(ms.isEmpty());
		ms.push(40);

	}
}
