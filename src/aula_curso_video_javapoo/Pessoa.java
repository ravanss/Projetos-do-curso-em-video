package aula_curso_video_javapoo;
public class Pessoa {
    //Atributos da classe
    private String nome;
    private int idade;
    private String genero;
    
    //Metodos publicos da classe
    public void fazerAniver(){
        this.idade = this.idade + 1;
    }

    //Metodos Especiais
    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
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
