package OrientacaoObjetos.Composicao.MuitosParaMuitos.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    List<Compra> compras = new ArrayList<>();

    void addCompras(Compra compra) {
        this.compras.add(compra);
    }

    void percorrerCompras() {
        for(Compra c: this.compras) {
            System.out.println(c);
        }
    }

    public String toString() {
        return "";
    }
}
