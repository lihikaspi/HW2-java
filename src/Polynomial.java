import java.util.concurrent.ExecutionException;

public class Polynomial extends Function{
    private double[] coefficients;
    private Polynomial derivative;

    public Polynomial(double co1, double...  coefficients) {
        this.coefficients = new double[coefficients.length+1];
        this.coefficients[0] = co1;
        for (int i = 0; i < coefficients.length; i++) {
            this.coefficients[i+1] = coefficients[i];
        }
        turnToString();
    }

    public Polynomial(Function function) {
        // TODO: build copy constructor
    }

    @Override
    public void setFunction(String function) {
        super.setFunction(function);
    }

    public Polynomial getDerivative() {
        return this.derivative;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    private void turnToString() {
        String func = "";
        String temp;
        for (int i = 0; i < coefficients.length; i++) {
            // find the different powers
            if (coefficients[i] == 0) continue;
            boolean sign  = coefficients[i] > 0;
            if ((coefficients[i] == 1.0 || coefficients[i] == -1.0) && i != 0) {
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
            // build the function string
            if (!sign) {
                if (func.equals("")) func += "-" + temp;
                else func += " - " + temp;
            } else {
                if (func.equals("")) func += temp;
                else func += " + " + temp;
            }
        }
        super.setFunction(func);
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
    public String derivative() {
        if (coefficients.length == 1) {
            derivative = new Polynomial(0);
            return derivative.toString();
        }
        double[] newCoefficients;
        double co1 = 0;
        if (coefficients.length != 1) {
            newCoefficients = new double[coefficients.length - 2];
            co1 = coefficients[1];
        }
        else newCoefficients = new double[0];
        for (int i = 2; i < coefficients.length; i++) {
            newCoefficients[i-2] = coefficients[i] * i;
        }
        derivative =  new Polynomial(co1, newCoefficients);
        super.setDerivative(this.derivative);
        return derivative.toString();
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
        if (n == 0) {
            if (coefficients[0]%1 == 0){
                return "("+(int)coefficients[0] + ")";
            } else {
                return "(" + coefficients[0] + ")";
            }
        }
        if (n >= coefficients.length) return toString();
        double[] newCoefficients = new double[n];
        double co1 = coefficients[0];
        for (int i = 1; i <= n; i++) {
            newCoefficients[i-1] = coefficients[i];
        }
        return new Polynomial(co1, newCoefficients).toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
