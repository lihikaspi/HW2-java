/**
 * This class represents a polynomial
 * Inherits from abstract class Function
 */
public class Polynomial extends Function{
    private final double[] coefficients;

    /**
     * Constructs a new Polynomial object
     *
     * @param co1 first coefficient
     * @param coefficients other coefficients
     */
    public Polynomial(double co1, double...  coefficients) {
        this.coefficients = new double[coefficients.length+1];
        this.coefficients[0] = co1;
        for (int i = 0; i < coefficients.length; i++) {
            this.coefficients[i+1] = coefficients[i];
        }
    }

    /**
     * Checks if all the coefficients are zero meaning the polynomial is empty
     *
     * @return Is without non-zero coefficients
     */
    private boolean emptyPoly(){
        for (double coefficient : coefficients) {
            if (coefficient != 0) return false;
        }
        return true;
    }

    @Override
    protected String turnToString() {
        String func = "";
        String temp;

        // checks if polynomial is empty --> poly = 0
        if (emptyPoly()) {
            return "0";
        }

        for (int i = 0; i < coefficients.length; i++) {
            // finds the different powers
            if (coefficients[i] == 0) continue;
            boolean sign  = coefficients[i] > 0; // + or - before the coefficient
            if ((coefficients[i] == 1.0 || coefficients[i] == -1.0) && i != 0) {
                // no need to print the coefficient before "x"
                if (i == 0) temp = 1 + "";
                if (i == 1) temp = "x";
                else temp = "x^" + i;
            }
            else if (coefficients[i] % 1 == 0) {
                if (i == 0) temp = Math.abs((int)coefficients[i]) + "";
                else if (i == 1) temp = Math.abs((int)coefficients[i]) + "x";
                else temp = Math.abs((int)coefficients[i]) + "x^" + i;
            } else {
                if (i == 0) temp = Math.abs(coefficients[i]) + "";
                else if (i == 1) temp = Math.abs(coefficients[i]) + "x";
                else temp = Math.abs(coefficients[i]) + "x^" + i;
            }
            // builds the function string
            if (!sign) {
                if (func.equals("")) func += "-" + temp;
                else func += " - " + temp;
            } else {
                if (func.equals("")) func += temp;
                else func += " + " + temp;
            }
        }
        return func;
    }

    @Override
    public double valueAt(double x) {
        double sum = 0;
        for (int i = 0; i < coefficients.length; i++) {
            sum += coefficients[i] * Math.pow(x, i);
        }
        return sum;
    }

    @Override
    public Function derivative() {
        if (coefficients.length == 1) return new Constant(0);
        double[] newCoefficients;
        double co1 = 0;

        newCoefficients = new double[coefficients.length - 2];
        co1 = coefficients[1];

        for (int i = 2; i < coefficients.length; i++) {
            newCoefficients[i-2] = coefficients[i] * i;
        }
        return new Polynomial(co1, newCoefficients);
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
    public Function taylorPolynomial(int n) {
        if (n >= coefficients.length) return this;
        double[] newCoefficients = new double[n];
        double co1 = coefficients[0];
        for (int i = 1; i <= n; i++) {
            newCoefficients[i-1] = coefficients[i];
        }
        return new Polynomial(co1, newCoefficients);
    }

    @Override
    public String toString() {
        return "(" + turnToString() + ")";
    }
}
