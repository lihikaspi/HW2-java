public class Sum extends Function {
    private final Function f;
    private final Function g;
    private Polynomial newFunction;

    public Sum(Function f, Function g) {
        super();
        this.f = f;
        this.g = g;
        addFunctions();
        turnToString();
    }

    private void turnToString() {
        super.setFunction(f.toString() + " + " + g.toString());
    }

    private void addFunctions() {
        if (f.getClass().getSimpleName().equals("Polynomial")) {
            if (g.getClass().getSimpleName().equals("Polynomial"))
                newFunction = ((Polynomial)f).add((Polynomial)g);
            else newFunction = ((Polynomial)f).add((Constant) g);
        } else if (g.getClass().getSimpleName().equals("Polynomial"))
            newFunction = ((Constant)f).add((Polynomial)g);
        else newFunction = ((Constant)f).add((Constant) g);
    }

    @Override
    public double valueAt(double x) {
        return newFunction.valueAt(x);
    }

    @Override
    public String derivative() {
        return "(" + f.derivative() + " + " + g.derivative() + ")";
    }

    @Override
    public double bisectionMethod(double a, double b, double epsilon) {
        return newFunction.bisectionMethod(a, b, epsilon);
    }

    @Override
    public double bisectionMethod(double a, double b) {
        return newFunction.bisectionMethod(a, b);
    }

    @Override
    public double newtonRaphsonMethod(double a, double epsilon) {
        return newFunction.newtonRaphsonMethod(a, epsilon);
    }

    @Override
    public double newtonRaphsonMethod(double a) {
        return newFunction.newtonRaphsonMethod(a);
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
