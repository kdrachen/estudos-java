package TratamentoDeErro.personalizadaB;

public class NumeroForaIntervaloExc extends Exception {

    private final String nomeDoAtributo;

    public NumeroForaIntervaloExc(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }
}
