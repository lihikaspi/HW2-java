public class MultiSum extends Function {
    private final Function[] functions;

    public MultiSum(Function... functions) {
        super();
        this.functions = functions;
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
        String derivative = "(";
        for (int i = 0; i < functions.length; i++) {
            derivative += functions[i].derivative();
        }
        return derivative + ")";
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
