public class Power extends Function {
    private final int power;
    private final Function function;

    public Power(Function function,int power) {
        this.function = function;
        this.power = power;
        turnToString();
    }

    private void turnToString() {
        super.function = function.toString() + "^" + power;
    }

    @Override
    public double valueAt(double x) {
        return Math.pow(function.valueAt(x), power);
    }

    @Override
    public String derivative() {
        function.derivative();
        super.derivative = new MultiProduct(new Constant(power), function.derivative, new Power(function, power-1));
        String derivative;
        if (power == 1)  derivative = "(" + power + " * " + function.derivative() + ")";
        else derivative = "(" + power + " * "+ function.derivative() +
                " * " + function.toString() + "^" + (power-1) + ")";
        return derivative;
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
        return super.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
