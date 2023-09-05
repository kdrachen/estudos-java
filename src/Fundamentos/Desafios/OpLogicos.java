package Fundamentos.Desafios;

public class OpLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        /*
        * Trabalho na terça e quinta = carro
        * Trabalho na terça ou quinta = tv e sorvete
        * Nenhum trabalho = ficar em casa
        * */

        boolean trabalhoTer = true;
        boolean trabalhoQui = true;
        boolean carro = trabalhoTer && trabalhoQui;
        boolean tvEsorvete = !trabalhoTer || trabalhoQui;
        boolean casa = !trabalhoTer && !trabalhoQui;

        System.out.printf("Trabalhos na terça e quinta fui bem: %b, vamos comprar um carro", carro);
        System.out.printf("\nTrabalho na terça ruim e na quinta bom: %b, comprar tv e tomar sorvete", tvEsorvete);
        System.out.printf("\nFui mal nos 2: %b, ficar em casa", casa);
    }
}
