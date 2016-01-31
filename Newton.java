public class Newton {
	
	public static double sqrt(double c) {
		//compute the square root of c
		if (c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t - c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}

	public static void main(String[] args) {
		//print square roots of arguments
		int N = args.length;
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
			a[i] = Double.parseDouble(args[i]);
		for (int i = 0; i < N; i++) {
			//print square root of ith argument
			double x = sqrt(a[i]);
			StdOut.println(x);
		}
	}
}