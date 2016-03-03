
public class FrequencyCount {

	public static void main(String[] args) {
		//print input strings in decreasing order
		//of frequency of occurence
		String s = StdIn.readAll();
		String[] words = s.split("\\s+");
		Merge.sort(words);
		Counter[] zipf = new Counter[words.length];
		int M = 0;
		for (int i = 0; i < words.length;i++) {
			//create new counter or increment prev counter
			if (i == 0 || !words[i].equals(words[i-1]))
				zipf[M++] = new Counter(words[i], words.length);
			zipf[M-1].increment();
		}
		Merge.sort(zipf, 0, M);
		for (int j = M-1; j >= 0; j--)
			StdOut.println(zipf[j]);
	}
}