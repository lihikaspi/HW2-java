/**
 * This class represents a sum of two functions
 * Inherits from abstract class Function
 */
public class Sum extends Function {
    private final Function f;
    private final Function g;

    /**
     * Constructs a new Sum object
     * Receives only two functions
     *
     * @param f first function
     * @param g second function
     */
    public Sum(Function f, Function g) {
        this.f = f;
        this.g = g;
    }

    @Override
    protected String turnToString() {
        return f.toString() + " + " + g.toString();
    }

    @Override
    public double valueAt(double x) {
        return f.valueAt(x) + g.valueAt(x);
    }

    @Override
    public Function derivative() {
        return new Sum(f.derivative(), g.derivative());
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {
        return super.bisectionMethod(a, b, epsilon);
    }

    @Override
    public double bisectionMethod(double a, double b) {
        return super.bisectionMethod(a, b);
    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {
        return super.newtonRaphsonMethod(a, epsilon);
    }

    @Override
    public double newtonRaphsonMethod(double a) {
        return super.newtonRaphsonMethod(a);
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
