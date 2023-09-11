package ClassesMetodos;

public class Produto {

    String nome;
    double preco, desconto;

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
