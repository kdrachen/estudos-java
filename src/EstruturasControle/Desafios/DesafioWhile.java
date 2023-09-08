package EstruturasControle.Desafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = 0;
        double nota = 0;
        double total = 0;

        while(nota != -1) {
            System.out.print("Informe a nota: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                quantidade++;
            } else if(nota != -1) {
                System.out.println("Nota inválida!!!! ;D");
            }
        }

        // Calcular média

        double media = total / quantidade;
        System.out.println("Média = " + media);

        entrada.close();
    }
}
