
import java.lang.Math;

public class ArrayReversal {
	
	public static void main(String[] args) {
		//N is number for array size
		int N = 10;
		
		double[] a = new double[N];
		for (int i = 0; i < N; i++) {
			a[i] = Math.random();
			System.out.print(a[i]);
			System.out.println();
		}
		//copy array to a different array
		System.out.println("----- new array b ------");
		double[] b = new double[N];
		for (int i = 0; i < N; i++) {
			b[i] = a[i];
			System.out.print(b[i]);
			System.out.println();
		}


		//time to print reversed array
		System.out.println(" ---- printing array reversal ---");
		for (int i = 0; i < N/2; i++) {
			//use temp variable to do exchange during each iteration
			double temp = b[i];
			b[i] = b[N-1-i];
			b[N-1-i] = temp;
		}
		//print b - which has been reversed
		for (int i = 0; i < N; i++) {
			System.out.println(b[i]);
		}
	}
}