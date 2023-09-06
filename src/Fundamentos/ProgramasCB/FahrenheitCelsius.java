package Fundamentos.ProgramasCB;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FahrenheitCelsius {

    public static void main(String[] args) {
        // Fórmula (32 °F − 32) × 5/9 = 0 °C

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura Fahrenheit: ");
        int fahrenheit = entrada.nextInt();

        double conversao = (fahrenheit - 32) * 5 / 9;

        System.out.println(conversao);
        entrada.close();
    }
}
