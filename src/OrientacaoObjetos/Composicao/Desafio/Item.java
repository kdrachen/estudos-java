package OrientacaoObjetos.Composicao.Desafio;

public class Item {

    Produto produto;

    Item(Produto produto) {
        this.produto = produto;
    }

    public String toString() {
        return "" + produto;
    }
}
