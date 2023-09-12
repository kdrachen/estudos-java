package ClassesMetodos;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }

    Produto(String nomeInicial, double precoInicial) {
        preco = precoInicial;
        nome = nomeInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
