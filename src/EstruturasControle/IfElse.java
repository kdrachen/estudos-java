package EstruturasControle;

import javax.swing.*;

public class IfElse {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Digite um valor");
        int convert = Integer.parseInt(valor);

        if(convert % 2 == 0) {
            System.out.println("Número par");
        }

        if(convert % 2 == 1) {
            System.out.println("Número ímpar");
        }

        /*

         if(convert % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número ímpar");
        }

        */
    }
}
