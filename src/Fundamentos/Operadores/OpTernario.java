package Fundamentos.Operadores;

public class OpTernario {

    public static void main(String[] args) {

        double media = 6.0;
        String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
        String resultado = media >= 7.0 ? "aprovado" : resultadoParcial;
        System.out.println("O aluno está " + resultado);
    }
}
