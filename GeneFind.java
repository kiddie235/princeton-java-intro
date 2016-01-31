
public class GeneFind {

	public static void main(String[] args) {
		//use start and stop to find genes in genome
		String start = args[0];
		String stop = args[1];
		String genome = StdIn.readAll();
		int beg = -1;
		for (int i = 0; i < genome.length() - 2; i++) {
			//check next codon for start or stop
			String codon = genome.substring(i, i+3);
			if (codon.equals(start)) beg = i;
			if (codon.equals(stop) && beg != -1) {
				//check putative gene alignment
				String gene = genome.substring(beg+3, i);
				if (gene.length() % 3 == 0) {
					//print and restart
					StdOut.println(gene);
					beg = -1;
				}
			}
		}
	}
}