package OrientacaoObjetos.Composicao.Encapsulamento.CasaB;

import OrientacaoObjetos.Composicao.Encapsulamento.CasaA.Ana;

public class Julia {
    void testeAcessos() {
        // segredo - private
        // facoDentroDeCasa - Default - Pacote
        // formaDeFalar - protect (tb por pacote) por herença
        // todosSabem - Public

        Ana sogra = new Ana();

        // System.out.println(sogra.segredo);
        // System.out.println(sogra.facoDentroDeCasa);
        // System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
    }
}
