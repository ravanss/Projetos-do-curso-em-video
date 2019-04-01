package aula_curso_video_javapoo;
public  class Student extends People{
    private int matricula;
    private String curso;
    
    
    public  void pagarMensalidade(){
        System.out.println("Pagando a mensalidade do student " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
