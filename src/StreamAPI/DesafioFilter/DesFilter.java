package StreamAPI.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesFilter {

    public static void main(String[] args) {
        Carro c1 = new Carro("Ferrari", 10.0, true);
        Carro c2 = new Carro("Fusca", 5.0, false);
        Carro c3 = new Carro("Lamborghini", 10.0, true);
        Carro c4 = new Carro("BMW", 8.6, true);
        Carro c5 = new Carro("Mercedez", 8.5, true);
        Carro c6 = new Carro("Nissan", 7.4, false);
        Carro c7 = new Carro("Pagani", 10.0, true);
        Carro c8 = new Carro("Peugeot", 7.0, false);
        Carro c9 = new Carro("Argo", 6.4, true);
        Carro c10 = new Carro("Fiorino", 6.9, false);

        List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);
        Predicate<Carro> forcaMortorMaior = carro -> carro.forcaMotor >= 7;
        Predicate<Carro> arrancadaBoaSimOuNao = carro -> carro.arrancadaBoa;
        Function<Carro, String> carroBom = carro -> "O carro " + carro.modelo + " é bom!";

        carros.stream().filter(forcaMortorMaior).filter(arrancadaBoaSimOuNao).map(carroBom).forEach(System.out::println);
    }
}
