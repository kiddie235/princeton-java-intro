
public class Stopwatch {
	private final long start; //creation time

	public Stopwatch() {
		start = System.currentTimeMillis();
	}

	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);

		double totalMath = 0.0;
		Stopwatch swMath = new Stopwatch();
		for (int i = 0; i < N; i++)
			totalMath += Math.sqrt(i);
		double timeMath = swMath.elapsedTime();

		double totalNewton = 0.0;
		Stopwatch swNewton = new Stopwatch();
		for (int i = 0; i < N; i++)
			totalNewton += Newton.sqrt(i);
		double timeNewton = swNewton.elapsedTime();

		StdOut.println(totalNewton/totalMath);
		StdOut.println(timeNewton/timeMath);
	}
}