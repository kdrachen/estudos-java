package OrientacaoObjetos.Composicao.Encapsulamento.GetSet;

public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Natã", "Wi", -45);
        p1.setIdade(20);
        System.out.println(p1.getIdade());
        System.out.println(p1);
        System.out.println(p1.getNomeCompleto());

    }
}
