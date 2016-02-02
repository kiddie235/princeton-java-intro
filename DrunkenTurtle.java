
public class DrunkenTurtle {
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		double step = Double.parseDouble(args[1]);
		Turtle turtle = new Turtle(0.5, 0.5, 0.0);
		for (int t = 0; t < T; t++) {
			turtle.turnLeft(360.0 * Math.random());
			turtle.goForward(step);
		}
	}
}