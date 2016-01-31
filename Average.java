public class Average {
	
	public static void main(String[] args) {
		//Average the numbers on the input stream
		double sum = 0.0;
		int cnt = 0;

		while (!StdIn.isEmpty()) {
			double val = StdIn.readDouble();
			sum += val;
			cnt++;
		}

		double average = sum / cnt;

		StdOut.println("Average is " + average);
	}
}