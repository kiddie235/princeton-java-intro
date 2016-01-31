public class MaxPowerOfTwo {
	
	public static void main(String[] args) {
		//prints the first N powers of 2
		int N = Integer.parseInt(args[0]);
		int v = 1;
		while (v <= N/2) {
			//print ith power of 2
			v = 2 * v;
		}
		System.out.println(v);
	}
}