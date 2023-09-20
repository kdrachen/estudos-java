package ArraysCollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Natã");
        usuarios.put(20, "Roberto");
        usuarios.put(5, "Nathan");
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Natã"));
        System.out.println(usuarios.get(20));
        System.out.println(usuarios.remove(20));
        System.out.println(usuarios.remove(4, "Gui"));

        for(int chave: usuarios.keySet()) {
            System.out.print(chave + " - ");
        }

        for(String valor: usuarios.values()) {
            System.out.print(valor + " - ");
        }

        System.out.println("\n");

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " ---> ");
            System.out.println(registro.getValue());
        }
    }
}
