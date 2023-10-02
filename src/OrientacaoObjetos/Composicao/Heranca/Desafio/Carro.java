package OrientacaoObjetos.Composicao.Heranca.Desafio;

public class Carro {

    int velAtual = 10;

    void acelerar() {
        if(velAtual > 0) {
            velAtual += 5;
        }
    }

    void frear() {
        if(velAtual > 5) {
            velAtual -= 5;
        }
    }
}
