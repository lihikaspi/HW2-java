public class Power extends Function {
    private final int power;
    private final Function function;

    public Power(Function function,int power) {
        this.function = function;
        this.power = power;
    }

    private String turnToString() {
        return function.toString() + "^" + power;
    }

    @Override
    public double valueAt(double x) {
        return Math.pow(function.valueAt(x), power);
    }

    @Override
    public Function derivative() {
        if (power-1 == 0) return function.derivative();
        else return new MultiProduct(new Constant(power), new Power(function, power-1), function.derivative());
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
    public Function taylorPolynomial(int n) {
        return super.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return "(" + turnToString() + ")";
    }
}
