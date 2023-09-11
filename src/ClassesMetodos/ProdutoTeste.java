package ClassesMetodos;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.printf("%s por apenas %.2f receba até %.2f%% de desconto!\n", p1.nome, p1.preco, p1.desconto);
        System.out.printf("%s no precinho por %.2f", p2.nome, p2.preco);
    }
}
