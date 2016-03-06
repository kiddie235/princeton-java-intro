
public class Index {
    public static void main(String[] args) {
        int minlen = Integer.parseInt(args[0]);
        int minocc = Integer.parseInt(args[1]);

        String[] words = StdIn.readAll().split("\\s+");

        BST<String, Queue<Integer>> st;
        st = new BST<String, Queue<Integer>>();

        for (int i = 0; i < words.length; i++) {
        	//add word position to data structure
        	String s = words[i];
        	if (s.length() < minlen)	continue;
        	if (!st.contains(s))
        		st.put(s, new Queue<Integer>());
        	Queue<Integer> q = st.get(s);
        	q.enqueue(i);
        }

        for (String s : st) {
        	//print words whose occurence count exceeds threshold
        	Queue<Integer> q = st.get(s);
        	if (q.length() >= minocc)
        		StdOut.println(s + ": " + q);
        }
    }
}
