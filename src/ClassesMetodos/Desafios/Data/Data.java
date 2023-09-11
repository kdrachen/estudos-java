package ClassesMetodos.Desafios.Data;

public class Data {
    int dia, mes, ano;

    String obterDataFormatada() {
        return String.format("%s/%s/%s", dia, mes, ano);
    }
}
