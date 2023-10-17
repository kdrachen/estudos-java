package StreamAPI.MinMax;

public class Alunos {

    final String nome;
    public double nota;
    final boolean bomComportamento;

    public Alunos(String nome, double nota) {
        this(nome, nota, true);
    }

    public Alunos(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String toString() {
        return this.nome + " tem nota " + this.nota;
    }
}
