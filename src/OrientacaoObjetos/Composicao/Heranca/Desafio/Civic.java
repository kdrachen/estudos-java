package OrientacaoObjetos.Composicao.Heranca.Desafio;

public class Civic extends Carro {

    void acelerar() {
        super.acelerar();
        super.velAtual += 10;
    }
}
