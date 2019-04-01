package aula_curso_video_javapoo;

public class Aula_Curso_Video_JavaPoo {
    public static void main(String[] args) {
        /* Referente a aula1 Criação dadas classes metodos.
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
        */
        
        /*Referente a aula2 visibilidade de atributos e metodos.
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        */
        
        /*Referente a aula3 metodos get e set.
        Caneta c1 = new Caneta("Bic", "Azul", 0.5f);
        //c1.setModelo("Bic cristal");
        //c1.setPonta(0.7f);
        c1.status();
        
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + ".");
        Caneta c2 = new Caneta("Barril", "Marro", 1.0f);
        c2.status();
        */
        
        /*Referente a aula4 exemplos praticos.
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1000);
        p1.setDono("Flavia");
        p1.abirConta("CC");
        p1.depositar(300);
        p1.fecharConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2000);
        p2.setDono("Saulo");
        p2.abirConta("CP");
        p2.depositar(250);
        p2.sacar(175);
        
        p1.estadoAtual();
        p2.estadoAtual();
        */
        
        /*referente a aula5 sobre encapsulamento
        ControleRemoto c = new ControleRemoto();
        c.liga();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
        */
        
        /*referente a aula6/7 sobre relação entre tabelas e sobre agregação 
        Lutador l[] = new Lutador[6];
        l[0] =new  Lutador("Pretty Boy", "Argentino", 30, 1.78f,68.9f, 11, 2, 1);
        l[1] =new  Lutador("Putscript", "Brasil", 25, 1.68f,57.8f, 14, 2, 3);
        l[2] =new  Lutador("Snapshadon", "EUA", 35, 1.65f,80.9f, 12, 2, 1);
        l[3] =new  Lutador("Dear Cod", "Canada", 28, 1.93f,81.6f, 13, 0, 1);
        l[4] =new  Lutador("UFCCobol", "França", 37, 1.70f,119.3f, 5, 4, 3);
        l[5] =new  Lutador("Nerdaart", "Morgolia", 30, 1.81f,105.7f, 15, 5, 9);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        l[4].status();
        l[5].status();
        */
        /*referente a aula8 sobre exercicio com poo 
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "m");
        p[1] = new Pessoa("Flavia", 22, "f");
        
        l[0] = new Livro("Aprendendo JAVA", "José Maria", 255, p[0]);
        l[1] = new Livro("PHP com Laravel", "Marinhão", 2000, p[0]);
        l[2] = new Livro("Como ser um bom programador", "Marai Maisa", 525, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        l[2].abrir();
        l[2].folhear(100);
        l[2].avancarPag();
        System.out.println(l[2].detalhes());
        */
        
        /*referente a aula9/10 sobre herança 
        Pessoas p1 = new Pessoas();
        Aluno p2 = new  Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new  Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudia");
        p4.setNome("Barbara");
        
        p1.setGenero("M");
        p2.setGenero("F");
        p3.setGenero("F");
        p4.setGenero("F");
        
        p2.setCurso("Informatica");
        p3.setSalario(3000.00f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());*/ 
        
        /*referente a aula9/10 sobre herança*/ 
        //People p1=new People();
        /*Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setGenero("M");
        System.out.println(v1.toString());
        
        Student s1 = new Student();
        s1.setNome("Manoel");
        s1.setMatricula(1122);
        s1.setCurso("ADS");
        s1.setIdade(25);
        s1.setGenero("M");
        s1.pagarMensalidade();
        
        Bolsista  b1 = new Bolsista();
        b1.setMatricula(1123);
        b1.setNome("João");
        b1.setBolsa(12.5f);
        b1.setGenero("M");
        b1.setIdade(26);
        b1.pagarMensalidade();*/
        
        /*referente a aula11/12 sobre polimofismo 
        //Animal  n =new Animal();
        Manifero m = new Manifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t =new Tartaruga();
        Goldfish g = new Goldfish();
        Arrara e =new Arrara();
        
        k.alimentar();
        k.locomover();
        k.emitirSom();
        
        m.setPeso(25.2f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();*/
        
        /*Aula12 polimorfismo sobrecarregado */
        /*Cão c = new Cão();
        c.reagir("Marlico");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
        c.emitirSom();*/
    }
}
