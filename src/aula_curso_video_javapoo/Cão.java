package aula_curso_video_javapoo;
public class Cão extends Lob{
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au");
    }
    
    public void reagir(String frase){
        if (frase.equals("Toma Comida" ) || frase.equals("Marlico")){
            System.out.println("Abaner e Latir");
            this.emitirSom();
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min){
        if (hora < 12) {
            System.out.println("Abanar Rabo");
        } else if (hora>=18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar rabo e latir");
        }
    }
    
    public void reagir(boolean dono){
        if (dono == true) {
            System.out.println("Abanar rabo");
        } else {
            System.out.println("Rosnar e latir");
            this.emitirSom();
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5)  {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
                this.emitirSom();
            }
        } else {
            if (peso <10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
}
