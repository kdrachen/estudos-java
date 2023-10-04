package OrientacaoObjetos.Heranca.Teste;

import OrientacaoObjetos.Heranca.Direcao;
import OrientacaoObjetos.Heranca.Heroi;
import OrientacaoObjetos.Heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        System.out.println("O monstro tem => " + monstro.vida);
        System.out.println("O heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("O monstro tem => " + monstro.vida);
        System.out.println("O heroi tem => " + heroi.vida);
    }
}
