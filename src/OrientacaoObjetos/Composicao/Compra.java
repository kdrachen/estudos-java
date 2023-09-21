package OrientacaoObjetos.Composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;
    Compra compra;
    ArrayList<Item> itens = new ArrayList<Item>();

    double getValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
