package aula_curso_video_javapoo;
public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria, derrotas, empates;
    
    //Metodos publicos
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("Chegou a hora. Apresentando o lutador " + this.getNome());
        System.out.println("Diretamente da: " + this.getNacionalidade());
        System.out.println("Com: " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
        System.out.println("É pesando " + this.getPeso() + "kg.");
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getEmpates()+ " empates e");
        System.out.println(this.getDerrotas()+ " derrotas");
    }
    public void status(){
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitoria() + " vezes");
        System.out.println("Empatou: " + this.getEmpates()+ " vezes");
        System.out.println("Perdeu: " + this.getDerrotas()+ " vezes");
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Metodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "categoria invalida";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "invalido para luta.";
        }
    }
    
    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
}
