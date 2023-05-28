public class Polynomial extends Function {
    private final double[] coefficients;


    public Polynomial(double...  coefficients) {
        super();
        this.coefficients = coefficients;
        turnToString();
    }

    private void turnToString() {
        String func = "";
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] == 0) continue;
            if (coefficients[i]%1 == 0) {
                if (i == 0) func += (int)coefficients[i];
                else func += (int)coefficients[i] + "x^" + i;
            } else {
                if (i == 0) func += coefficients[i];
                else func += coefficients[i] + "x^" + i;
            }
        }
        super.setFunction(func);
    }

    @Override
    public double valueAt(double x) {

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
