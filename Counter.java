
public class Counter {
    private final String name;
    private final int maxCount;
    private int count;

    public Counter(String id, int max) {
        name = id; maxCount = max;
    }

    public void increment() {
        if (count < maxCount)
            count++;
    }

    public int value() {
        return count;
    }

    public String toString() {
        return name + ": " + count;
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