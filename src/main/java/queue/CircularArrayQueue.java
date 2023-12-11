package queue;
//Efficient Implementation

public class CircularArrayQueue {

	int arr[];
	int size, cap, front;

	CircularArrayQueue(int c) {
		size = 0;
		front = 0;
		cap = c;
		arr = new int[cap];
	}

	public boolean isFull() {
		if (cap == size) {
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
			int rear = getRear();
			rear = (rear + 1) % cap;
			arr[rear] = x;
			size++;
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}
		front = (front + 1) % cap;
		size--;
	}

	public int getFront() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}
		return arr[front];
	}

	public int getRear() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
		}
		return (front + size - 1) % cap;
	}

	public static void main(String[] args) {

	}

}
