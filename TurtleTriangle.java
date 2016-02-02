
public class TurtleTriangle {
	
	public static void main(String[] args) {
		double x0 = 0.5;
		double y0 = 0.0;
		double a0 = 60;
		double step = Math.sqrt(3)/2;
		Turtle t = new Turtle(x0, y0, a0);
		t.goForward(step);
		t.turnLeft(120.0);
		t.goForward(step);
		t.turnLeft(120.0);
		t.goForward(step);
	}
}