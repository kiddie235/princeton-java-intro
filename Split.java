
public class Split {

	public static void main(String[] args) {
		//split file by column into N files
		String name = args[0];
		int N = Integer.parseInt(args[1]);
		String delim = ",";

		//create output streams
		Out[] out = new Out[N];
		for (int i = 0; i < N; i++)
			out[i] = new Out(name + i + ".txt");
		In in = new In(name + ".csv");
		while (!in.isEmpty()) {
			//read a line and write fields to output streams
			String line = in.readLine();
			String[] fields = line.split(delim);
			for (int i = 0; i < N; i++)
				out[i].println(fields[i]);
		}
	}
}