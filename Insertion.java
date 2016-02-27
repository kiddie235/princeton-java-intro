
public class Insertion {

	public static void sort(Comparable[] a) {
		//sort a[] into increasing order
		int N = a.length;
		for (int i = 1; i < N; i++)
			//insert a[i] into position by exchanging
			//it with the larger elements to its left
			for (int j = i; j > 0; j--) {
				if (a[j-1].compareTo(a[j]) > 0)
					exch(a, j-1, j);
				else break;
			}
	}

	public static void exch(Comparable[] a, int i, int j) {
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}

	public static void main(String[] args) {
		//read strings from standard input, sort them, and print
		String[] a = StdIn.readAll().split("\\s+");
		sort(a);
		for (int i = 0; i < a.length; i++)
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
}