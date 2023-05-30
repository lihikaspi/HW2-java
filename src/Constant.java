public class Constant extends Function implements AddMultiply {
    private final double value;

    public Constant(double value) {
        super(); // need to do this???
        this.value = value;
        super.setFunction(Double.toString(value));
    }

    public double getValue() {
        return this.value;
    }

    @Override
    public Polynomial add(Polynomial function) {
        // constant + polynomial
        return function.add(this);
    }

    @Override
    public Polynomial add(Constant constant) {
        // constant + constant
        return new Polynomial(this.value + constant.getValue());
    }

    @Override
    public Polynomial multiply(Polynomial function) {
        // constant * polynomial
        return function.multiply(this);
    }

    @Override
    public Polynomial multiply(Constant constant) {
        // constant * constant
        return new Polynomial(this.value * constant.getValue());
    }

    @Override
    public double valueAt(double x) {
        return value;
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
        return value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
