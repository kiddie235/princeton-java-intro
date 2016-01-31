public class Sqrt {
	
	public static void main(String[] args) {
		//compute square root of a number C using Newton's method
		double c = Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		double t = c;

		while (Math.abs(t - c/t) > epsilon * t) {
			//replace t by the average of t anc c/t
			t = (c/t + t) / 2.0;
		}
		System.out.println(t);
	}
}