package OrientacaoObjetos.Composicao.Heranca.Desafio;

public class Carro {
    final private int VELOCIDADE_MAXIMA;
    public int velAtual = 10;
    protected int delta = 5;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if(velAtual + delta > VELOCIDADE_MAXIMA) {
            velAtual = VELOCIDADE_MAXIMA;
        } else {
            velAtual += delta;
        }
    }

    public void frear() {
        if(velAtual > 5) {
            velAtual -= 5;
        }

    }
}
