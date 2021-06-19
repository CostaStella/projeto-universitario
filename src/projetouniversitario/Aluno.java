/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetouniversitario;

/**
 *
 * @author stell
 */
public class Aluno {
    private String nomeAluno;
    private String endereco, sexo, turma, programa,dataNascimento;
    private int numeroMatricula;
    private float telAluno;
    
    public Aluno(String nomeAluno, String endereco, String sexo, String turma, String programa, int numeroMatricula, float telAluno, String dataNascimento ){
    this.nomeAluno=nomeAluno;
    this.endereco=endereco;
    this.sexo=sexo;
    this.turma=turma;
    this.programa=programa;
    this.numeroMatricula=numeroMatricula;
    this.telAluno=telAluno;
    this.dataNascimento=dataNascimento;
 }
    
    public String getNomeAluno() {
        return nomeAluno;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getSexo() {
        return sexo;
    }
    public String getTurma() {
        return turma;
    }
    public String getPrograma() {
        return programa;
    }
    public int getNumeroMatricula() {
        return numeroMatricula;
    }   
    public float getTelAluno(){
        return telAluno;
    }
    public String getdataNascimento(){
        return dataNascimento;
    }
    // Esse método é para quando precisamos registrar um novo aluno. 
    public void MatricularAluno(){
        System.out.println(this.getNomeAluno());
        
    }
    public String toString(){
        return ("Nome do Aluno: "+ this.nomeAluno+"\n" +
                "Endereço: " + this.endereco+"\n"+
                "Sexo: " + this.sexo+"\n"+
                "Turma: " + this.turma+"\n"+
                "Programa: " + this.programa+"\n"+
                "Numero Matricula: " + this.numeroMatricula+"\n"+
                "Telefone do Aluno: " + this.telAluno+"\n"+
                "Data de Nascimento: " + this.dataNascimento+"\n");
    }
}