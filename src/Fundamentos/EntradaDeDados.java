package Fundamentos;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = ler.nextInt();

        System.out.printf("%s tem %d anos", nome, idade);
        ler.close();

    }
}
