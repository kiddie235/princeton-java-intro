
public class Complex {
	private final double re;
	private final double im;

	public Complex(double real, double imag) {
		re = real; im = imag;
	}

	public Complex plus(Complex b) {
		//return the sum of this number and b
		double real = re + b.re;
		double imag = im + b.im;
		return new Complex(real, imag);
	}

	public Complex times(Complex b) {
		//return the product of this number and b
		double real = re * b.re - im * b.im;
		double imag = re * b.im + im * b.re;
		return new Complex(real, imag);
	}

	public Complex abs()

	public static void main(String[] args) {
		
	}
}
