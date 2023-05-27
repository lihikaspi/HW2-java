public class Power extends Function {
    private int power;
    private Function function;

    public Power(Function function,int power) {
        super();
        this.function = function;
        this.power = power;
        turnToString();
    }

    private void turnToString() {
        super.setFunction(function.getFunction() + "^" + power);
    }

    public double valueAt(double x) {
        return Math.pow(function.valueAt(x), power);
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
