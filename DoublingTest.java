
public class DoublingTest {

	public static double timeTrial(int N) {
		//compute time to solve a random instance of size N
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = StdRandom.uniform(2000000) - 1000000;
		Stopwatch s = new Stopwatch();
		int cnt = ThreeSum.count(a);
		return s.elapsedTime();
	}

	public static void main(String[] args) {
		//print table of doubling ratios
		double prev = timeTrial(256);
		for (int N = 512; true; N += N) {
			//print doubling ratio for problem size N
			double curr = timeTrial(N);
			StdOut.printf("%7d %4.2f \n", N, curr / prev);
			prev = curr;
		}
	}
}