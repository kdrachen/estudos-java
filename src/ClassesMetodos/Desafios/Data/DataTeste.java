package ClassesMetodos.Desafios.Data;

import java.util.Date;

public class DataTeste {

    public static void main(String[] args) {
        Data dataHoje = new Data();
        dataHoje.dia = 11;
        dataHoje.mes = 9;
        dataHoje.ano = 2023;

        Data antiga = new Data();
        antiga.dia = 1;
        antiga.mes = 9;
        antiga.ano = 1939;

        Data reveillon = new Data();
        reveillon.dia = 31;
        reveillon.mes = 12;
        reveillon.ano = 2023;

        System.out.printf("Data de hoje: %d/%d/%d\n", dataHoje.dia, dataHoje.mes, dataHoje.ano);
        System.out.printf("Data de WWII: %d/%d/%d\n", antiga.dia, antiga.mes, antiga.ano);
        System.out.println("Data formatada: " + reveillon.obterDataFormatada());
    }
}
