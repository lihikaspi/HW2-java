/**
 * This class represents a constant function
 * Inherits from abstract class Function
 */
public class Constant extends Function {
    private final double value;

    /**
     * Constructs a new Constant object
     *
     * @param value constant value
     */
    public Constant(double value) {
        this.value = value;
    }

    @Override
    protected String turnToString(){
        if (value%1 == 0) return Integer.toString((int)value);
        return Double.toString(value) ;
    }

    @Override
    public double valueAt(double x) {
        return value;
    }

    @Override
    public Function derivative() {
        return new Constant(0);
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {
        return a;
    }

    @Override
    public double bisectionMethod(double a, double b) {
        return a;
    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {
        return a;
    }

    @Override
    public double newtonRaphsonMethod(double a) {
        return a;
    }

    @Override
    public Function taylorPolynomial(int n) {
        return this;
    }

    @Override
    public String toString() {
        return "(" + turnToString() + ")";
    }
}
