package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        int vendas = 1000;
        double lucroVendas = 12349.23123;
        System.out.printf("A quantidade de vendas: %s\nLucro: %.2f\n", vendas, lucroVendas);

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String lerRes = ler.nextLine();
        System.out.printf("Você digitou %s.", lerRes);
    }
}
