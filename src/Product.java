/**
 * This class represents a product between two functions
 * Inherits from abstract class Function
 */
public class Product extends Function{
    private final Function f;
    private final Function g;

    /**
     * Constructs a new Product object
     * Receives only two functions
     *
     * @param f first function
     * @param g second function
     */
    public Product(Function f, Function g) {
        this.f = f;
        this.g = g;
    }

    @Override
    protected String turnToString() {
        return f.toString() + " * " + g.toString();
    }

    @Override
    public double valueAt(double x) {
        return (f.valueAt(x) * g.valueAt(x));
    }

    @Override
    public Function derivative() {
        return new Sum(new Product(f.derivative(), g), new Product(g.derivative(), f));
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
