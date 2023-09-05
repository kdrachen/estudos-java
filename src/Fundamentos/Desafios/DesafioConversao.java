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

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salarioUm = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o segundo salário: ");
        String salarioDois = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o terceiro salário: ");
        String salarioTres = entrada.nextLine().replace(",", ".");

        double converterUm = Double.parseDouble(salarioUm);
        double converterDois = Double.parseDouble(salarioDois);
        double converterTres = Double.parseDouble(salarioTres);
        double media = (converterUm + converterDois + converterTres) / 3;

        System.out.printf("A média dos 3 salários é: %.2f", media);
        entrada.close();
    }
}
