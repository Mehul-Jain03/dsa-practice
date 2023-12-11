package stack;

public class LinkedListStackImp {
	
	static Node head;
	
	class Node
	{
		int value;
		Node next;
	}

	LinkedListStackImp()
	{
		head =  null;
	}
	
	public void push(int value)
	{
		Node extraHead =  head;
		head = new Node();
		head.value = value;
		head.next = extraHead;
	}
	
	public int pop()
	{
		if(head==null)
		{
			System.out.println("Stack is Empty");
		}
		int val = head.value;
		head =  head.next;
		return val;
	}
	
	public void printStack(Node head)
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.value + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListStackImp lls = new LinkedListStackImp();
		lls.push(10);
		lls.push(20);
		lls.push(30);
		lls.push(40);
		lls.push(50);
		lls.push(60);
		lls.push(70);
		lls.push(80);
		System.out.println("*********************************");
		lls.printStack(head);
		System.out.println("*********************************");
		System.out.println(lls.pop());
		
	}

}
