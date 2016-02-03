
public class Counter implements Comparable<Counter> {
    private final String name;
    private final int maxCount;
    private int count;

    public Counter(String id, int max) {
        name = id; maxCount = max;
    }

    public void increment() {
        if (count < maxCount)
            count++;
        assert count >= 0 : "Negative count detected in increment()";
    }

    public int value() {
        return count;
    }

    public String toString() {
        return name + ": " + count;
    }

    public int compareTo(Counter b) {
        if (count < b.count) return -1;
        if (count > b.count) return +1;
        else                 return  0;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int T = Integer.parseInt(args[1]);
        Counter[] hits = new Counter[N];
        for (int i = 0; i < N; i++)
            hits[i] = new Counter(i + "", T);

        for (int t = 0; t < T; t++)
            hits[StdRandom.uniform(N)].increment();
        for (int i = 0; i < N; i++)
            StdOut.println(hits[i]);
    }
}