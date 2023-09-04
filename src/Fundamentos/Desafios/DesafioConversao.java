package Fundamentos.Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        /*
        * Usar Scanner pegar 3 String
        * Converter para número
        * Receber 3 salário e calcular média
        * Conseguir usar , e .
        * */

        Scanner lerUm = new Scanner(System.in);
        Scanner lerDois = new Scanner(System.in);
        Scanner lerTres = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salarioUm = lerUm.nextLine().replace(",", ".");

        System.out.print("Digite o segundo salário: ");
        String salarioDois = lerDois.nextLine().replace(",", ".");

        System.out.print("Digite o terceiro salário: ");
        String salarioTres = lerTres.nextLine().replace(",", ".");

        double converterUm = Double.parseDouble(salarioUm);
        double converterDois = Double.parseDouble(salarioDois);
        double converterTres = Double.parseDouble(salarioTres);

        double media = (converterUm + converterDois + converterTres) / 3;
        System.out.printf("A média dos 3 salários é: %.2f", media);
    }
}
