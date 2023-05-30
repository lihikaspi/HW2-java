public class Power extends Function {
    private final int power;
    private final Function function;
    private Polynomial newFunction; // TODO: represent new function as polynomial --how?

    public Power(Function function,int power) {
        super();
        this.function = function;
        this.power = power;
        turnToString();
    }

    private void turnToString() {
        super.setFunction(function.toString() + "^" + power);
    }

    @Override
    public double valueAt(double x) {
        return Math.pow(function.valueAt(x), power);
    }

    @Override
    public String derivative() {
        String derivative;
        if (power == 1)  derivative = "(" + power + " * " + function.derivative() + ")";
        else derivative = "(" + power + " * "+ function.derivative() +
                " * " + function.toString() + "^" + (power-1) + ")";
        return derivative;
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
