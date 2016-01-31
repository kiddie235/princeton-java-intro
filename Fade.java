import java.awt.Color;

public class Fade {
	public static Color blend(Color c, Color d, double alpha) {
		//compute blend of c and d, weighted by x
		double r = (1-alpha)*c.getRed() + alpha*d.getRed();
		double g = (1-alpha)*c.getGreen() + alpha*d.getGreen();
		double b = (1-alpha)*c.getBlue() + alpha*d.getBlue();
		return new Color((int) r, (int) g, (int) b);
	}

	public static void main(String[] args) {
		//show M-image fade sequence from source to target
		Picture source = new Picture(args[0]);
		Picture target = new Picture(args[1]);
		int M = Integer.parseInt(args[2]);
		int width = source.width();
		int height = source.height();
		Picture pic = new Picture(width, height);
		for (int t = 0; t <= M; t++) {
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					Color c0 = source.get(x, y);
					Color cM = target.get(x, y);
					Color c = blend(c0, cM, (double) t/M);
					pic.set(x, y , c);
				}
			}
		}
		pic.show();
	}
}