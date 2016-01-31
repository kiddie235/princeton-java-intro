public class RandomSeq {
	
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		
		for (int i = 0; i < N; i++) {
			int rand = (int) (Math.random() * N);

			System.out.println(rand);

		}
	}
}