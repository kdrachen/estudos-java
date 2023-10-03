package OrientacaoObjetos.Composicao.Encapsulamento.CasaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcessos() {
//        segredo // private
//        facoDentroDeCasa // Default ou pacote
//        formaDeFalar // protect (tb por pacote) por herença
//        todosSabem // Public

        //System.out.println(esposa.segredo);
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);

    }
}
