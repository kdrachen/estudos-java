package OrientacaoObjetos.Composicao.Heranca.Desafio;

public class Carro {

    int velAtual = 10;

    void acelerar() {
        if(velAtual > 0) {
            velAtual += 5;
        } else {
            System.out.println("Carro tem a velocidade menor que 0!");
        }
    }

    void frear() {
        if(velAtual > 5) {
            velAtual -= 5;
        } else {
            System.out.println("Carro tem a velocidade menor que 10!");
        }
    }
}
