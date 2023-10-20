package TratamentoDeErro.personalizadaA;

public class StringVaziaExc extends RuntimeException {

    private final String nomeDoAtributo;

    public StringVaziaExc(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
    }
}
