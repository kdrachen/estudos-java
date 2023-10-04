package OrientacaoObjetos.Composicao.MuitosParaMuitos.UmParaN;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    String cliente;
    List<Item> itens = new ArrayList<Item>();

    void addItem(String nome, int quantidade, double preco) {
        this.addItem(new Item(nome, quantidade, preco));
    }

    void addItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double getValorTotal() {
        double total = 0;

        for(Item item: itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
