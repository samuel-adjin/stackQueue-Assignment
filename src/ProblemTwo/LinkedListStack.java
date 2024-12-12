package ProblemTwo;

public class LinkedListStack {
	static Node header = new Node();

	public static class Node {
		Node previous;
		Integer value;
		Node next;
	}

	public static void push(Integer x) {
		if(x == null) return;
		Node newNode = new Node();
		newNode.value = x;
		if(header.next == null) {
			header.next = newNode;
			newNode.previous = header;
		}
		else{
		Node current = header;
		while (current.next != null){
			current = current.next;
		}
			current.next = newNode;
            newNode.previous = current;
		}

	}

	//Pop the data from stack
	static Integer pop(){
		if(header.next == null) return null;
		Node current = header.next;
		while (current.next != null){
			current = current.next;
		}
		int n = current.value;
		if (current.previous != null) {
			current.previous.next = null;
		} else {
			header.next = null;
		}

		return n;
	}

	//Peek method implementation
	static Integer peek(){
		Node current = header;
		if(header.next == null) return null;
		while (current.next!= null){
			current = current.next;
		}
		return current.value;
	}

	public static boolean isEmpty(){ // true if stack is empty
		return (header.next == null);
	}
	static void PrintData () {
		Node current = header.next;
		if (header.next == null) {
			System.out.println("No data to print");
			return;
		}
		while (current != null) {
			System.out.print(current.value);
			System.out.print(" --->");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		push (10);
		push (20);
		push (30);
		push(40);
		push(50);
		System.out.println("Data after pushing ...");
		PrintData();
		System.out.println("----------------------");
		System.out.println("Pop: " + pop());
		System.out.println("Peek: " + peek());
		System.out.println("Data after pop then peek ...");
		PrintData();
		System.out.println("----------------------");
		System.out.println("Peek: " + peek());
		System.out.println("Pop: " + pop());
		System.out.println("Data after peek and pop ...");
		PrintData();
		System.out.println("----------------------");
	}
}
