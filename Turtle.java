
public class Turtle {
	private double x, y;
	private double angle;

	public Turtle(double x0, double y0, double a0) {
		x = x0; y = y0; angle = a0;
	}

	public void turnLeft(double delta) {
		angle += delta;
	}

	public void goForward(double step) {
		//compute new position, move and draw line to it
		double oldx = x, oldy = y;
		x += step * Math.cos(Math.toRadians(angle));
		y += step * Math.sin(Math.toRadians(angle));
		StdDraw.line(oldx, oldy, x, y);
	}

	public static void main(String[] args) {
		//draw an N-gon
		int N = Integer.parseInt(args[0]);
		double angle = 360.0 / N;
		double step = Math.sin(Math.toRadians(angle/2));
		Turtle turtle = new Turtle(.5, .0, angle/2);
		for (int i = 0; i < N; i++) {
			turtle.goForward(step);
			turtle.turnLeft(angle);
		}
	}
}
