package OrientacaoObjetos.Composicao.Encapsulamento.GetSet;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;

    Pessoa(String nome, String sobrenome, int idade) {
        setIdade(idade);
        setNome(nome);
        setSobrenome(sobrenome);
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idadeNova) {
        idadeNova = Math.abs(idadeNova);
        if(idadeNova >= 0 && idadeNova <= 120) {
            this.idade = idadeNova;
        }
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNome() + " tenho " + getIdade() + " anos!";
    }
}
