package stack;

public class ArrayStackImp {

	int size;
	int top;
	int[] arr;

	public ArrayStackImp(int size) {
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}
	
	public void push(int element)
	{
		if(!isFull())
		{
			top++;
			arr[top] = element;
			System.out.println("Pushed Element is " + element);
		}
		else 
		{
			System.out.println("Stack is Full");
		}
	}
	
	
	public int pop(){
		if(!isEmpty())
		{
			int returnedVal = top;
			top--;
			System.out.println("Popped Value is " + arr[returnedVal]);
			return arr[returnedVal];
		}
		else 
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (size - 1 == top);
	}

	public static void main(String[] args) {
		ArrayStackImp ar = new ArrayStackImp(5);
		ar.pop();
		ar.push(100);
		ar.push(200);
		ar.push(300);
		ar.push(400);
		ar.push(500);
		ar.push(600);
		ar.pop();
	}

}
