public abstract class Function {
    public Function() {
    }

    protected abstract String turnToString();
    /**
     * Calculate value of function at a certain point
     * @param x X to calculate function at
     * @return Value of function at given x
     */
    public abstract double valueAt(double x);

    /**
     * Calculate derivative
     * @return Function representing derivative
     */
    public abstract Function derivative();

    /**
     * Calculates root of function between two values with epsilon error using bisection method
     * @param a Left-most value
     * @param b Right-most value
     * @param epsilon Epsilon of error
     * @return Root value
     */
    public double bisectionMethod(double a, double b, double epsilon){
        double left = a;
        double right = b;
        while(right - left > epsilon) {
            double mid = (left + right) / 2;
            if (valueAt(left) * valueAt(mid) > 0)
                left = mid;
            else right = mid;
        }
        return (left + right) / 2;
    }

    /**
     * Calculates root of function between two values with default epsilon error using bisection method
     * @param a Left-most value
     * @param b Right-most value
     * @return Root value
     */
    public double bisectionMethod(double a, double b){
        double left = a;
        double right = b;
        double epsilon = Math.pow(10, -5);
        while(right - left > epsilon) {
            double mid = (left + right) / 2;
            if (valueAt(left) * valueAt(mid) > 0)
                left = mid;
            else right = mid;
        }
        return (left + right) / 2;
    }

    /**
     * Calculates root of function in area of certain point with epsilon error using Newton-Raphson method
     * @param a Value to find root around
     * @param epsilon Epsilon of error
     * @return Root value
     */
    public double newtonRaphsonMethod(double a, double epsilon){
        double x = a;
        while(Math.abs(valueAt(x)) >= epsilon) {
            x -= (valueAt(x) / derivative().valueAt(x));
        }
        return x;
    }

    /**
     * Calculates root of function in area of certain point with default epsilon error using Newton-Raphson method
     * @param a Value to find root around
     * @return Root value
     */
    public double newtonRaphsonMethod(double a){
        double x = a;
        double epsilon = Math.pow(10, -5);
        while(Math.abs(valueAt(x)) >= epsilon) {
            x -= (valueAt(x) / derivative().valueAt(x));
        }
        return x;
    }

    /**
     * Calculate Taylor polynomial of a certain order for function
     * @param n Order of Taylor polynomial to calculate
     * @return Taylor polynomial
     */
    public Function taylorPolynomial(int n) {
        double[] coefficients = new double[n];
        double co1 = valueAt(0);
        Function derivativeI = derivative();
        for (int i = 1; i <= n; i++) {
            double factorial = factorial(i);
            coefficients[i-1] = derivativeI.valueAt(0) / factorial;
            derivativeI = derivativeI.derivative();
        }
        return new Polynomial(co1, coefficients);
    }

    /**
     * Calculate factorial of a number
     * @param n Value to calculate factorial of
     * @return Double representing factorial
     */
    private double factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public abstract String toString();
}
