package Fundamentos.Operadores;

public class OpUnarios {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++; // a = a + 1;
        a--; // a = a - 1;

        ++b; // b = b + 1;
        --b; // b = b - 1;

        // b-- está com menos pressa que o ++a, sou seja, a operação foi feita e dps foi decrementado 1 do b
        System.out.println(++a == b--);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
