public class MultiProduct extends Function {
    private final Function[] functions;

    public MultiProduct(Function func1, Function func2, Function... funcs) {
        this.functions = new Function[funcs.length+2];
        this.functions[0] = func1;
        this.functions[1] = func2;
        for (int i = 0; i < funcs.length; i++) {
            this.functions[i+2] = funcs[i];
        }
    }

    @Override
    protected String turnToString() {
        String func = "";
        for (int i = 0; i < functions.length; i++) {
            func += functions[i].toString();
            if (i != functions.length-1) func += " * ";
        }
        return func;
    }

    @Override
    public double valueAt(double x) {
        double sum = 1;
        for (int i = 0; i < functions.length; i++) {
            sum *= functions[i].valueAt(x);
        }
        return sum;
    }

    @Override
    public Function derivative() {
        MultiProduct[] mp = new MultiProduct[functions.length-2];
        MultiProduct mp1 = null;
        MultiProduct mp2 = null;
        for (int i = 0; i < functions.length; i++) {
            Function[] funcs = new Function[functions.length-1];
            int t = 0;
            for (int j = 0; j < functions.length; j++) {
                if (i != j) {
                    funcs[t] = functions[j];
                    t++;
                }
            }
            Function func1 = funcs[0];
            Function[] new_funcs = new Function[functions.length-2];
            for (int k = 0; k < funcs.length-1; k++) {
                new_funcs[k] = funcs[k+1];
            }
            functions[i].derivative();
            if (i == 0) mp1 = new MultiProduct(functions[i].derivative(), func1, new_funcs);
            if (i == 1) mp2 = new MultiProduct(functions[i].derivative(), func1, new_funcs);
            else if (i >= 2) mp[i-2] = new MultiProduct(functions[i].derivative(), func1, new_funcs);
        }
        return new MultiSum(mp1, mp2, mp);
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
    public Function taylorPolynomial(int n) {
        return super.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return "(" + turnToString() + ")";
    }
}
