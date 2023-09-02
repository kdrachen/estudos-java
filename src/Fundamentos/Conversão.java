package Fundamentos;

public class Conversão {
    public static void main(String[] args) {
        double a = 1; // Conversão implícita
        System.out.println(a);

        float b = (float) 1.12345; // Conversão explícita (CAST)
        System.out.println(b);

        int c = 140;
        byte d = (byte) c; // Conversão explícita (CAST)
        System.out.println(d);

        double e = 1.999;
        int f = (int) e; // Conversão explícita (CAST)
        System.out.println(f);
    }
}
