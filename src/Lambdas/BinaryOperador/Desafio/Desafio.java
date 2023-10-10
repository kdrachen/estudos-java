package Lambdas.BinaryOperador.Desafio;

import Lambdas.Predicado.Produto;

import java.util.Locale;
import java.util.function.*;

public class Desafio {

    public static void main(String[] args) {

        /*
        * 1. A partir do produto calcular o preco real (com desconto)
        * 2. Imposto municipal: >= 2500 (8.5%) e < 2500 (Isento)
        * 3. Frete: >= 3000 (100) e < 3000 (50)
        * 4. Arredondar: Deixar duas casas decimais
        * 5. Formatar: R$1234,56
        * */

        Locale.setDefault(Locale.US);

        Function<Produto, Double> precoFinal;
        precoFinal = (p) -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> impostoMunicipal;
        impostoMunicipal = (preco) -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete;
        frete = (preco) -> preco >= 3000 ? preco - 100 : preco - 50;

        UnaryOperator<Double> arredondar;
        arredondar = (preco) -> Double.parseDouble(String.format("%.2f", preco));

        Function<Double, String> formatar;
        formatar = (preco) -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.89, 0.13);

        String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
        System.out.println("O preço final é " + preco);
    }
}
