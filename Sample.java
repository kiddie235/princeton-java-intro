
public class Sample {
	
	public static void main(String[] args) {
		//print a random sample of M integers
		//from 0 ... N-1 (no duplicates)
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		int[] perm = new int[N];

		//initialize perm[]
		for (int i = 0; i < N; i++) {
			perm[i] = i;
		}

		//Take sample
		for (int i = 0; i < M; i++) {
			//exchange perm[i] with a random element to its right
			int r = i + (int) (Math.random() * (N - i));
			int temp = perm[i];
			perm[i] = perm[r];
			perm[r] = temp;
		}

		//print sample
		for (int j = 0; j < M; j++) 
			System.out.print(perm[j] + " ");
		System.out.println();
	}
}