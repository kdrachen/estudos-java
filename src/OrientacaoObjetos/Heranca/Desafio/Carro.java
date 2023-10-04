package OrientacaoObjetos.Heranca.Desafio;

public class Carro {
    private final int VELOCIDADE_MAXIMA;
    public int velAtual = 10;
    private int delta = 5;

    public Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if(velAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velAtual = VELOCIDADE_MAXIMA;
        } else {
            velAtual += getDelta();
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void frear() {
        if(velAtual > 5) {
            velAtual -= 5;
        }
    }
}
