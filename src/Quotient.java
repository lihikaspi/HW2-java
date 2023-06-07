/**
 * This class represents a quotient between two function
 * Inherits from abstract class Function
 */
public class Quotient extends Function {
    private final Function f;
    private final Function g;

    /**
     * Constructs a new Quotient object
     *
     * @param f numerator
     * @param g denominator
     */
    public Quotient(Function f, Function g) {
        this.f = f;
        this.g = g;
    }

    @Override
    protected String turnToString() {
        return f.toString() + " / " + g.toString();
    }

    @Override
    public double valueAt(double x) {
        return (f.valueAt(x)) / (g.valueAt(x));
    }

    @Override
    public Function derivative() {
        return new Quotient(new Difference(new Product(f.derivative(), g),
                new Product(g.derivative(), f)), new Power(g, 2));
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {
        return f.bisectionMethod(a, b, epsilon);
    }

    @Override
    public double bisectionMethod(double a, double b) {
        return f.bisectionMethod(a, b);
    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {
        return f.newtonRaphsonMethod(a, epsilon);
    }

    @Override
    public double newtonRaphsonMethod(double a) {
        return f.newtonRaphsonMethod(a);
    }

    @Override
    public Function taylorPolynomial(int n) {
        return super.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return "(" + turnToString() + ")";
    }
}
