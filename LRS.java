
public class LRS {
	//longest common prefix (lcp)
	public static String lcp(String s, String t) {
		int N = Math.min(s.length(), t.length());
		for (int i = 0; i < N; i++)
			if (s.charAt(i) != t.charAt(i))
				return s.substring(0, i);
		return s.substring(0, N);
	}

	/**brute force longest repeated substring(lrs)
	public static String lrs(String s) {
		String lrs = "";
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				String x = lcp(s.substring(i, N), s.substring(j, N));
				if (x.length() > lrs.length())
					lrs = x;
			}
		}
		return lrs;
	}
	*/

	public static String lrs(String s) {
		//find the longest repeated substring in s

		//create and sort suffix array
		int N = s.length();
		String[] suffixes = new String[N];
		for (int i = 0; i < N; i++)
			suffixes[i] = s.substring(i, N);
		Merge.sort(suffixes);

		String lrs = "";
		for (int i = 0; i < N-1; i++) {
			//lrs is longest common prefix in adjacent strings
			String x = lcp(suffixes[i], suffixes[i+1]);
			if (x.length() > lrs.length())
				lrs = x;
		}
		return lrs;
	}

	public static void main(String[] args) {
		//find the longest repeated substring in StdIn
		String s = StdIn.readAll();
		StdOut.println(lrs(s));
	}
}
