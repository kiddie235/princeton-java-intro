
public class Cat {

	public static void main(String[] args) {
		//copy input files to out (last argument)
		Out out = new Out(args[args.length-1]);
		for (int i = 0; i < args.length - 1; i++) {
			//copy input file named on ith arg to out
			In in = new In(args[i]);
			String s = in.readAll();
			out.println(s);
		}
	}
}