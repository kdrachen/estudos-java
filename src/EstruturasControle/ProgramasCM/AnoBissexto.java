package EstruturasControle.ProgramasCM;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        double ano = entrada.nextDouble();

        if (ano % 4 == 0) {
            System.out.println("Ano bissexto!");
        } else {
            System.out.println("Não é ano bissexto!");
        }

        entrada.close();
    }
}
