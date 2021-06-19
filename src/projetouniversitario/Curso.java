/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetouniversitario;

import java.util.ArrayList;

/**
 *
 * @author stell
 */
public class Curso {
    private String nomeCurso, descricao;
    private int nivel, numHora, numCurso;
    ArrayList<Disciplina> disciplinasOfertadas;
      
    public Curso(String nomeCurso, String descricao, int nivel, int numHora, int numCurso){
        disciplinasOfertadas= new ArrayList();
        this.nomeCurso=nomeCurso;
        this.descricao=descricao;
        this.nivel=nivel;
        this.numHora=numHora;
        this.numCurso=numCurso;
    }
    
    public String getnomeCurso(){
        return nomeCurso;
    }
    public String getDescricao(){
        return descricao;
    }
    public float getNivel(){
        return nivel;
    }
    public int getnumHora(){
        return numHora;
    }
    public int getnumCurso(){
        return numCurso;
    }
    // Associa uma nova disciplina no departamento.
    public void AssociarDisciplina(Disciplina novaDisciplina){
        disciplinasOfertadas.add(novaDisciplina);
    }
    // Lista todas as disciplinas oferecidas. 
    public void ListarDisciplina(){
        for(int cont=0;cont< disciplinasOfertadas.size();cont++){
            System.out.println((cont+1)+" - "+disciplinasOfertadas.get(cont).getDisciplina());
        }
    }
    // Corrigi as posições dos números que correspondem as disciplinas.
    public Disciplina recuperaInformacaoDisciplina(int posicaoCorrigida){
        posicaoCorrigida--;
        return disciplinasOfertadas.get(posicaoCorrigida);
    }
     
    public String toString(){
        return ("Nome do Curso: "+ this.nomeCurso+"\n" +
                "Descrição: " + this.descricao+"\n"+
                "Nível: " + this.nivel+"\n"+
                "Número Hora: "+ this.numHora+"\n"+
                "Número Curso: " + this.numCurso+"\n");
    }
}

