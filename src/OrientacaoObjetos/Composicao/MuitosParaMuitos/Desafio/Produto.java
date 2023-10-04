package OrientacaoObjetos.Composicao.MuitosParaMuitos.Desafio;

public class Produto {

    double preco;
    String nome;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String toString() {
        return nome + " " + preco + " " + quantidade;
    }
}
