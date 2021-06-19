/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetouniversitario;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author stell
 */
public class ProjetoUniversitario {
   static  ArrayList<Departamento> departamentos = new ArrayList();
   static ArrayList<Historico> historicos = new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Agora vamos instanciar a departamento.
        Departamento a= null;
        a = new Departamento("Departamento Infórmatica",05,031985645271f,324);
        System.out.println(a.toString());
        
        Departamento b= null;
        b = new Departamento("Departamento Adiministração",06,031985645271f,328);
        System.out.println(b.toString());
        departamentos.add(b);
        departamentos.add(a);
        
        // Agora vamos instanciar o curso.
        Curso c = null;
        c = new Curso("Curso Técnico em Informática ","O curso de informática é muito legal!",1, 20, 5);
        System.out.println(c.toString());
        
        Curso d = null;
        d = new Curso("Bacharelado em Adiministração","O bacharelado é muito importantante!",5, 40, 4);
        System.out.println(d.toString());
        
        // Agora vamos instanciar a disciplina.
        Disciplina e = null;
        e = new Disciplina("Programação 1","Carlos Eduardo", 1);
        System.out.println(e.toString());
        System.out.println("Ano Atual: "+ e.getAno());
        System.out.println("Semestre: "+ e.getSemestre()+"\n");
        c.AssociarDisciplina(e);
        
        Disciplina f = null;
        f = new Disciplina("Programação OO","Daniela", 2);
        System.out.println(f.toString());
        System.out.println("Ano Atual: "+ f.getAno());
        System.out.println("Semestre: "+ f.getSemestre()+"\n");
        c.AssociarDisciplina(f);
        
        Disciplina g = null;
        g = new Disciplina("Tópicos em Desenvolvimento","Saulo", 3);
        System.out.println(g.toString());
        System.out.println("Ano Atual: "+ g.getAno());
        System.out.println("Semestre: "+ g.getSemestre()+"\n");
        c.AssociarDisciplina(g);
        
        Disciplina h = null;
        h = new Disciplina("Gestão Empresarial","Rodolfo", 4);
        System.out.println(h.toString());
        System.out.println("Ano Atual: "+ h.getAno());
        System.out.println("Semestre: "+ h.getSemestre()+"\n");
        d.AssociarDisciplina(h);
        
        Disciplina i = null;
        i = new Disciplina("Gestão Ambiental","Rosângela", 5);
        System.out.println(i.toString());
        System.out.println("Ano Atual: "+ i.getAno());
        System.out.println("Semestre: "+ i.getSemestre()+"\n");
        d.AssociarDisciplina(i);
        a.AssociarCurso(c);
        b.AssociarCurso(d);
        
        // Agora vamos instanciar o aluno.
        Aluno a2 = null;
        a2 = new Aluno("Sophia","Rua Silva Lobo,183-Ouro Branco, MG", "Feminino", "Administração", "Graduando", 22, 031956874f ,"05/08/1992");
        System.out.println(a2.toString());
        a.AssociarAluno(a2);
        
        Aluno a3 = null;
        a3 = new Aluno("Renata","Rua Silva Lobo,183-Ouro Branco, MG", "Feminino", "Info-2", "Tecnico", 02, 031956874f ,"02/08/2006");
        System.out.println(a3.toString());
        b.AssociarAluno(a3);
        
        Aluno a4 = null;
        a4 = new Aluno("Pedro","Rua Silva Lobo,183-Ouro Branco, MG", "Masculino", "Administração", "Graduando", 22, 031956874f ,"25/01/1998");
        System.out.println(a4.toString());
        a.AssociarAluno(a4);
        
        Aluno a5 = null;
        a5 = new Aluno("Julia","Rua Silva Lobo,183-Ouro Branco, MG", "Feminino", "Info-1", "Tecnico", 04, 031956874f ,"20/01/2006");
        System.out.println(a5.toString());
        b.AssociarAluno(a5);
        
        Aluno a6 = null;
        a6 = new Aluno("Roberta","Rua Silva Lobo,183-Ouro Branco, MG", "Feminino", "Administração", "Graduando", 22, 031956874f ,"20/05/2000");
        System.out.println(a6.toString());
        a.AssociarAluno(a6);
        
        Aluno a7 = null;
        a7 = new Aluno("Helena","Rua Silva Lobo,183-Ouro Branco, MG", "Feminino", "Info-3", "Tecnico", 01, 031956874f ,"20/04/2000");
        System.out.println(a7.toString());
        b.AssociarAluno(a7);
        
        Aluno a8 = null;
        a8 = new Aluno("Julio","Rua Silva Lobo,183-Ouro Branco, MG", "Masculino", "Administração", "Graduando", 01, 031956874f ,"04/07/1995");
        System.out.println(a8.toString());
        a.AssociarAluno(a8);
        
        // Escolhendo um departamento para matricular o aluno associado ao mesmo.
        System.out.println("Informe o número do departamento ao qual você deseja escolher o aluno?");
        for(int cont=0;cont<departamentos.size();cont++){
            System.out.println(cont+" "+departamentos.get(cont).getnomeDepartamento());
        }
        Scanner teclado = new Scanner(System.in);
        int posicao=teclado.nextInt();
        Departamento escolhido = departamentos.get(posicao);
        System.out.println("Qual aluno você deseja selecionar?");
        escolhido.ListarAlunos();
        int posicaoAluno= teclado.nextInt();
        Aluno alunoescolhido = escolhido.recuperaInformacaoAluno(posicaoAluno);
        System.out.println("Escolha qual o curso oferta a disciplina desejada pelo aluno?");
        escolhido.ListarCurso();
        int posicaoCurso = teclado.nextInt();
        Curso cursoescolhido = escolhido.recuperaInformacaoCurso(posicaoCurso);
        System.out.println("Qual disciplina deseja matricular aluno?");
        cursoescolhido.ListarDisciplina();
        int posicaoDisciplina = teclado.nextInt();
        Disciplina disciplinaescolhida = cursoescolhido.recuperaInformacaoDisciplina(posicaoDisciplina);
        
        // Agora vamos instanciar o histórico.
        Historico h1 = null;
        h1 = new Historico(70,disciplinaescolhida,alunoescolhido);
        h1.CaulcularNota();
        historicos.add(h1);
        
        System.out.println("Informe o número do departamento ao qual você deseja escolher o aluno?");
            for(int cont=0;cont<departamentos.size();cont++){
                System.out.println(cont+" "+departamentos.get(cont).getnomeDepartamento());
            }
        int repost=teclado.nextInt();
        Departamento opcao = departamentos.get(repost);
        System.out.println("Escolha qual o curso?");
        escolhido.ListarCurso();
        int repostcurso = teclado.nextInt();
        Curso opcaoCurso = escolhido.recuperaInformacaoCurso(repostcurso);
        System.out.println("Qual disciplina você deseja mostrar a situação atual dos alunos?");
        cursoescolhido.ListarDisciplina();
        int repostdisciplina= teclado.nextInt();
        Disciplina di = cursoescolhido.recuperaInformacaoDisciplina(repostdisciplina);
        
            for(int cont=0;cont< historicos.size();cont++){
                if(di==historicos.get(cont).getMateria()){
                    System.out.println(historicos.get(cont).getEstudante().getNomeAluno());
                    if(historicos.get(cont).getnotaNumerica()>=60){
                        System.out.println("Lista Aprovados\n");
                    }else{
                        System.out.println("Lista Reprovados");
                    }
                }
            }
        }
    }



              
             

                   
            

