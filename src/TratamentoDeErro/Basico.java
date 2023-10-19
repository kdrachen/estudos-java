package TratamentoDeErro;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (NullPointerException e) { // Exception e
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("FIM!!!");
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
