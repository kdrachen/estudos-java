package ClassesMetodos.Desafios.Data;

public class DataTeste {

    public static void main(String[] args) {
        Data dataHoje = new Data();
        dataHoje.dia = 11;
        dataHoje.mes = 9;
        dataHoje.ano = 2023;

        Data antiga = new Data();
        antiga.dia = 1;
        antiga.mes = 11;
        antiga.ano = 1939;

        System.out.printf("Data de hoje: %d/%d/%d\n", dataHoje.dia, dataHoje.mes, dataHoje.ano);
        System.out.printf("Data de WWII: %d/%d/%d", antiga.dia, antiga.mes, antiga.ano);
    }
}
