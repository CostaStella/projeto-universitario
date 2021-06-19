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
public class Departamento {
    String nomeDepartamento;
    int numSala, codigoDepartamento;
    float telDepartamento;
    ArrayList<Aluno> alunosAssociados;
    ArrayList<Curso> cursosOfertados;
    
    public Departamento(String nomeDepartamento, int numSala, float telDepartamento, int codigoDepartamento){
        alunosAssociados = new ArrayList<>();
        cursosOfertados = new ArrayList<>();
        this.nomeDepartamento=nomeDepartamento;
        this.numSala=numSala;
        this.telDepartamento=telDepartamento;
        this.codigoDepartamento=codigoDepartamento;
    }
    
    public String getnomeDepartamento(){
        return nomeDepartamento;
    }
    public int getnumSala(){
        return numSala;
    }
    public float gettelDepartamento(){
        return telDepartamento;
    }
    public int getcodigoDepartamento(){
        return codigoDepartamento;
    }
    // Associa um novo aluno no departamento. 
    public void AssociarAluno(Aluno novoAluno){
        alunosAssociados.add(novoAluno);
    }
    // Lista os nomes dos alunos. 
    public void ListarAlunos(){
        for(int cont=0;cont< alunosAssociados.size();cont++){
            System.out.println((cont+1)+" - "+alunosAssociados.get(cont).getNomeAluno());
        }
    }
    // Associa um novo curso no departamento.
    public void AssociarCurso(Curso novoCurso){
        cursosOfertados.add(novoCurso);
    }
    // Lista os nomes dos cursos. 
    public void ListarCurso(){
        for(int cont=0;cont< cursosOfertados.size();cont++){
            System.out.println((cont+1)+" - "+cursosOfertados.get(cont).getnomeCurso());
        }
    }
    // Corrigi as posições dos números que correspondem aos alunos.
    public Aluno recuperaInformacaoAluno(int posicaoCorrigida){
        posicaoCorrigida--;
        return alunosAssociados.get(posicaoCorrigida);
    }
    // Corrigi as posições dos números que correspondem aos curso.
    public Curso recuperaInformacaoCurso(int posicaoCorrigida){
        posicaoCorrigida--;
        return cursosOfertados.get(posicaoCorrigida);
    }
    
    
    
    public String toString(){
        return ("Nome do Departamento: "+ this.nomeDepartamento+"\n" +
                "Número da Sala: " + this.numSala+"\n"+
                "Telefone Departamento: " + this.telDepartamento+"\n"+
                "Código Departamento: "+ this.codigoDepartamento+"\n");
    }
}
