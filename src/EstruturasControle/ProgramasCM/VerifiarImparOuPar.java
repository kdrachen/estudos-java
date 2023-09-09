package EstruturasControle.ProgramasCM;

import java.util.Scanner;

public class VerifiarImparOuPar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número: ");
        int num = entrada.nextInt();

        if (num >= 0 && num <= 10) {
            System.out.println("Está entre 0 e 10!");
            if (num % 2 == 0) {
                System.out.println("É Par!");
            }
        } else {
            System.out.println("Seu número não está entre 0 e 10!");
        }

        entrada.close();
    }
}
