/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetouniversitario;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author stell
 */
public class Disciplina {

    
   private String professor,disciplina, ano;
   private int numero;
   
   public Disciplina(String disciplina,String professor, int numero ){
     this.disciplina=disciplina;
     this.professor=professor;
     this.numero=numero;
    }
   // Criamos esse objeto data.
    Date data = new Date();
    
    public String getProfessor(){
        return professor;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public int getNumero(){
        return numero;
    }
    public String getSemestre(){
     //Aqui foi feito um código para formatar a data e posteriormente conseguir escrever somente o mês.
    SimpleDateFormat formatar = new SimpleDateFormat("M");
    String semestre = formatar.format(data);
    int x;
        if(semestre.equalsIgnoreCase("1")||semestre.equalsIgnoreCase("2")||semestre.equalsIgnoreCase("3")||semestre.equalsIgnoreCase("4")||semestre.equalsIgnoreCase("5")||semestre.equalsIgnoreCase("6")){
          x = Integer.parseInt(semestre);
          semestre = "Semestre 1";
        }else{
            x = Integer.parseInt(semestre);
            semestre = "Semestre 2";
        }
    return semestre;
    }
    public String getAno() {
        //Aqui foi feito um código para formatar, a data e posteriormente conseguir retornar somente o ano.
        SimpleDateFormat formatar = new SimpleDateFormat("y");
        String ano = formatar.format(data);
            return ano;
    }
    
    public String toString(){
        return ("Nome da Disciplina: "+ this.disciplina+"\n" +
                "Professor: " + this.professor+"\n"+
                "Número: " + this.numero);
    }
}