package ClassesMetodos;

public class Data {

    int dia, mes, ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int dia2, int mes2, int ano2) {
        dia = dia2;
        mes = mes2;
        ano = ano2;
    }

    String obterDataFormatada() {
        return String.format("%s/%s/%s", dia, mes, ano);
    }
}
