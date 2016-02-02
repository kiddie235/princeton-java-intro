
public class DrunkenTurtles {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int T = Integer.parseInt(args[1]);
		double step = Double.parseDouble(args[2]);
		Turtle[] turtles = new Turtle[N];
		for (int i = 0; i < N; i++)
			turtles[i] = new Turtle(Math.random(), Math.random(), 0.0);
		for (int t = 0; t < T; t++)
			//all turtles take one step
			for (int i = 0; i < N; i++) {
				//turtle i takes one step in a random direction
				turtles[i].turnLeft(360.0 * Math.random());
				turtles[i].goForward(step);
			}
	}
}
