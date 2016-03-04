
public class DoublingStackOfStrings {
	private String[] a = new String[1];
	private int N = 0;

	public boolean isEmpty() {
		return (N == 0);
	}

	public void resize(int max) {
		//move stack to a new array of size max
		String[] temp = new String[max];
		for (int i = 0; i < N; i++)
			temp[i] = a[i];
		a = temp;
	}

	public void push(String item) {
		//add item to top of stack
		if (N == a.length) resize(2*a.length);
		a[N++] = item;
	}

	public String pop() {
		//remove item from top of stack
		String item = a[--N];
		a[N] = null; //avoid loitering
		if (N > 0 && N == a.length/4) resize(a.length/2);
		return item;
	}

	public static void main(String[] args) {
		DoublingStackOfStrings s = new DoublingStackOfStrings();
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