/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory;

/**
 *
 * @author derti
 */
public class Player {
 
    private String name;
    private int age;
    private int victory;
    private int defaite;
    
    //Constructeur Standart
    public Player(String name_, int age_){
       this.name=name_;
       this.age=age_;
    }
    
    public int getAge(){
        return this.age;
    }
    
    //test
    public void setAge(int age){
        this.age= age;        
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getVictory(){
        return this.victory;
    }
    public void setVictory(int victory){
        this.victory=victory;
    }
    public int getDefaite(){
        return this.defaite;
    }
    public void SetDefaite(int defaite){
        this.defaite=defaite;
    }
    
    
}
