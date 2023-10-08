package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };

        System.out.println(calc.apply(3.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(3.0, 3.0));

    }
}
