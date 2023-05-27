public class Sum extends Function {
    private Function f;
    private Function g;

    public Sum(Function f, Function g) {
        super();
        this.f = f;
        this.g = g;
        // TODO: turn to string
    }

    public double valueAt(double x) {
        return f.valueAt(x) + g.valueAt(x);
    }
    public String derivative() {

    }
    public double bisectionMethod(double a, double b, double epsilon) {

    }
    public double bisectionMethod(double a, double b) {

    }
    public double newtonRaphsonMethod(double a, double epsilon) {

    }
    public double newtonRaphsonMethod(double a) {

    }
    public double taylorPolynomial(int n) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
