public class RecursiveHarmonic {
	public static double H(int N) {
		if (N == 1) return 1.0;
		return H(N-1) + 1.0/N;
	}
}