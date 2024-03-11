/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Escola {
    
    public static void main (String args[]){
        Professor p1 = new Professor ("George");
        p1.Especialização = "Battery";
        p1.PaisdeOrigem = "England";
        p1.Idade = "37";
        
        Professor p2 = new Professor ("Franklin");
        p2.Especialização = "Piano";
        p2.PaisdeOrigem = "Ukraine";
        p2.Idade = "41";
        
        Professor p3 = new Professor ("Jessie");
        p3.Especialização = "Violin";
        p3.PaisdeOrigem = "United States";
        p3.Idade = "30";
        
        Professor p4 = new Professor ("José");
        p4.Especialização = "Guitar";
        p4.PaisdeOrigem = "Spain";
        p4.Idade = "33";
        
        Professor p5 = new Professor ("Raphaela");
        p5.Especialização = "Sing";
        p5.PaisdeOrigem = "Brasil";
        p5.Idade = "32";
        
        Aluno a1 = new Aluno ("Eduarda");
        a1.Especialização = "Battery and Guitar";
        a1.PaisdeOrigem = "Brasil";
        a1.Idade = "20";
        a1.Situação = true;
        
        Aluno a2 = new Aluno ("Taylor");
        a2.Especialização = "Guitar, Sing and Piano";
        a2.PaisdeOrigem = "United States";
        a2.Idade = "22";
        a2.Situação = false;
        
        Aluno a3 = new Aluno ("Samantha");
        a3.Especialização = "Violin and Piano";
        a3.PaisdeOrigem = "United Kingdom";
        a3.Idade = "16";
        a3.Situação = false;
        
        Aluno a4 = new Aluno ("Taylan");
        a4.Especialização = "Battery and Guitar";
        a4.PaisdeOrigem = "Kazakhstan";
        a4.Idade = "26";
        a4.Situação = true;
        
        Aluno a5 = new Aluno ("Omar");
        a5.Especialização = "Violin, Sing and Piano";
        a5.PaisdeOrigem = "Saudi Arabia";
        a5.Idade = "15";
        a5.Situação = true;
        
        System.out.println("Escola: "+ Pessoa.Escola + "\n\n");
       
        System.out.println("Professor: "+p1.Nome);
        System.out.println("Especialização: "+ p1.Especialização + " Idade: "+p1.Idade + "\n");
        System.out.println("Aluno: " +a1.Nome + " Especialização: "+ a1.Especialização + " Idade: "+a1.Idade + " Situação: "+ a1.Estado());
        System.out.println("Aluno: " +a4.Nome + " Especialização: "+ a4.Especialização + " Idade: "+a4.Idade + " Situação: "+ a4.Estado() +"\n\n");
        
        System.out.println("Professor: "+p2.Nome);
        System.out.println("Especialização: "+ p2.Especialização + " Idade: "+p2.Idade + "\n");
        System.out.println("Aluno: " +a3.Nome + " Especialização: "+ a3.Especialização + " Idade: "+a3.Idade + " Situação: "+ a3.Estado());
        System.out.println("Aluno: " +a5.Nome + " Especialização: "+ a5.Especialização + " Idade: "+a5.Idade + " Situação: "+ a5.Estado() +"\n\n");
        
        System.out.println("Professor: "+p3.Nome);
        System.out.println("Especialização: "+ p3.Especialização + " Idade: "+p3.Idade + "\n");
        System.out.println("Aluno: " +a3.Nome + " Especialização: "+ a3.Especialização + " Idade: "+a3.Idade + " Situação: "+ a3.Estado());
        System.out.println("Aluno: " +a5.Nome + " Especialização: "+ a5.Especialização + " Idade: "+a5.Idade + " Situação: "+ a5.Estado() +"\n\n");
        
        System.out.println("Professor: "+p4.Nome);
        System.out.println("Especialização: "+ p4.Especialização + " Idade: "+p4.Idade + "\n");
        System.out.println("Aluno: " +a2.Nome + " Especialização: "+ a2.Especialização + " Idade: "+a2.Idade + " Situação: "+ a2.Estado());
        System.out.println("Aluno: " +a1.Nome + " Especialização: "+ a1.Especialização + " Idade: "+a1.Idade + " Situação: "+ a1.Estado() +"\n\n");
        
        System.out.println("Professor: "+p5.Nome);
        System.out.println("Especialização: "+ p5.Especialização + " Idade: "+p5.Idade + "\n");
        System.out.println("Aluno: " +a2.Nome + " Especialização: "+ a2.Especialização + " Idade: "+a2.Idade + " Situação: "+ a2.Estado());
        System.out.println("Aluno: " +a5.Nome + " Especialização: "+ a5.Especialização + " Idade: "+a5.Idade + " Situação: "+ a5.Estado() +"\n\n");
    }
}
