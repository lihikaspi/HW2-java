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
        return "((" + f.derivative() + " * " + g.toString() +
                " - " + f.toString() + " * " + g.derivative() + ") / " +
                new Power(g, 2).toString() + ")";
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
        double[] coefficients = new double[n];
        coefficients[0] = valueAt(0);
        for (int i = 1; i <= n; i++) {
            double factorial = factorial(n);
            // coefficients[i] = derivative(number i).valueAt(0) / factorial;
        }
        return new Polynomial(coefficients).toString();
    }

    private int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
