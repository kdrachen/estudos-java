package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String nome = "Natã Wilian X";
        nome = nome.replace("X", "Barbosa");
        nome = nome.toUpperCase();
        int a = nome.length();
        System.out.println(nome);
        System.out.println(a);

    }
}
