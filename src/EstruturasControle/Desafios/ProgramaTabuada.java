package EstruturasControle.Desafios;

import java.util.Scanner;

public class ProgramaTabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int tabu = entrada.nextInt();

        for(int i = 0; i < 11; i++) {
            int tabuada = tabu * i;

            System.out.printf("%d * %d: %d\n", tabu, i, tabuada);
        }

        entrada.close();
    }
}
