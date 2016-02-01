
public class Histogram {
	private final double[] freq;
	private double max;

	public Histogram(int N) {
		//create a new Histogram
		freq = new double[N];
	}

	public void addDataPoint(int i) {
		//add one occurence of the value i
		freq[i]++;
		if (freq[i] > max) max = freq[i];
	}

	public void draw() {
		//draw (and scale) the histogram
		StdDraw.setYscale(0, max);
		StdStats.plotBars(freq);
	}

	public static void main(String[] args) {
		//see program Bernoulli.java
		int N = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);
		Histogram histogram = new Histogram(N+1);
		for (int t = 0; t < T; t++)
			histogram.addDataPoint(Bernoulli.binomial(N));
		StdDraw.setCanvasSize(500, 100);
		//StdDraw.clear();
		histogram.draw();
		//StdDraw.show(200);
		//remove comments to make dynamically changing histogram
	}
}