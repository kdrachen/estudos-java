package EstruturasControle.ProgramasCM;

import java.util.Scanner;

public class ImprimirLetraPorLetra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite algo: ");
        String ler = entrada.next();

        for (int i = 0; i <= ler.length() - 1; i++) {
            System.out.println(ler.charAt(i));
        }

        entrada.close();
    }
}
