
public class LoadBalance {
	
	public static void main(String[] args) {
		//assign N items to M servers, using
		//shortest-in-a-sample (of size S) policy
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		int S = Integer.parseInt(args[2]);

		//create server queues
		RandomQueue<Queue<Integer>> servers;
		servers = new RandomQueue<Queue<Integer>>();
		for (int i = 0; i < M; i++)
			servers.enqueue(new Queue<Integer>());

		for (int j = 0; j < N; j++) {
			//assign an item to a server
			Queue<Integer> min = servers.sample();
			for (int k = 1; k < S; k++) {
				//pick a random server, update if a  new min
				Queue<Integer> q = servers.sample();
				if (q.length() < min.length()) min = q;
			} //min is the shortest server queue
			min.enqueue(j);
		}

		int i = 0;
		double[] lengths = new double[M];
		for (Queue<Integer> q : servers)
			lengths[i++] = q.length();
		StdDraw.setYscale(0, 2.0*N/M);
		StdStats.plotBars(lengths);
	}
}