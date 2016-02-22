
public class PhiInverse {
	//this implementation of phiInverse() for Gaussian
	//uses the binary search to compute

	public static void PhiInverse(double y) {
		return PhiInverse(y, .00000001, -8, 8);
	}

	private static double PhiInverse(double y, double delta, double lo, double hi) {
		//compute x with Phi(x) = y
		double mid = lo + (hi - lo) / 2;
		if (hi - lo < delta) return mid;
		if (Phi(mid) > y) 
			return PhiInverse(y, delta, lo, mid);
		else return PhiInverse(y, delta, mid, hi);
	}
	
}