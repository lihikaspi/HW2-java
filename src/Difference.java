public class Difference extends Polynomial {
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
        subtractFunctions();
        turnToString();
    }

    private void subtractFunctions() {
        if (f.getClass().getSimpleName().equals("Polynomial")) {
            if (g.getClass().getSimpleName().equals("Polynomial"))
                super.setCoefficients(((Polynomial)f).subtract((Polynomial)g));
            else super.setCoefficients(((Polynomial)f).subtract((Constant) g, true));
        } else if (g.getClass().getSimpleName().equals("Polynomial"))
            super.setCoefficients(((Constant)f).subtract((Polynomial)g));
        else super.setCoefficients(((Constant)f).subtract((Constant) g, true));
    }

    private void turnToString() {
        super.setFunction(f.toString() + " - " + g.toString());
    }

    @Override
    public double valueAt(double x) {
        return super.valueAt(x);
    }

    @Override
    public String derivative() {
        return "(" + f.derivative() + " - " + g.derivative() + ")";
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
