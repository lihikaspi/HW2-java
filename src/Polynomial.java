public class Polynomial extends Function {
    private final double[] coefficients;


    public Polynomial(double...  coefficients) {
        super(turnToString()); // turn to string
        this.coefficients = coefficients;
    }

    private String turnToString() {
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
        return func;
    }
    public double valueAt(double x) {

    }
    public String derivative() {

    }
    public double bisectionMethod(double a, double b, double epsilon) {

    }
    public double bisectionMethod(double a, double b) {

    }
    public double newtonRaphsonMethod(double a, double epsilon) {

    }
    public double newtonRaphsonMethod(double a) {

    }
    public double taylorPolynomial(int n) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
