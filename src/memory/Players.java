/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memory;
import java.util.ArrayList;

/**
 *
 * @author derti
 */

public class Players {
    
    private ArrayList<Player> playerList;
    
    
    //Constructeur par défaut
    public Players(){
        this.playerList = new ArrayList<Player>();
    }
    //Constructeur de copie
    public Players(ArrayList<Player> lst){
        this.playerList = lst;
    }
    
    
    public void removePlayer(Player player){
        this.playerList.remove(player);
    }

   
    
    
    
}
