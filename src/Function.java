public abstract class Function {

    public Function() {
        //TODO: constructor for abstract class?????????
    }
    public abstract double valueAt(int x);
    public abstract String derivative();
    public abstract double bisectionMethod(int a, int b, double epsilon);
    public abstract double bisectionMethod(int a, int b);
    public abstract double newtonRaphsonMethod(int a, double epsilon);
    public abstract double newtonRaphsonMethod(int a);
    public abstract double taylorPolynomial(int n);
    @Override
    public String toString() {

    }
}
