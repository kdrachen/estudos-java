package StreamAPI.MinMax;

import StreamAPI.Match.Aluno;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        Alunos a1 = new Alunos("Ana", 7.1);
        Alunos a2 = new Alunos("Dani", 10);
        Alunos a3 = new Alunos("Gaby", 6.1);
        Alunos a4 = new Alunos("Faby", 8.1);

        List<Alunos> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Alunos> melhorNota = (al1, al2) -> {
            if(al1.nota > al2.nota) return 1;
            if(al1.nota < al2.nota) return -1;
            return 0;
        };

        Comparator<Alunos> piorNota = (al1, al2) -> {
            if(al1.nota > al2.nota) return -1;
            if(al1.nota < al2.nota) return 1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());

        System.out.println(alunos.stream().max(piorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
