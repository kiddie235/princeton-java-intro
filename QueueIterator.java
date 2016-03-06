
import java.util.Iterator;

public class QueueIterator<Item> implements Iterable<Item> {
	private Node first;
	private Node last;

	private class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void enqueue(Item item) {
		//add item to the end of the list
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) 	first = last;
		else			oldlast.next = last;
	}

	public Item dequeue() {
		//remove item from the beginning of the list
		Item item = first.item;
		first = first.next;
		if (isEmpty()) last = null;
		return item;
	}

	/**iterator part
	  *iterator() just returns an ArrayIterator() object
	  *from the private nested class which implements Iterator
	  */

	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	private class ListIterator implements Iterator<Item> {
		Node current = first;

		public boolean hasNext() {
			return (current != null);
		}

		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		public void remove() 
		{	}
	}
	
	//*****end of iterator part*******

	public static void main(String[] args) {
		QueueIterator<String> q = new QueueIterator<String>();
		//test for iteration
		while (!StdIn.isEmpty())
			q.enqueue(StdIn.readString());
		for (String word : q)
			StdOut.println(word);
		StdOut.println("***Done testing iterator****");
		//end of iterator test
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-"))
				q.enqueue(item);
			else
				StdOut.print(q.dequeue() + " ");
		}
		StdOut.println();
	}
}