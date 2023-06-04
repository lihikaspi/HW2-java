public class MultiSum extends Function {
    private final Function[] functions;

    public MultiSum(Function func1, Function func2, Function... funcs) {
        this.functions = new Function[funcs.length+2];
        this.functions[0] = func1;
        this.functions[1] = func2;
        for (int i = 0; i < funcs.length; i++) {
            this.functions[i+2] = funcs[i];
        }
        turnToString();
    }

    private void turnToString() {
        String function = "";
        for (int i = 0; i < functions.length; i++) {
            function += functions[i].toString();
            if (i != functions.length-1) function += " + ";
        }
        super.setFunction(function);
    }

    @Override
    public double valueAt(double x) {
        int sum = 0;
        for (int i = 0; i < functions.length; i++) {
            sum += functions[i].valueAt(x);
        }
        return sum;
    }

    @Override
    public String derivative() {
        Function[] derivatives = new Function[functions.length];
        String derivative = "(";
        for (int i = 0; i < functions.length; i++) {
            derivative += functions[i].derivative();
            derivatives[i] = functions[i].getDerivative();
        }
        super.setDerivative(new MultiSum(derivatives[0], derivatives[1], derivatives));
        return derivative + ")";
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
