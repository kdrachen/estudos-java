package OrientacaoObjetos.Composicao.Encapsulamento.CasaB;

import OrientacaoObjetos.Composicao.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        // segredo - private
        // facoDentroDeCasa - Default - Pacote
        // formaDeFalar - protect (tb por pacote) por herença
        // todosSabem - Public

        //System.out.println(segredo);
        //System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);


    }
}
