package Fundamentos;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.print("Digite sua idade: ");
        String idade = ler.nextLine();

        System.out.printf("Meu nome é %s, tenho %s anos.", nome, idade);
    }
}
