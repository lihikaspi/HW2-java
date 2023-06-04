public class Polynomial extends Function{
    private double[] coefficients;
    private Polynomial derivative;

    public Polynomial() {
        coefficients = null;
    }

    public Polynomial(double...  coefficients) {
        super();
        this.coefficients = coefficients;
        turnToString();
    }

    public Polynomial(Function function) {
        // TODO: build copy constructor
    }

    public void setCoefficients(Polynomial polynomial) {
        this.coefficients = polynomial.getCoefficients();
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
            if ((coefficients[i] == 1 || coefficients[i] == -1) && i != 0) temp = "x^" + i;
            if (coefficients[i] % 1 == 0) {
                if (i == 0) temp = Math.abs((int)coefficients[i]) + "";
                else temp = Math.abs((int)coefficients[i]) + "x^" + i;
            } else {
                if (i == 0) temp = Math.abs(coefficients[i]) + "";
                else temp = Math.abs(coefficients[i]) + "x^" + i;
            }
            // build the function string
            if (!sign) {
                func += "- " + temp;
            } else {
                if (i == 0) func += temp;
                else func += "+ " + temp;
            }
        }
        super.setFunction(func);
    }

    @Override
    public double valueAt(double x) {
        int sum = 0;
        for (int i = 0; i < coefficients.length; i++) {
            sum += coefficients[i] * Math.pow(x, i);
        }
        return sum;
    }

    @Override
    public String derivative() {
        double[] newCoefficients = new double[coefficients.length-1];
        for (int i = 1; i < coefficients.length; i++) {
            newCoefficients[i-1] = coefficients[i] * i;
        }
        derivative =  new Polynomial(newCoefficients);
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
        if (n == 0) return coefficients[0] + "";
        if (n >= coefficients.length) return toString();
        double[] newCoefficients = new double[n+1];
        for (int i = 0; i <= n; i++) {
            newCoefficients[i] = coefficients[i];
        }
        return new Polynomial(newCoefficients).toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
