package aula_curso_video_javapoo;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    //Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovado) {
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0,1,2.
            System.out.println("===== Resultado da luta. =====");
            switch(vencedor){
                case 0://emparte
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                break;
                case 1://desafiado vence
                    System.out.println("Vitorioso " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                break;
                case 2://desafiante vence
                    System.out.println("Vitorioso " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                break;
            }
            System.out.println("===============================");
        } else {
            System.out.println("A luta nao pode ocorrer.");
        }
    }
    
    //Metodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
