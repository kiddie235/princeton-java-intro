
public class Stack<Item> {
	private Node first;

	private class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void push(Item item) {
		//add item to top of stack
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public Item pop() {
		//remove item from top of stack
		Item item = first.item;
		first = first.next;
		return item;
	}

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
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