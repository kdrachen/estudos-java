package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos númericos inteiros
        byte anosDeEmpresa = 14; // -128 127
        short cafeFeitos = 542; // -32768 32767
        int id = 502349052; // Muitos números 2B alguma coisa
        long pontosAcumulados = 3_234_845_223L; // L no final define que o número é long

        // Tipos númericos reais
        float salario = 11_445.44F; // F no final define que o número é float
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo boolean
        boolean estaDeFerias = false;
        // Tipo caractere
        char status = 'A'; // Ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

    }
}
