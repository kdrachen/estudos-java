package ArraysCollections.Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas você quer informar: ");
        int quantidade = entrada.nextInt();
        double[] notas = new double[quantidade];
        double contador = 0;

        for (int i = 0; i <= notas.length - 1; i++) {
            System.out.printf("Digite a %d nota: ", i + 1);
            String quantidadeDois = entrada.next().replace(",", ".");
            double quantidadeTres = Double.parseDouble(quantidadeDois);
            notas[i] += quantidadeTres;
            contador += quantidadeTres;
        }

        double media = contador / notas.length;
        System.out.println("O Array ficou: " + Arrays.toString(notas));
        System.out.printf("Media da notas: %.2f.\n", media);

        entrada.close();
    }
}
