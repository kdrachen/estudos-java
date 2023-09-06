package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - / %

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite a operação: ");
        String simbolo = entrada.next();

        double resultado = "+".equals(simbolo) ? num1 + num2 : 0;
        resultado = "-".equals(simbolo) ? num1 - num2 : resultado;
        resultado = "/".equals(simbolo) ? num1 / num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, simbolo, num2, resultado);

        entrada.close();
    }
}
