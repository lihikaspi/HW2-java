public class Constant extends Function {
    private final double constant;

    public Constant(double constant) {
        super();
        this.constant = constant;
    }

    public double valueAt(int x) {
        return constant;
    }

    public String derivative() {
        return "0";
    }

    public double bisectionMethod(int a, int b, int epsilon) {
        return a;
    }

    public double bisectionMethod(int a, int b) {
        return a;
    }

    public double newtonRaphsonMethod(int a, int epsilon) {
        return a;
    }

    public double newtonRaphsonMethod(int a) {
        return a;
    }

    public double taylorPolynomial(int n) {
        return constant;
    }

    @Override
    public String toString() {
        return "(" + constant + ")";
    }
}
