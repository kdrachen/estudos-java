package ArraysCollections;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        double[] notasAlunoA = new double[3];
        System.out.println(Arrays.toString(notasAlunoA));
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.5;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));
    }
}
