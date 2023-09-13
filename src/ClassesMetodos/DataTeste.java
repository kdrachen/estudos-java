package ClassesMetodos;

import ClassesMetodos.Data;

public class DataTeste {

    public static void main(String[] args) {
        Data dataSla = new Data();

        Data antiga = new Data();
        antiga.dia = 1;
        antiga.mes = 9;
        antiga.ano = 1939;

        System.out.printf("Data de hoje: %d/%d/%d\n", dataSla.dia, dataSla.mes, dataSla.ano);
        System.out.printf("Data de WWII: %d/%d/%d\n", antiga.dia, antiga.mes, antiga.ano);

        System.out.println("");

        Data padrao = new Data();
        System.out.println("Construtor padrão: " + padrao.obterDataFormatada());

        Data construtor = new Data(12, 12, 2012);
        System.out.println("Construtor editado: " + construtor.obterDataFormatada());
    }
}
