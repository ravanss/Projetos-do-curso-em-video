package aula_curso_video_javapoo;
public class Professor extends Pessoas{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aulmento){
        this.salario = this.salario + aulmento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
