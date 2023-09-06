package Fundamentos.ProgramasCB;

import java.util.Scanner;

public class CelsiusFahrenheit {

    public static void main(String[] args) {
        // Fórmula (0 °C × 9/5) + 32 = 32 °F

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura Celsius: ");
        int celsius = entrada.nextInt();

        double conversao = (celsius * 9 / 5) + 32;

        System.out.println(conversao);
        entrada.close();
    }
}
