public class Difference extends Function {
    private Function f;
    private Function g;

    /**
     * constructor - assuming the difference is f-g
     * @param f first
     * @param g second
     */
    public Difference(Function f, Function g){
        super();
        this.f = f;
        this.g = g;
        turnToString();
    }

    private void turnToString() {
        String diff = // TODO: calculate the difference function and set in Function class
        super.setFunction(diff);
    }

    @Override
    public double valueAt(double x) {
        // f - g
        return f.valueAt(x) - g.valueAt(x);
    }

    @Override
    public String derivative() {

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
