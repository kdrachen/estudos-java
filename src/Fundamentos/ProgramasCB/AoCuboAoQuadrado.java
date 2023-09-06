package Fundamentos.ProgramasCB;

import java.util.Scanner;

public class AoCuboAoQuadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um número para elevar ao quadrado: ");
        int quadrado = entrada.nextInt();
        quadrado = (int) Math.pow(quadrado, 2);

        System.out.printf("Digite um número para elevar ao cubo: ");
        int cubo = entrada.nextInt();
        cubo = (int) Math.pow(cubo, 3);

        System.out.printf("Ao quadrado: %s\nAo cubo: %s", quadrado, cubo);

        entrada.close();
    }
}
