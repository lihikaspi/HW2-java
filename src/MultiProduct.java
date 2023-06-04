public class MultiProduct extends Function {
    private final Function[] functions;

    public MultiProduct(Function... functions) {
        super();
        this.functions = functions;
        // TODO: turn to string
    }

    @Override
    public double valueAt(double x) {
        double sum = 0;
        for (Function function : functions) {
            sum *= function.valueAt(x);
        }
        return sum;
    }

    @Override
    public String derivative() {
        String derivative = "(";
        for (int i = 0; i < functions.length; i++) {
            derivative += functions[i].derivative();
            for (int j = 0; j < functions.length; j++) {
                if (i == j) continue;
                derivative += " * " + functions[j].toString();
            }
            derivative += " + ";
        }
        return derivative + ")";
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
        return super.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
