package OrientacaoObjetos.Composicao.MuitosParaMuitos.UmParaN;

public class CompraTeste {

    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João pedro";

        compra1.addItem("Caneta", 20, 7.45);
        compra1.addItem("Borracha", 12, 3.89);
        compra1.addItem("Caderno", 3, 18.79);

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());

        // Só para mostrar a relação bidirecional!!!
        System.out.println("Valor total é R$" + compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal());
    }
}
