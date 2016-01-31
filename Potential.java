import java.awt.Color;

public class Potential {

	public static void main(String[] args) {
		//read charges from StdIn into a[]
		int N = StdIn.readInt();
		Charge[] a = new Charge[N];
		for (int k = 0; k < N; k++) {
			double x0 = StdIn.readDouble();
			double y0 = StdIn.readDouble();
			double q0 = StdIn.readDouble();
			a[k] = new Charge(x0, y0, q0);
		}

		//create and show image depicting potential values
		int size = 512;
		Picture pic = new Picture(size, size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				//compute pixel color
				double x = (double) i / size;
				double y = (double) j / size;
				double V = 0.0;
				for (int k = 0; k < N; k++)
					V += a[k].potentialAt(x, y);
				int g = 128 + (int) (V / 2.0e10);
				if (g < 0) 		g = 0;
				if (g > 255) 	g = 255;
				Color c = new Color(g, g, g);
				pic.set(i, size-1-j, c);
			}
		}
		pic.show();
	}
}