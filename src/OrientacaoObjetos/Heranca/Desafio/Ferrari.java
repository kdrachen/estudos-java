package OrientacaoObjetos.Heranca.Desafio;

import java.security.interfaces.ECPrivateKey;

public class Ferrari extends Carro implements Esportivo, Luxo {

//    Ferrari() {
//        this(200);
//    }

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if (ligarTurbo && !ligarAr) {
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }

    //    @Override
//    public void acelerar() {
//        super.acelerar();
//    }
}
