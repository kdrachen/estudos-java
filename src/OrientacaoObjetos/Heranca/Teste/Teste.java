package OrientacaoObjetos.Heranca.Teste;

import OrientacaoObjetos.Heranca.Desafio.Carro;
import OrientacaoObjetos.Heranca.Desafio.Civic;
import OrientacaoObjetos.Heranca.Desafio.Ferrari;

public class Teste {

    public static void main(String[] args) {
        Carro carro = new Carro(120);
        Ferrari ferrari = new Ferrari(200);
        Civic civic = new Civic(170);

        System.out.println("Carro => " + carro.velAtual);
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();
        System.out.println("Carro => " + carro.velAtual);
        System.out.println();

        System.out.println("Ferrari => " + ferrari.velAtual);
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        System.out.println("Ferrari => " + ferrari.velAtual);
        System.out.println();

        System.out.println("Civic => " + civic.velAtual);
        civic.acelerar();
        civic.acelerar();
        civic.acelerar();
        System.out.println("Civic => " + civic.velAtual);
    }
}
