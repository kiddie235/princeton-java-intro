
public class MD1Queue {
	
	public static void main(String[] args) {
		double lambda 	= Double.parseDouble(args[0]);
		double mu 		= Double.parseDouble(args[0]);
		Histogram hist 	= new Histogram(60 + 1);
		Queue<Double> queue = new Queue<Double>();
		double nextArrival = StdRandom.exp(lambda);
		double nextService = nextArrival + 1/mu;
		while (true) {
			while (nextArrival < nextService) {
				//simulate an arrival
				queue.enqueue(nextArrival);
				nextArrival += StdRandom.exp(lambda);
			} //arrivals done; simulate a service
			double wait = nextService - queue.dequeue();
			StdDraw.clear();
			hist.addDataPoint(Math.min(60, (int) (wait)));
			hist.draw();
			StdDraw.show(20);
			if (queue.isEmpty())
				nextService = nextArrival + 1/mu;
			else
				nextService = nextService + 1/mu;
		}
	}
}