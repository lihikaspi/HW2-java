public class MultiSum extends Polynomial {
    // TODO: maybe was not supposed to inherit from Polynomial ??
    private final Function[] functions;

    public MultiSum(Function... functions) {
        super();
        this.functions = functions;
        addFunctions();
        turnToString();
    }

    private void addFunctions() {
        super.setCoefficients(Polynomial.add(functions));
    }

    private void turnToString() {
        String function = "";
        for (int i = 0; i < functions.length; i++) {
            function += functions[i].toString();
            if (i != functions.length-1) function += " + ";
        }
        super.setFunction(function);
    }

    @Override
    public double valueAt(double x) {
        int sum = 0;
        for (int i = 0; i < functions.length; i++) {
            sum += functions[i].valueAt(x);
        }
        return sum;
    }

    @Override
    public String derivative() {
        String derivative = "(";
        for (int i = 0; i < functions.length; i++) {
            derivative += functions[i].derivative();
        }
        return derivative + ")";
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
