package TratamentoDeErro.personalizadaB;

import TratamentoDeErro.Aluno;

public class Validar {

    private Validar() {}

    public static void aluno(Aluno aluno) throws StringVaziaExc, NumeroForaIntervaloExc {
        if(aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo!");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaExc("nome");
        }

        if(aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervaloExc("nota");
        }
    }
}
