public class Factorial {
	public static long factorial(int N) {
		if (N == 1) return 1;
		return N * factorial(N-1);
	}
}