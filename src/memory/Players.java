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

public class Players{
    private ArrayList<Player> playerLst;
    
    public Players(){
        this.playerLst = new ArrayList<Player>();
    }
    
    public Players(ArrayList<Player> lst){
        this.playerLst = lst;
    }
}