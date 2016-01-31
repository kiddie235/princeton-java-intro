public class Bernoulli {
	public static int binomial(int N) {
		//simulate flipping a coin N times
		int heads = 0;
		for (int i = 0; i < N; i++)
			if (StdRandom.bernoulli(0.5)) heads++;
		return heads;
	}
	
	public static void main(String[] args) {
		//perform experiments, plot results and model
		int N = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);

		int[] freq = new int[N+1];
		for (int t = 0; t < T; t++)
			freq[binomial(N)]++;

		double[] norm = new double[N+1];
		for (int i = 0; i <= N; i++)
			norm[i] = (double) freq[i] / T;
		StdStats.plotBars(norm);

		double mean = N / 2.0;
		double stddev = Math.sqrt(N)/2.0;
		double[] phi = new double[N+1];
		for (int i = 0; i <= N; i++)
			phi[i] = Gaussian.phi(i, mean, stddev);
		StdStats.plotLines(phi);
	}
}