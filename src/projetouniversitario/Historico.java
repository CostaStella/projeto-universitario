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
public class Historico {
    private int nota;
    private Disciplina materia;
    private Aluno estudante;
    ArrayList<Historico> aprovados = new ArrayList();
    ArrayList<Historico> reprovados = new ArrayList();
    public Historico( int nota, Disciplina materia, Aluno estudante){
        aprovados = new ArrayList<>();
        reprovados = new ArrayList<>();
        this.nota=nota;
        this.materia=materia;
        this.estudante=estudante;
    }
    public Disciplina getMateria(){
        return materia;
    }
     public Aluno getEstudante(){
         return estudante;
     }
      public int getnotaNumerica(){
          
         return nota;
    }
    
    public void CaulcularNota(){
        
    String notaConceito;
    
    if(this.nota<=10){
        notaConceito="F";
        System.out.println("Nota Conceito: " + notaConceito);
    } else {
            if(this.nota == 11 || this.nota <=20){
            notaConceito="E";
            System.out.println("Nota Conceito: " + notaConceito);
            }else {
                    if(this.nota == 21 || this.nota <=40){
                    notaConceito="D";
                    System.out.println("Nota Conceito: " + notaConceito);
                    } else {
                        if(this.nota == 41 || this.nota <=60){
                        notaConceito="C";
                        System.out.println("Nota Conceito: " + notaConceito);
                        }else {
                            if(this.nota== 61 || this.nota <=80){
                            notaConceito="B";
                            System.out.println("Nota Conceito: " + notaConceito);
                                }else {
                                    if(this.nota >= 81){
                                    notaConceito="A";
                                    System.out.println("Nota Conceito: " + notaConceito);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
