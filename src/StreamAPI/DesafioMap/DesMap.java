package StreamAPI.DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesMap {

    public static void main(String[] args) {

        /*
        * 1. Número para String binária... 6 => "110"
        * 2. Reverter a string... "110" => "011"
        * 3. Converter de volta para inteiro => "011" => 3
        * */

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.print("1 - ");
        nums.stream().map(toString).forEach(n -> System.out.print(n + " "));

        System.out.println();

        System.out.print("2 - ");
        nums.stream().map(toString).map(reverse).forEach(n -> System.out.print(n + " "));

        System.out.println();

        System.out.print("3 - ");
        nums.stream().map(toString).map(reverse).map(toInt).forEach(n -> System.out.print(n + " "));

    }

    public static Function<Integer, String> toString = n -> Integer.toBinaryString(n);
    public static Function<String, Integer> toInt = toString -> Integer.parseInt(toString, 2);
    public static UnaryOperator<String> reverse = n -> new StringBuilder(n).reverse().toString();
}
