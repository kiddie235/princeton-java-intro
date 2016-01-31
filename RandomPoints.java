public class RandomPoints {
	//a StdRandom test client
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		for (int i = 0; i < N; i++) {
			double x = StdRandom.gaussian(.5, .2);
			double y = StdRandom.gaussian(.5, .2);
			StdDraw.point(x, y);
		}
	}
}