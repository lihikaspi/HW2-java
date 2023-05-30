public class Quotient extends Function {
    private final Function f;
    private final Function g;

    public Quotient(Function f, Function g) {
        super();
        this.f = f;
        this.g = g;
        turnToString();
    }

    private void turnToString() {
        super.setFunction(f.toString() + " / " + g.toString());
    }

    @Override
    public double valueAt(double x) {
        return (f.valueAt(x)) / (g.valueAt(x));
    }

    @Override
    public String derivative() {
        return "(" + f.derivative() + " / " + g.derivative() + ")";
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
