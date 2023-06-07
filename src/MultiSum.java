public class MultiSum extends Function {
    private final Function[] functions;

    public MultiSum(Function func1, Function func2, Function... funcs) {
        this.functions = new Function[funcs.length+2];
        this.functions[0] = func1;
        this.functions[1] = func2;
        for (int i = 0; i < funcs.length; i++) {
            this.functions[i+2] = funcs[i];
        }
    }

    @Override
    protected String turnToString() {
        String function = "";
        for (int i = 0; i < functions.length; i++) {
            function += functions[i].toString();
            if (i != functions.length-1) function += " + ";
        }
        return function;
    }

    @Override
    public double valueAt(double x) {
        double sum = 0;
        for (int i = 0; i < functions.length; i++) {
            sum += functions[i].valueAt(x);
        }
        return sum;
    }

    @Override
    public Function derivative() {
        Function[] derivatives = new Function[functions.length-2];
        Function der1 = functions[0].derivative();
        Function der2 = functions[1].derivative();
        for (int i = 2; i < functions.length; i++) {
            derivatives[i-2] = functions[i].derivative();
        }
        return new MultiSum(der1, der2, derivatives);
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
