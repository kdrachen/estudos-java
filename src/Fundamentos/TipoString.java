package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String nome = "Natã";
        String sobrenome = "Wilian";
        int idade = 19;
        System.out.println(nome.charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.endsWith("tarde"));
        System.out.println("O meu nome tem: " + nome.length() + " caracteres.");
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade);
        System.out.printf("Nome: %s, idade: %s", nome, idade);
    }
}
