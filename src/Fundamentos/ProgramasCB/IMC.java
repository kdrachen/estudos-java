package Fundamentos.ProgramasCB;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {
        // Calcular IMC

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura: ");
        String altura = entrada.next().replace(",", ".");
        double converter = Double.parseDouble(altura);
        converter *= converter;
        double calculoIMC = peso / converter;

        System.out.printf("Peso: %.2f\nAltura: %s\nIMC: %.2f", peso, altura, calculoIMC);

        entrada.close();
    }
}
