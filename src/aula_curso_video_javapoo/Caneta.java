package aula_curso_video_javapoo;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //Contrutor da classe.
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public void status(){
        System.out.println("Sobre a nossa caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.getPonta());
        //System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
        
        
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro. Caneta tampada, não posso escrever.");    
        }else{
            System.out.println("Caneta destapada, agora posso escrever.");
        }
        System.out.println("");
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
       this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
}