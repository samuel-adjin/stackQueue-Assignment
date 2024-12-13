package ProblemTwo;

public class LinkedListStack {
	static Node header = new Node();

	public static class Node {
		Node previous;
		Integer value;
		Node next;
	}
	//Push data to stack
	public void push(Integer x) {
		if(x == null) return;
		Node newNode = new Node();
		newNode.value = x;
		if(isEmpty()) {
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
	public Integer pop(){
		if(isEmpty()) return null;
		Node current = header.next;
		while (current.next != null){
			current = current.next;
		}
		int val = current.value;
		if (current.previous != null) {
			current.previous.next = null;
		} else {
			header.next = null;
		}

		return val;
	}

	//Peek method implementation
	public Integer peek(){
		Node current = header;
		if(isEmpty()) return null;
		while (current.next!= null){
			current = current.next;
		}
		return current.value;
	}

	private static boolean isEmpty(){
		return (header.next == null);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node current = header.next;
		if (isEmpty()) return "No data to print";
		while (current != null) {
				sb.append(current.value).append(" --->");
				current = current.next;
			}
			sb.append("null]");
		return sb.toString();
	}

	public static void main(String[] args) {
		LinkedListStack  st = new LinkedListStack();
		st.push (10);
		st.push(20);
		st.push (30);
		st.push(40);
		st.push(50);
		System.out.println("Data after pushing ...");
		System.out.println(st);
		System.out.println("----------------------");
		System.out.println("Pop: " + st.pop());
		//System.out.println("Pop: " + st.pop());
		//System.out.println("Pop: " + st.pop());
		//System.out.println("Pop: " + st.pop());
		//System.out.println("Pop: " + st.pop());
		System.out.println("Peek: " + st.peek());
		System.out.println("Data after pop then peek ...");
		System.out.println(st);
		System.out.println("----------------------");
		System.out.println("Peek: " + st.peek());
		System.out.println("Pop: " + st.pop());
		System.out.println("Pop: " + st.pop());
		System.out.println("Data after peek and pop ...");
		System.out.println(st);
		System.out.println("----------------------");
	}
}
