
public class BinarySearch {
	//Sorted Array
	public static int search(String key, String[] a) {
		return search(key, a, 0, a.length);
	}

	public static int search(String key, String[] a, int lo, int hi) {
		//search for key in a[lo, hi)
		if (hi <= lo) return -1;
		int mid = lo + (hi - lo) / 2;
		int cmp = a[mid].compareTo(key);
		if (cmp > 0) 		return search(key, a, lo, mid);
		else if (cmp < 0) 	return search(key, a, mid+1, hi);
		else				return mid;
	}

	public static void main(String[] args) {
		//print keys in StdIn that are not found
		//in the whitelist file args[0]
		In in = new In(args[0]);
		String[] a = in.readAll().split("\\s+");
		while (!StdIn.isEmpty()) {
			String key = StdIn.readString();
			if (search(key, a) < 0)	StdOut.println(key);
		}
	}
	
}