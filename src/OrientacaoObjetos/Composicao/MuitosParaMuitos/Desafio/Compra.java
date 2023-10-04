package OrientacaoObjetos.Composicao.MuitosParaMuitos.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    List<Item> itens = new ArrayList<>();

    void addItens(Item item) {
        itens.add(new Item(item.produto));
    }

    void percorrerItens() {
        for (Item i: this.itens) {
            System.out.println(i);
        }
    }

    void obterValorTotal() {
        double total = 0;

        for (Item itens: itens) {
            total += itens.produto.quantidade * itens.produto.preco;
        }

        System.out.println("O valor total dos itens é R$" + total);
    }

    public String toString() {
        return " " + itens.toString();
    }
}
