
public class LinkedStackOfStrings {
	private Node first;
	
	//private nested class for the node data type
	private class Node {
		String item;
		Node next;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void push(String item) {
		//add item to the top of the stack
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public String pop() {
		//remove item from top of statck
		String item = first.item;
		first = first.next;
		return item;
	}

	public static void main(String[] args) {
		LinkedStackOfStrings s = new LinkedStackOfStrings();
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				s.push(item);
			else
				StdOut.print(s.pop() + " ");
		}
		StdOut.println();
	}
}