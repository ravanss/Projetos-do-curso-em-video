package aula_curso_video_javapoo;
public class Pessoas {
    private String nome;
    private int idade;
    private String genero;
    
    public void fazerAniversario(){
        this.idade = this.idade + 1;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "nome=" + nome + ", idade=" + idade + ", genero=" + genero + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
