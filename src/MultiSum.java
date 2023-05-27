public class MultiSum extends Function {
    private Function[] functions;
    private Function sumFunction;

    public MultiSum(Function... functions) {
        this.functions = functions;
    }

    public double valueAt(double x) {
        int sum = 0;
        for (int i = 0; i < functions.length; i++) {
            sum += functions[i].valueAt(x);
        }
        return sum;
    }

    public String derivative() {

    }

    public double bisectionMethod(double a, double b, double epsilon) {

    }

    public double bisectionMethod(double a, double b) {

    }

    public double newtonRaphsonMethod(double a, double epsilon) {

    }

    public double newtonRaphsonMethod(double a) {

    }

    public double taylorPolynomial(int n) {

    }

    @Override
    public String toString() {

    }
}
