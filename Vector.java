
public class Vector {
    private final double[] coords;

    public Vector(double[] a) {
        //make a defensive copy to ensure immutability
        coords = new double[a.length];
        for (int i = 0; i < a.length; i++)
            coords[i] = a[i];
    }

    public Vector plus(Vector b) {
        //sum of this vector and vector b
        double[] c = new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            c[i] = coords[i] + b.coords[i];
        return new Vector(c);
    }

    public Vector times(double t) {
        //product of this vector and scalar t
        double[] c = new double[coords.length];
        for (int i = 0; i < coords.length; i++)
            c[i] = t * coords[i];
        return new Vector(c);
    }

    public double dot(Vector b) {
        //dot product of this vector and b
        double sum = 0.0;
        for (int i = 0; i < coords.length; i++)
            sum = sum + (coords[i] * b.coords[i]);
        return sum;
    }

    public double magnitude() {
        return Math.sqrt(this.dot(this));
    }

    public Vector direction() {
        return this.times(1/this.magnitude());
    }

    public double cartesian(int i) {
        return coords[i];
    }
}