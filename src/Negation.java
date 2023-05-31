public class Negation extends Function {
    private final Function function;

    public Negation(Function function) {
        super();
        this.function = function;
        turnToString();
    }

    private void turnToString() {
        super.setFunction("-" + function.toString());
    }

    @Override
    public double valueAt(double x) {
        return (-1) * function.valueAt(x);
    }

    @Override
    public String derivative() {
        return "(-" + function.derivative() + ")";
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {

    }

    @Override
    public double bisectionMethod(double a, double b) {

    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {

    }

    @Override
    public double newtonRaphsonMethod(double a) {

    }

    @Override
    public String taylorPolynomial(int n) {
        return "(-" + function.taylorPolynomial(n) + ")";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
