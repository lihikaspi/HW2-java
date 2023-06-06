public class Product extends Function{
    private final Function f;
    private final Function g;

    public Product(Function f, Function g) {
        this.f = f;
        this.g = g;
        turnToString();
    }

    private void turnToString() {
        super.setFunction(f.toString() + " * " + g.toString());
    }

    @Override
    public double valueAt(double x) {
        return (f.valueAt(x) * g.valueAt(x));
    }

    @Override
    public String derivative() {
        String derivative = "((" + f.derivative() + " * " + g.toString() + ") + (" + g.derivative() + " * " + f.toString() + "))";
        super.setDerivative(new Sum(new Product(f.getDerivative(), g), new Product(g.getDerivative(), f)));
        return derivative;
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
    public String taylorPolynomial(int n) {
        return super.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
