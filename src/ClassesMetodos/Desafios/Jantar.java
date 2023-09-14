package ClassesMetodos.Desafios;

public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Feijão", 0.223);
        System.out.println(c1.nome + " " + c1.peso);

        Comida c2 = new Comida("Arroz", 0.123);
        System.out.println(c2.nome + " " + c2.peso);

        Pessoa p = new Pessoa("Natã", 60.0);

        System.out.println(p.apresentar());
        p.Comer(c1);
        System.out.println(p.apresentar());
        p.Comer(c2);
        System.out.println(p.apresentar());
    }
}
