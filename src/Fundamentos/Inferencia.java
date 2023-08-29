package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        var a = 4.5;
        System.out.println(a);

        /*
        * - Errado -
        * var a;
        * a = 12.5;
        * Da erro, para realizar a inferência precisa declarar e ja inicializar ela.
        *
        * - Certo -
        * var a = 12.5;
        * */
    }
}
