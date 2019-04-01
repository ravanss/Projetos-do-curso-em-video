package aula_curso_video_javapoo;
public class Cachorro  extends Manifero{
    @Override
    public void locomover(){
        System.out.println("ande devagar");
    }
    @Override
    public void emitirSom() {
        System.out.println("Latidão");
    }
}
