public class Difference extends Function {
    private Function f;
    private Function g;

    /**
     * constructor - assuming the difference is f-g
     * @param f first
     * @param g second
     */
    public Difference(Function f, Function g){
        super(differenceFunction());
        this.f = f;
        this.g = g;
    }

    private String differenceFunction() {
        String diff = // TODO: calculate the difference function and send to Function class
        return diff;
    }

    public double valueAt(double x) {
        // f - g
        return f.valueAt(x) - g.valueAt(x);
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
        return super.toString();
    }
}
