package TratamentoDeErro.personalizadaB;

public class StringVaziaExc extends Exception {

    private final String nomeDoAtributo;

    public StringVaziaExc(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage() {
        return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
    }
}
