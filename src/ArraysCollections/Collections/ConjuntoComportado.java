package ArraysCollections.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/*import java.util.TreeSet;*/

public class ConjuntoComportado {

    public static void main(String[] args) {

//        Set<String> lista = new HashSet<>();
        Set<String> lista = new LinkedHashSet<>(); // Garante a ordem
        lista.add("Tomate");
        lista.add("Cebola");
        lista.add("Banana");
        lista.add("Maçã");

        for(String verdura: lista) {
            System.out.println(verdura);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println();

        for(int x: nums) {
            System.out.println(x);
        }
    }
}
