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

    @Override
    public double valueAt(double x) {
        return Math.pow(function.valueAt(x), power);
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
