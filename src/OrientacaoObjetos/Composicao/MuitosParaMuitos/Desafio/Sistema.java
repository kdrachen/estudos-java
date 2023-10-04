package OrientacaoObjetos.Composicao.MuitosParaMuitos.Desafio;

public class Sistema {

    public static void main(String[] args) {
        Produto p1 = new Produto("Feijão", 100, 10);
        Produto p2 = new Produto("Quiabo", 10, 5);
        Item i = new Item(p1);
        Item a = new Item(p2);

        Compra c = new Compra();
        c.addItens(i);
        c.addItens(a);
        c.percorrerItens();

        Cliente cliente = new Cliente();
        cliente.addCompras(c);

        c.obterValorTotal();
        cliente.percorrerCompras();
    }
}
