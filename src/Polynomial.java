public class Polynomial extends Function implements AddMultiply {
    private final double[] coefficients;

    public Polynomial(double...  coefficients) {
        super();
        this.coefficients = coefficients;
        super.setFunction(turnToString());
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    private String turnToString() {
        // TODO: add + and - between powers
        String func = "";
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] == 0) continue;
            if (coefficients[i] == 1 && i != 0) func += "x^" + i;
            if (coefficients[i] == 1 && i != 0) func += "-x^" + i;
            if (coefficients[i]%1 == 0) {
                if (i == 0) func += (int)coefficients[i];
                else func += (int)coefficients[i] + "x^" + i;
            } else {
                if (i == 0) func += coefficients[i];
                else func += coefficients[i] + "x^" + i;
            }
        }
        return func;
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
