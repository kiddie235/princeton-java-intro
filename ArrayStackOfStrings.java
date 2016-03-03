
public class ArrayStackOfStrings {
	private String[] a;
	private int N = 0;

	public ArrayStackOfStrings(int max) {
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

	public static void main(String[] args) {
		//create a stack of capacity max
		//and push or pop strings as directed on StdIn
		int max = Integer.parseInt(args[0]);
		ArrayStackOfStrings s = new ArrayStackOfStrings(max);
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