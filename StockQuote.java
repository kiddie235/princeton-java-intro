
public class StockQuote {

	public static double price(String symbol) {
		//return current stock price for symbol
		In page = new In("http://finance.yahoo.com/q?s=" + symbol);
		String in = page.readAll();
		int trade = in.indexOf("yfs_l84_", 0);
		int from = in.indexOf("\">", trade);
		int to = in.indexOf("</span>", from);
		String price = in.substring(from + 2, to);
		return Double.parseDouble(price);
	}

	public static void main(String[] args) {
		StdOut.println(price(args[0]));
	}
}