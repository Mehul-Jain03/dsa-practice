package queue;

public class LinkedListQueue {

	Node front, rear;
	int currentSize;

	LinkedListQueue() {
		front = rear = null;
		currentSize = 0;
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public void enqueue(int x) {
		Node temp = new Node(x);

		if (front == null) {
			front = rear = temp;
			currentSize++;
			return;
		}
		rear.next = temp;
		rear = temp;
		currentSize++;
	}

	public void dequeue() {
		if (front == null) {
			return;
		}
		front = front.next;
		currentSize--;
		if (front == null) {
			rear = null;
		}

	}

	public int getRear() {
		int val = rear.data;
		return val;
	}

	public int getFront() {
		int val = front.data;
		return val;
	}

	public static void main(String[] args) {

	}

}
