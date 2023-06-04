public class Constant extends Function {
    private final double value;

    public Constant(double value) {
        this.value = value;
        super.setFunction(Double.toString(value));
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public double valueAt(double x) {
        return value;
    }

    @Override
    public String derivative() {
        super.setDerivative(new Constant(0));
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
    public String taylorPolynomial(int n) {
        return toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
