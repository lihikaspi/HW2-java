public class Constant extends Function {
    private final double constant;

    public Constant(double constant) {
        super(Double.toString(constant));
        this.constant = constant;
    }

    public double valueAt(double x) {
        return constant;
    }

    public String derivative() {
        return "0";
    }

    // what to return ???????
    public double bisectionMethod(double a, double b, double epsilon) {
        return a;
    }

    public double bisectionMethod(double a, double b) {
        return a;
    }

    public double newtonRaphsonMethod(double a, double epsilon) {
        return a;
    }

    public double newtonRaphsonMethod(double a) {
        return a;
    }

    public double taylorPolynomial(int n) {
        return constant;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
