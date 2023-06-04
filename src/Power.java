public class Power extends Function {
    private final int power;
    private final Function function;
    private Function newFunction; // TODO: represent new function as polynomial --how?

    public Power(Function function,int power) {
        super();
        this.function = function;
        this.power = power;
        turnToString();
        if (power > 2) {
            Function[] functions = new Function[power];
            for (int i = 0; i < power; i++)
                functions[i] = function;
            this.newFunction = new MultiProduct(functions);
        } else if (power == 2) this.newFunction = new Product(function, function);
        else if (power == 1) this.newFunction = new Polynomial(function);
        else if (power == 0) this.newFunction = new Constant(1);
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
        return newFunction.bisectionMethod(a, b, epsilon);
    }

    @Override
    public double bisectionMethod(double a, double b) {
        return newFunction.bisectionMethod(a, b);
    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {
        return newFunction.newtonRaphsonMethod(a, epsilon);
    }

    @Override
    public double newtonRaphsonMethod(double a) {
        return newFunction.newtonRaphsonMethod(a);
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
