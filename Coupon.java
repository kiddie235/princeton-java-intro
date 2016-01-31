public class Coupon {
	public static int uniform(int N) {
		//generate a random integer between 0 and N-1
		return (int) (Math.random() * N);
	}

	public static int collect(int N) {
		//collect coupons until getting one of each value
		boolean[] found = new boolean[N];
		int cardcnt = 0, valcnt = 0;
		while (valcnt < N) {
			int val = uniform(N);
			cardcnt++;
			if (!found[val]) valcnt++;
			found[val] = true;
		}
		return cardcnt; 
	}

	public static void main(String[] args) {
		//print the number of coupons collected
		//to get N different coupons
		int N = Integer.parseInt(args[0]);
		int count = collect(N);
		StdOut.println(count);
	}
}
