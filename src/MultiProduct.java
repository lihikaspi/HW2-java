public class MultiProduct extends Function {
    private final Function[] functions;

    public MultiProduct(Function func1, Function func2, Function... funcs) {
        super();
        this.functions = new Function[funcs.length+2];
        this.functions[0] = func1;
        this.functions[1] = func2;
        for (int i = 0; i < funcs.length; i++) {
            this.functions[i+2] = funcs[i];
        }
        turnToString();
    }

    public void turnToString() {
        String func = "(";
        for (int i = 0; i < functions.length; i++) {
            func += functions[0].toString();
            if (i != functions.length-1) func += " + ";
        }
        super.setFunction(func);
    }

    @Override
    public double valueAt(double x) {

        double sum = 0;
        for (Function function : functions) {
            sum *= function.valueAt(x);
        }
        return sum;
    }

    @Override
    public String derivative() {

        String derivative = "(";
        for (int i = 0; i < functions.length; i++) {
            derivative += functions[i].derivative();
            for (int j = 0; j < functions.length; j++) {
                if (i == j) continue;
                derivative += " * " + functions[j].toString();
            }
            derivative += " + ";
        }
        return derivative + ")";
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {
        return super.bisectionMethod(a,b, epsilon);
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
