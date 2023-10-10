package Lambdas.BinaryOperador;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperador {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> { return (n1 + n2) / 2; };
        System.out.println(media.apply(6.8, 9.2));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double notaFinal = ((n1 + n2) / 2);
            return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };

        System.out.println(resultado.apply(7.9, 4.6));

        Function<Double, String> conceito = (m) -> m >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(media.andThen(conceito).apply(9.7, 5.1));
    }
}
