package stack;

public class MyLinkedListStack {

	Node head;
	int size;

	public MyLinkedListStack() {
		head = null;
		size = 0;
	}

	public void push(int x) {

		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		size++;
	}

	public int pop() {
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		int ret = head.data;
		head = head.next;
		size--;
		return ret;
	}

	public int size() {
		return size;

	}

	public int peek() {
		int ret = head.data;
		return ret;
	}

	public boolean isEmpty() {
		return (head == null);
	}

}