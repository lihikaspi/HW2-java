public interface AddMultiply {
    Polynomial add(Polynomial function);
    Polynomial add(Constant constant);
    Polynomial multiply(Polynomial function);
    Polynomial multiply(Constant constant);
}
