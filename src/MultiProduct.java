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
        MultiProduct[] mp = new MultiProduct[functions.length-2];
        MultiProduct mp1 = null;
        MultiProduct mp2 = null;
        String derivative = "(";
        int r = 0;
        for (int i = 0; i < functions.length; i++) {
            derivative += functions[i].derivative();
            Function[] fs = new Function[functions.length-1];
            int k = 0;
            for (int j = 0; j < functions.length; j++) {
                if (i == j) continue;
                derivative += " * " + functions[j].toString();
                fs[k] = functions[j];
                k++;
            }
            derivative += " + ";
            Function[] new_fs = new Function[functions.length-2];
            for (int t = 0; t < new_fs.length; t++) {
                new_fs[t] = fs[t+1];
            }
            if (i == 0) mp1 = new MultiProduct(functions[i].getDerivative(), fs[0], new_fs);
            else if (i == 1) mp2 = new MultiProduct(functions[i].getDerivative(), fs[0], fs);
            else {
                mp[r] = new MultiProduct(functions[i].getDerivative(), fs[0], fs);
                r++;
            }
        }
        super.setDerivative(new MultiSum(mp1, mp2, mp));
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
