public class PlotDataSample {
	
	public static void main(String[] args) {
		int N = 20;
		double[] a = new double[N];
		for (int i = 0; i < N; i++)
			a[i] = 1.0 /(i+1);
		StdStats.plotPoints(a);
		//StdStats.plotLines(a);
		//StdStats.plotBars(a);
	}
}