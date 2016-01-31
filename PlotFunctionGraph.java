public class PlotFunctionGraph {
	
	public static void main(String[] args) {
		int N = 50;
		double[] a = new double[N+1];
		for (int i = 0; i <= N; i++)
			a[i] = Gaussian.phi(-4.0 + 8.0*i/N);
		StdStats.plotPoints(a);
		StdStats.plotLines(a);
	}
}