public class Quotient extends Function {
    private final Function f;
    private final Function g;

    public Quotient(Function f, Function g) {
        // f / g
        super();
        this.f = f;
        this.g = g;
        turnToString();
    }

    @Override
    public void setDerivative(Function derivative) {
        super.setDerivative(derivative);
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
        Power bottom = new Power(g, 2);
        super.setDerivative(new Quotient(new Difference(
                new Product(f.getDerivative(), g), new Product(f, g.getDerivative())), bottom));
        return "(((" + f.derivative() + " * " + g.toString() +
                ") - (" + f.toString() + " * " + g.derivative() + ")) / (" +
                bottom.toString() + ")";
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {
        return f.bisectionMethod(a, b, epsilon);
    }

    @Override
    public double bisectionMethod(double a, double b) {
        return f.bisectionMethod(a, b);
    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {
        return f.newtonRaphsonMethod(a, epsilon);
    }

    @Override
    public double newtonRaphsonMethod(double a) {
        return f.newtonRaphsonMethod(a);
    }

    @Override
    public String taylorPolynomial(int n) {
        return super.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
