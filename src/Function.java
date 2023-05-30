public abstract class Function {
    private String function;

    public Function() {
        this.function = null;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public abstract double valueAt(double x);
    public abstract String derivative();
    public abstract double bisectionMethod(double a, double b, double epsilon);
    public abstract double bisectionMethod(double a, double b);
    public abstract double newtonRaphsonMethod(double a, double epsilon);
    public abstract double newtonRaphsonMethod(double a);
    public abstract String taylorPolynomial(int n);

    @Override
    public String toString() {
        return "(" + this.function + ")";
    }
}
