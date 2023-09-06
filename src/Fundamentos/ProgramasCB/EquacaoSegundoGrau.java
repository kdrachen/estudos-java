package Fundamentos.ProgramasCB;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        // Programa para resolver equações do segundo grau
        // a = 1, b = -6 e c = 5

        int a = 1;
        int b = -6;
        int c = 5;

        double delta = Math.pow(b, 2) - (4 * a) * c;
        delta = Math.sqrt(delta);

        double x = -(b) + delta;
        x /= 2;

        double x2 = -(b) - delta;
        x2 /= 2;

        System.out.printf("{%.0f,%.0f}", x2, x);
    }
}
