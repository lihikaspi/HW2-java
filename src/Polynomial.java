public class Polynomial extends Function implements AddMultiply {
    private final double[] coefficients;

    public Polynomial(double...  coefficients) {
        super();
        this.coefficients = coefficients;
        turnToString();
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    private void turnToString() {
        String func = "";
        String temp;
        boolean sign = true;
        for (int i = 0; i < coefficients.length; i++) {
            // find the different powers
            if (coefficients[i] == 0) continue;
            if (coefficients[i] > 0) sign = true;
            else sign = false;
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
    public Polynomial add(Polynomial function) {
        // polynomial + polynomial
        double[] newCoefficients = new double[coefficients.length];
        double[] funcCoefficients = function.getCoefficients();
        for (int i = 1; i < coefficients.length; i++)
            newCoefficients[i] = coefficients[i] + funcCoefficients[i];
        return new Polynomial(newCoefficients);
    }

    @Override
    public Polynomial add(Constant constant) {
        // polynomial + constant
        double[] newCoefficients = new double[coefficients.length];
        newCoefficients[0] = coefficients[0] + constant.getValue();
        for (int i = 1; i < coefficients.length; i++)
            newCoefficients[i] = coefficients[i];
        return new Polynomial(newCoefficients);
    }

    @Override
    public Polynomial multiply(Polynomial function) {
        // polynomial * polynomial
        // TODO
    }

    @Override
    public Polynomial multiply(Constant constant) {
        // polynomial * constant
        double[] newCoefficients = new double[coefficients.length];
        for (int i = 0; i < coefficients.length; i++)
            newCoefficients[i] = coefficients[i] * constant.getValue();
        return new Polynomial(newCoefficients);
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
        return new Polynomial(newCoefficients).toString();
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
    public double taylorPolynomial(int n) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
