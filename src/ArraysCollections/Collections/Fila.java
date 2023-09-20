package ArraysCollections.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // Retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Raraela");
        fila.offer("Gui");

        // peek e element -> obter o proximo elemento da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // Return null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();

        // poll e remove -> obter o proximo elemento da fila da fila e remove!

        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // Retorna null
        System.out.println(fila.remove()); // Lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains(...);

    }
}
