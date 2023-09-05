package Fundamentos.Desafios;

public class OpAritmeticos {

    public static void main(String[] args) {

        /*
        * Math.pow(var, num) para elevar a um número
        * imagem https://imgur.com/0HknYQf
        * */

        // Divisor geral
        int dez = (int) Math.pow(10, 3);

        // Esquerda
        int cimaEsq = (int) Math.pow(6 * (3 + 2), 2);
        int resEsq = cimaEsq / (3 * 2);

        // Direita
        int resDir = (int) Math.pow(((1 - 5) * (2 - 7)) / 2, 2);

        // Resultado
        int resGeral = (int) Math.pow(resEsq - resDir, 3);
        int resultado = resGeral / dez;

        System.out.printf("Resultado: %s", resultado);

    }
}
