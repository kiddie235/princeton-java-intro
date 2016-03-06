
public class DeDup {
	
	public static void main(String[] args) {
		//filter out duplicate strings
		SET<String> distinct = new SET<String>();
		while (!StdIn.isEmpty()) {
			//read a string, ignore if duplicate
			String key = StdIn.readString();
			if (!distinct.contains(key)) {
				//save and print new string
				distinct.add(key);
				StdOut.print(key + " ");
			}
		}
	}
}