package TratamentoDeErro.personalizadaA;

public class NumeroForaIntervaloExc extends RuntimeException {

    private final String nomeDoAtributo;

    public NumeroForaIntervaloExc(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }
}
