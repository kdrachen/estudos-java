package Lambdas;

@FunctionalInterface
public interface Calculo {
    // public abstract
    double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String massa() {
        return "massa";
    }
}
