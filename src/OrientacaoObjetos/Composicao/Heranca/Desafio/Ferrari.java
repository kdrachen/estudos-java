package OrientacaoObjetos.Composicao.Heranca.Desafio;

public class Ferrari extends Carro {

    void acelerar() {
        super.acelerar();
        super.velAtual += 15;
    }
}
