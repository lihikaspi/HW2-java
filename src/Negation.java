public class Negation extends Function {
    private final Function function;

    public Negation(Function function) {
        this.function = function;
        turnToString();
    }

    private void turnToString() {
        super.function = "-" + function.toString();
    }

    @Override
    public double valueAt(double x) {
        return -(function.valueAt(x));
    }

    @Override
    public Function derivative() {
        return new Negation(function.derivative());
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
        return super.toString();
    }
}
