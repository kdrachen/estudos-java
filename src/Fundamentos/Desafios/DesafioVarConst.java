package Fundamentos.Desafios;

public class DesafioVarConst {
    public static void main(String[] args) {
        /*
        * Desafio - Temperatura
        * Converção - (°F - 32) x 5/9 = °C
        * */
        final int AJUSTE = 32;
        final double FATOR = 5 / 9.0;
        int TemperaturaFahrenheit = 56;
        double Celsius = (TemperaturaFahrenheit - AJUSTE) * FATOR;

        System.out.println("A conversão de Fahrenheit para Celsius é: " + Celsius + "°C");

    }
}
