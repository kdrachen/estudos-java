package Fundamentos.ProgramasCB;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Base do triangulo: ");
        int base = entrada.nextInt();

        System.out.printf("Altura do triangulo: ");
        int altura = entrada.nextInt();

        double area = (base * altura) / 2;
        System.out.printf("A área do triangulo é: %.2f", area);

        entrada.close();
    }
}
