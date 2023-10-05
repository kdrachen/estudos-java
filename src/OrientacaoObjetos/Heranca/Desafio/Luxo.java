package OrientacaoObjetos.Heranca.Desafio;

public interface Luxo {

    public abstract void ligarAr();
    public void desligarAr();

    default int velocidadeDoAr() {
        return 1;
    }
}
