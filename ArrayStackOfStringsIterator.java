//always remember Iterator is not part of standard java library
//so import Iterator

import java.util.Iterator;

public class ArrayStackOfStringsIterator implements Iterable<String> {
	private String[] a;
	private int N = 0;

	public ArrayStackOfStringsIterator(int max) {
		a = new String[max];
	}

	public boolean isEmpty() {
		return (N == 0);
	}

	public void push(String item) {
		a[N++] = item;
	}

	public String pop() {
		return a[--N];
	}

	/**iterator part
	  *iterator() just returns an ArrayIterator() object
	  *from the private nested class which implements Iterator
	  */
	public Iterator<String> iterator() {
		return new ArrayIterator();
	}

	private class ArrayIterator implements Iterator<String> {
		private int i = N-1;

		public boolean hasNext() {
			return i >= 0;
		}

		public String next() {
			return a[i--];
		}

		//no implementation for remove method
		public void remove()
		{	}
	}

	//*****end of iterator part*******

	public static void main(String[] args) {
		//create a stack of capacity max
		//and push or pop strings as directed on StdIn
		int max = Integer.parseInt(args[0]);
		ArrayStackOfStringsIterator s = new ArrayStackOfStringsIterator(max);
		//test for iteration
		while (!StdIn.isEmpty())
			s.push(StdIn.readString());
		for (String word : s)
			StdOut.println(word);
		StdOut.println("***Done testing iterator****");
		//end of iterator test
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