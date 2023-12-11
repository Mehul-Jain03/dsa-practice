package queue;
//Simple Implementation

public class SimpleArrayQueue {

	int arr[];
	int size, cap;

	SimpleArrayQueue(int c) {
		size = 0;
		cap = c;
		arr = new int[cap];
	}

	public boolean isFull() {
		if (size == cap) {
			return true;
		}

		return false;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}

		return false;
	}

	public void enqueue(int x) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			arr[size] = x;
			size++;
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}
		for (int i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
			size--;
		}

	}

	public int getFront() {
		if (size == 0) {
			System.out.println("Queue is Empty");
		}
		return arr[0];
	}

	public int getRear() {
		if (size == 0) {
			System.out.println("Queue is Empty");
		}
		return arr[size - 1];
	}

	public static void main(String[] args) {

	}

}
