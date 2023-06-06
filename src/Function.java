public abstract class Function {
    protected String function;
    protected Function derivative; // TODO: switch to protected ???

    public Function() {
        this.function = null;
        this.derivative = null;
    }

    public abstract double valueAt(double x);
    public abstract String derivative();
    public double bisectionMethod(double a, double b, double epsilon){
        double left = a;
        double right = b;
        while(right - left > epsilon) {
            double mid = (left + right) / 2;
            if (valueAt(right) * valueAt(mid) > 0)
                left = mid;
            else right = mid;
        }
        return (left + right) / 2;
    }
    public double bisectionMethod(double a, double b){
        double left = a;
        double right = b;
        double epsilon = Math.pow(10, -5);
        while(right - left > epsilon) {
            double mid = (left + right) / 2;
            if (valueAt(right) * valueAt(mid) > 0)
                left = mid;
            else right = mid;
        }
        return (left + right) / 2;
    }
    public double newtonRaphsonMethod(double a, double epsilon){
        double x = a;
        while(Math.abs(valueAt(x)) >= epsilon) {
            x = x - (valueAt(x) / derivative.valueAt(x));
        }
        return x;
    }
    public double newtonRaphsonMethod(double a){
        double x = a;
        double epsilon = Math.pow(10, -5);
        while(Math.abs(valueAt(x)) >= epsilon) {
            x = x - (valueAt(x) / derivative.valueAt(x));
        }
        return x;
    }
    public String taylorPolynomial(int n) {
        double[] coefficients = new double[n];
        double co1 = valueAt(0);
        Function derivativeI = this.derivative;
        for (int i = 1; i <= n; i++) {
            double factorial = factorial(i);
            coefficients[i-1] = derivativeI.valueAt(0) / factorial;
            derivativeI.derivative();
            derivativeI = derivativeI.derivative;
        }
        return new Polynomial(co1, coefficients).toString();
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
