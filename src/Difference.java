public class Difference extends Function {
    private Function f;
    private Function g;
    private Polynomial newFunction;

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
        subtractFunctions();
    }

    private void subtractFunctions() {
        if (f.getClass().getSimpleName().equals("Polynomial")) {
            if (g.getClass().getSimpleName().equals("Polynomial"))
                newFunction = ((Polynomial)f).subtract((Polynomial)g);
            else newFunction = ((Polynomial)f).subtract((Constant) g, true);
        } else if (g.getClass().getSimpleName().equals("Polynomial"))
            newFunction = ((Constant)f).subtract((Polynomial)g);
        else newFunction = ((Constant)f).subtract((Constant) g, true);
    }

    private void turnToString() {
        super.setFunction(f.toString() + " - " + g.toString());
    }

    @Override
    public double valueAt(double x) {
        return newFunction.valueAt(x);
    }

    @Override
    public String derivative() {
        return "(" + f.derivative() + " - " + g.derivative() + ")";
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
    public String taylorPolynomial(int n) {
        return newFunction.taylorPolynomial(n);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
