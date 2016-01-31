import java.awt.Color;

public class Luminance {

	public static double lum(Color color) {
		//compute the luminance of color
		int r = color.getRed();
		int g = color.getGreen();
		int b = color.getBlue();
		return .299*r + .587*g + .114*b;
	}

	public static Color toGray(Color color) {
		//use Luminance to convert to GrayScale
		int y = (int) Math.round(lum(color));
		Color gray = new Color(y, y, y);
		return gray;
	}

	public static boolean compatible(Color a, Color b) {
		//print true if colors are compatible, false otherwise
		return Math.abs(lum(a) - lum(b)) >= 128;
	}

	public static void main(String[] args) {
		//are the two given RGB colors compatible?
		int[] a = new int[6];
		for (int i = 0; i < 6; i++)
			a[i] = Integer.parseInt(args[i]);
		Color c1 = new Color(a[0], a[1], a[2]);
		Color c2 = new Color(a[3], a[4], a[5]);
		StdOut.println(compatible(c1, c2));
	}
}