public class Constant extends Function {
    private final double constant;

    public Constant(double constant) {
        super(); // need to do this???
        this.constant = constant;
        super.setFunction(Double.toString(constant));
    }

    @Override
    public double valueAt(double x) {
        return constant;
    }

    @Override
    public String derivative() {
        return "0";
    }

    // what to return ???????
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
    public double taylorPolynomial(int n) {
        return constant;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
