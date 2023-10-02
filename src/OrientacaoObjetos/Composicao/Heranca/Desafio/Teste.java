package OrientacaoObjetos.Composicao.Heranca.Desafio;

public class Teste {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();
        Civic civic = new Civic();

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
