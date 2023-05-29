public class Sum extends Function {
    private Function f;
    private Function g;

    public Sum(Function f, Function g) {
        super();
        this.f = f;
        this.g = g;
        turnToString();
    }

    private void turnToString() {
        // TODO: turn to string
    }

    @Override
    public double valueAt(double x) {
        return f.valueAt(x) + g.valueAt(x);
    }

    @Override
    public String derivative() {
        String derivative = f.derivative() + g.derivative();
        // TODO: fix string
        return derivative;
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
    public double taylorPolynomial(int n) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
