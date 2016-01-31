public class ChargeClient {
	public static void main(String[] args) {
		//print total potential at (x,y)
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		Charge c1 = new Charge(.51, .63, 21.3);
		Charge c2 = new Charge(.13, .94, 81.9);
		double v1 = c1.potentialAt(x, y);
		double v2 = c2.potentialAt(x, y);
		StdOut.printf("%.1e\n", v1+v2); 
	}
}