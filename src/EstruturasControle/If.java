package EstruturasControle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a média: ");
        String media = entrada.next().replace(",", ".");
        double converter = Double.parseDouble(media);

        if(converter >= 7.0) {
            System.out.println("Aprovado!");
        }

        entrada.close();
    }
}
