/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pessoa{
    
    public static String Escola = "DingDong Internacional School Music";
    String Nome;
    String Especialização;
    String PaisdeOrigem;
    String Idade;
    
    boolean Situação;

    public boolean isSituação() {
        return Situação;
    }

    public void setSituação(boolean Situação) {
        this.Situação = Situação;
    }
    
    public String Estado(){
        if(this.Situação == false){
            return "Pagante";   
        }else{
            return "Bolsista";
        }
    }
    
    public Pessoa(String Nome){
        this.Nome = Nome;
    }
}
