public abstract class Function {
    private String function;
    private Function derivative; // TODO: switch to protected ???

    public Function() {
        this.function = null;
    }

    public void setDerivative(Function derivative) {
        this.derivative = derivative;
    }

    public Function getDerivative() {
        return derivative;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public abstract double valueAt(double x);
    public abstract String derivative();
    public abstract double bisectionMethod(double a, double b, double epsilon);
    public abstract double bisectionMethod(double a, double b);
    public abstract double newtonRaphsonMethod(double a, double epsilon);
    public abstract double newtonRaphsonMethod(double a);
    public String taylorPolynomial(int n) {
        double[] coefficients = new double[n+1];
        Function derivativeI = this.derivative;
        coefficients[0] = valueAt(0);
        for (int i = 1; i <= n; i++) {
            double factorial = factorial(n);
            coefficients[i] = derivativeI.valueAt(0) / factorial;
            derivativeI = derivativeI.getDerivative();
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
        return "(" + this.function + ")";
    }
}
