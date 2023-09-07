package EstruturasControle.Desafios;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        // Digitar domingo -> 1
        // segunda -> 2
        // terça -> 3
        // quarta -> 4
        // quinta -> 5
        // sexta -> 6
        // sábado -> 7

        Scanner entrada = new Scanner(System.in);
        System.out.print("Dia da semana: ");
        String dia = entrada.nextLine();

        if(dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if(dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if(dia.equalsIgnoreCase("terça")) {
            System.out.println(3);
        } else if(dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        } else if(dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        } else if(dia.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        } else if(dia.equalsIgnoreCase("sábado")) {
            System.out.println(7);
        } else {
            System.out.println("Digite um dia da semana válido.");
        }

        entrada.close();
    }
}
