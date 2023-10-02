package OrientacaoObjetos.Composicao.Heranca.Desafio;

public class Ferrari extends Carro {

    @Override
    void acelerar() {
        super.acelerar();
        super.velAtual += 15;
    }
}
