public class CouponCollector {
	
	public static void main(String[] args) {
		//generate random numbers from (0..N-1) until finding each one
		int N = Integer.parseInt(args[0]);
		boolean[] found = new boolean[N];
		//cardCnt - values generated, valCnt - different values found
		int cardCnt = 0, valCnt = 0;
		while (valCnt < N) {
			//generate another value
			int val = (int) (Math.random() * N);
			cardCnt++;
			if (!found[val]) {
				valCnt++;
				found[val] = true;
			}
		}//N different values found
		System.out.println(cardCnt);
	}
}