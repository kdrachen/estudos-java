package Fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {
        String v1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String v2 = JOptionPane.showInputDialog("Digite o segundo número");
        double num1 = Double.parseDouble(v1);
        double num2 = Double.parseDouble(v2);
        double soma = num1 + num2;
        System.out.printf("A soma é %.2f", soma);

    }
}
